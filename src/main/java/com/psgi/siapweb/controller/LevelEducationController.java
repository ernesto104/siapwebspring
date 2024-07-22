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

import com.psgi.siapweb.domain.model.DetalleGeneral;
import com.psgi.siapweb.domain.service.DetalleGeneralService;

@Controller
public class LevelEducationController {

    @Autowired
    DetalleGeneralService detalleGeneralService;

    @GetMapping("/levelEducation")
    public String getlevelEducation(Model model){
        //model.addAttribute("activePage", "info");
        List<DetalleGeneral> levelEducationList = detalleGeneralService.getAllDetalleGeneralByGeneralDescription("Grado de Instrucción");

        model.addAttribute("levelEducationItem", new DetalleGeneral());
        model.addAttribute("levelEducationList", levelEducationList);
        return "mainMenu/maintainMenu/levelEducation";
    }


    @GetMapping("/levelEducation/{id}"/* , params="action=saveTypeDocument"*/)
	public String editlevelEducation(@PathVariable  Long id ,Model model/* , @ModelAttribute("typeDocument") TypeDocument typeDocumentData*/) { // Nombre de typeDocument como referencia
			List<DetalleGeneral> levelEducationList =detalleGeneralService.getAllDetalleGeneralByGeneralDescription("Grado de Instrucción");
		
		//TypeDocument typeDocument=typeDocumentService.editTypeDocumentById(id_documento,typeDocumentData);

		DetalleGeneral levelEducationItem=detalleGeneralService.getDetalleGeneralById(id);
		if (levelEducationItem.getClass().equals(NoSuchElementException.class)) {
			return "redirect:/maintainMenu";
		} else {
		model.addAttribute("levelEducationItem", levelEducationItem);
		model.addAttribute("levelEducationList", levelEducationList);
		return "mainMenu/maintainMenu/levelEducation";}
	}



    @PostMapping("/saveLevelEducation")
	public String saveCLevelEducatioString(@ModelAttribute DetalleGeneral levelEducationItem) {

		String nameDetalle = "Grado de Instruccion";
		detalleGeneralService.createDetalleGeneral(levelEducationItem, nameDetalle);

		return "redirect:/levelEducation";

	}




    @PostMapping("/editLevelEducation/{id}"/* , params="action=saveTypeDocument"*/)
	public String editLevelEducationSave(@PathVariable  Long id , @ModelAttribute("levelEducationItem") DetalleGeneral levelEducationData) { // Nombre de typeDocument como referencia
		
		//new Reactive
		detalleGeneralService.editDetalleGeneralById(id,levelEducationData);
		DetalleGeneral result = detalleGeneralService.editDetalleGeneralById(id,levelEducationData);
		if (result.getClass().equals(UnsupportedOperationException.class)) {
			return "redirect:maintainMenu";
		}
		//TypeDocument typeDocument=typeDocumentService.getTypeDocumentById(id);
		//model.addAttribute("typeDocument", typeDocument);
		else {
		return "redirect:/levelEducation";
		}
	}



}
