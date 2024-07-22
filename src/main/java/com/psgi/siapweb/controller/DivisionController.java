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
public class DivisionController {


    @Autowired
    DetalleGeneralService detalleGeneralService;

    @GetMapping("/division")
    public String getDivision(Model model){


        List<DetalleGeneral> divisionList = detalleGeneralService.getAllDetalleGeneralByGeneralDescription("Divisiones - Organización");

        model.addAttribute("divisionItem", new DetalleGeneral());
        model.addAttribute("divisionList", divisionList);
        model.addAttribute("activePage", "division");

        return "mainMenu/maintainMenu/divisionTable";
    }



    @GetMapping("/division/{id}"/* , params="action=saveTypeDocument"*/)
	public String editdivision(@PathVariable  Long id ,Model model/* , @ModelAttribute("typeDocument") TypeDocument typeDocumentData*/) { // Nombre de typeDocument como referencia
			List<DetalleGeneral> divisionList =detalleGeneralService.getAllDetalleGeneralByGeneralDescription("Divisiones - Organización");
		
		//TypeDocument typeDocument=typeDocumentService.editTypeDocumentById(id_documento,typeDocumentData);

		DetalleGeneral divisionItem=detalleGeneralService.getDetalleGeneralById(id);
		if (divisionItem.getClass().equals(NoSuchElementException.class)) {
			return "redirect:/maintainMenu";
		} else {
		model.addAttribute("divisionItem", divisionItem);
		model.addAttribute("divisionList", divisionList);
		return "mainMenu/maintainMenu/divisionTable";}
	}


    @PostMapping("/saveDivision")
	public String savedivision(@ModelAttribute DetalleGeneral divisionItem) {

		String nameDetalle = "Divisiones - Organización";
		detalleGeneralService.createDetalleGeneral(divisionItem, nameDetalle);

		return "redirect:/division";

	}


    @PostMapping("/editDivision/{id}"/* , params="action=saveTypeDocument"*/)
	public String editDivisionSave(@PathVariable  Long id , @ModelAttribute("divisionItem") DetalleGeneral divisionData) { // Nombre de typeDocument como referencia
		
		//new Reactive
		detalleGeneralService.editDetalleGeneralById(id,divisionData);
		DetalleGeneral result = detalleGeneralService.editDetalleGeneralById(id,divisionData);
		if (result.getClass().equals(UnsupportedOperationException.class)) {
			return "redirect:maintainMenu";
		}
		//TypeDocument typeDocument=typeDocumentService.getTypeDocumentById(id);
		//model.addAttribute("typeDocument", typeDocument);
		else {
		return "redirect:/division";
		}
	}


}
