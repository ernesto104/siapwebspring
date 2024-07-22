package com.psgi.siapweb.controller;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.psgi.siapweb.domain.model.Profesion;
import com.psgi.siapweb.domain.model.TypeDocument;
import com.psgi.siapweb.domain.service.ProfessionService;

@Controller
public class ProfessionController {

    @Autowired
    private ProfessionService professionService;

    @GetMapping("/professions")
    public String getProfessions(Model model){
        //model.addAttribute("activePage", "maintainMenu");

        List<Profesion> profesions = professionService.getAllprofesion();

		model.addAttribute("profesion", new Profesion());
        model.addAttribute("profesiones", profesions);

        
        return "mainMenu/maintainMenu/professions";
    }



    @GetMapping("/professions/{id}"/* , params="action=saveTypeDocument"*/)
	public String editProfession(@PathVariable  Long id ,Model model/* , @ModelAttribute("typeDocument") TypeDocument typeDocumentData*/) { // Nombre de typeDocument como referencia
			List<Profesion> professions = professionService.getAllprofesion();
		
		//TypeDocument typeDocument=professionervice.editTypeDocumentById(id_documento,typeDocumentData);

		Profesion profesion=professionService.getProfesionById(id);
		if (profesion.getClass().equals(NoSuchElementException.class)) {
			return "redirect:/maintainMenu";
		} else {
		model.addAttribute("profesion", profesion);
		model.addAttribute("profesiones", professions);
		return "mainMenu/maintainMenu/professions";}
	}


    @PostMapping(value="/saveProfession"/* , params="action=saveTypeDocument"*/)
	public String saveProfesion(@ModelAttribute("profesion") Profesion profesion) { // Nombre de typeDocument como referencia
		professionService.createprofesion(profesion);
		return "redirect:/professions";  // put url in GetMapping, not location of file
	}



    @PostMapping("/editSaveProfession/{id}"/* , params="action=saveTypeDocument"*/)
	public String editProfesionSave(@PathVariable  Long id , @ModelAttribute("profesion") Profesion professionData) { // Nombre de typeDocument como referencia
		
		//new Reactive
		professionService.editprofesionById(id,professionData);
		Profesion result = professionService.editprofesionById(id,professionData);
		if (result.getClass().equals(UnsupportedOperationException.class)) {
			return "redirect:maintainMenu";
		}
		//TypeDocument typeDocument=typeDocumentService.getTypeDocumentById(id);
		//model.addAttribute("typeDocument", typeDocument);
		else {
		return "redirect:/professions";
		}
	}
}
