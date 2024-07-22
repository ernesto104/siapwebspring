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
import com.psgi.siapweb.domain.model.TypeDocument;
import com.psgi.siapweb.domain.repository.DetalleGeneralRepository;
import com.psgi.siapweb.domain.service.DetalleGeneralService;
import org.springframework.web.bind.annotation.RequestBody;


@Controller
public class ConditionJuridicaController {

    @Autowired
    DetalleGeneralService detalleGeneralService;

    @GetMapping("/juridicaCondition")
    public String getConditionsJuridica(Model model){

        List<DetalleGeneral> condicionJuridicaList = detalleGeneralService.getAllDetalleGeneralByGeneralDescription("Estado Civil");

        model.addAttribute("condicionJuridicaItem", new DetalleGeneral());
        model.addAttribute("condicionJuridicaList", condicionJuridicaList);
        //model.addAttribute("activePage", "info");
        return "mainMenu/maintainMenu/juridicaCondition";
    }



    @GetMapping("/juridicaCondition/{id}"/* , params="action=saveTypeDocument"*/)
	public String editcondicionJuridica(@PathVariable  Long id ,Model model/* , @ModelAttribute("typeDocument") TypeDocument typeDocumentData*/) { // Nombre de typeDocument como referencia
			List<DetalleGeneral> condicionJuridicaList =detalleGeneralService.getAllDetalleGeneralByGeneralDescription("Estado Civil");
		
		//TypeDocument typeDocument=typeDocumentService.editTypeDocumentById(id_documento,typeDocumentData);

		DetalleGeneral condicionjuridicaItem=detalleGeneralService.getDetalleGeneralById(id);
		if (condicionjuridicaItem.getClass().equals(NoSuchElementException.class)) {
			return "redirect:/maintainMenu";
		} else {
		model.addAttribute("condicionJuridicaItem", condicionjuridicaItem);
		model.addAttribute("condicionJuridicaList", condicionJuridicaList);
		return "mainMenu/maintainMenu/juridicaCondition";}
	}
	


	@PostMapping("/saveCondicionJuridica")
	public String saveCondicionJuridica(@ModelAttribute DetalleGeneral condicionJuridicaItem) {

		String nameDetalle = "Estado Civil";
		detalleGeneralService.createDetalleGeneral(condicionJuridicaItem, nameDetalle);

		return "redirect:/juridicaCondition";

	}

    @PostMapping("/editJuridicaCondition/{id}"/* , params="action=saveTypeDocument"*/)
	public String editCondicionJuridicaSave(@PathVariable  Long id , @ModelAttribute("condicionJuridicaItem") DetalleGeneral condicionJuridicaData) { // Nombre de typeDocument como referencia
		
		//new Reactive
		detalleGeneralService.editDetalleGeneralById(id,condicionJuridicaData);
		DetalleGeneral result = detalleGeneralService.editDetalleGeneralById(id,condicionJuridicaData);
		if (result.getClass().equals(UnsupportedOperationException.class)) {
			return "redirect:maintainMenu";
		}
		//TypeDocument typeDocument=typeDocumentService.getTypeDocumentById(id);
		//model.addAttribute("typeDocument", typeDocument);
		else {
		return "redirect:/juridicaCondition";
		}
	}
}
