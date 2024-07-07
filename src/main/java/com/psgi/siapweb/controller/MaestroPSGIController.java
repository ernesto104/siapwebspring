package com.psgi.siapweb.controller;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.psgi.siapweb.domain.model.MaestroPSGI;
import com.psgi.siapweb.domain.model.TypeDocument;
import com.psgi.siapweb.domain.service.MaestroPSGIService;


@Controller
public class MaestroPSGIController {
    

    @Autowired
    private MaestroPSGIService maestroPSGIService;


    @GetMapping("/registerPersonalDataForm")
    public String getPersonalDataRegisterForm(Model model){
        model.addAttribute("activePage", "info");
        return "mainMenu/registroDataPersonalMenu/personalDataRegisterForm";
    }

    @GetMapping("/registerPersonalDataTable")
    public String getAllPersonalDataRegisterInitialTable(Model model){
        List<MaestroPSGI> maestroPSGIs = maestroPSGIService.getAllMaestroPSGI();

        model.addAttribute("maestroPSGIs", maestroPSGIs);
        model.addAttribute("activePage", "info");
        return "mainMenu/registroDataPersonalMenu/personalDataRegisterTable";
    }



    @GetMapping("/editPersonalRegister/{id}"/* , params="action=saveTypeDocument"*/)
	public String editypeDocument(@PathVariable  Long id ,Model model/* , @ModelAttribute("typeDocument") TypeDocument typeDocumentData*/) { // Nombre de typeDocument como referencia
			MaestroPSGI maestroPsgi = maestroPSGIService.getMaestroPSGIById(id);
		
		//TypeDocument typeDocument=typeDocumentService.editTypeDocumentById(id_documento,typeDocumentData);

		//TypeDocument typeDocument=typeDocumentService.getTypeDocumentById(id);
		if (maestroPsgi.getClass().equals(NoSuchElementException.class)) {
			return "redirect:/maintainMenu";
		} else {
		//model.addAttribute("typeDocument", typeDocument);
		model.addAttribute("maestroPsgi", maestroPsgi);
		return "mainMenu/personalDataRegisterForm/typedocument";}
	}


}
