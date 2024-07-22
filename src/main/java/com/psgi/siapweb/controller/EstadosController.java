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
public class EstadosController {


    @Autowired
    DetalleGeneralService detalleGeneralService;


    @GetMapping("/estados")
    public String getEstados(Model model){


        

        model.addAttribute("activePage", "info");
        return "mainMenu/maintainMenu/estadosMenu/estadosTable";
    }


 

    //////////////////////////////

    @GetMapping("/estadosMiembro")
    public String getEstadosMiembro(Model model){


        List<DetalleGeneral> estadosMiembroList = detalleGeneralService.getAllDetalleGeneralByGeneralDescription("Estado Miembro");

        model.addAttribute("estadosMiembroItem", new DetalleGeneral());
        model.addAttribute("estadosMiembroList", estadosMiembroList);

        model.addAttribute("activePage", "info");
        return "mainMenu/maintainMenu/estadosMenu/estadosMiembroTable";
    }


    @GetMapping("/estadosMiembro/{id}"/* , params="action=saveTypeDocument"*/)
	public String editestados(@PathVariable  Long id ,Model model/* , @ModelAttribute("typeDocument") TypeDocument typeDocumentData*/) { // Nombre de typeDocument como referencia
			List<DetalleGeneral> estadosMiembroList = detalleGeneralService.getAllDetalleGeneralByGeneralDescription("Estado Miembro");
		
		//TypeDocument typeDocument=typeDocumentService.editTypeDocumentById(id_documento,typeDocumentData);

		DetalleGeneral estadosMiembroItem = detalleGeneralService.getDetalleGeneralById(id);
		if (estadosMiembroItem.getClass().equals(NoSuchElementException.class)) {
			return "redirect:/maintainMenu";
		} else {
		model.addAttribute("estadosMiembroItem", estadosMiembroItem);
		model.addAttribute("estadosMiembroList", estadosMiembroList);
		return "mainMenu/maintainMenu/estadosMenu/estadosMiembroTable";}
	}


    @PostMapping("/saveEstadosMiembro")
	public String saveEstados(@ModelAttribute DetalleGeneral estadosMiembroItem) {

		String nameDetalle = "Estado Miembro";
		detalleGeneralService.createDetalleGeneral(estadosMiembroItem, nameDetalle);

		return "redirect:/estadosMiembro";

	}


    @PostMapping("/editEstadosMiembro/{id}"/* , params="action=saveTypeDocument"*/)
	public String editEstadosSave(@PathVariable  Long id , @ModelAttribute("estadosMiembroItem") DetalleGeneral estadosMiembroData) { // Nombre de typeDocument como referencia
		
		//new Reactive
		detalleGeneralService.editDetalleGeneralById(id,estadosMiembroData);
		DetalleGeneral result = detalleGeneralService.editDetalleGeneralById(id,estadosMiembroData);
		if (result.getClass().equals(UnsupportedOperationException.class)) {
			return "redirect:maintainMenu";
		}
		//TypeDocument typeDocument=typeDocumentService.getTypeDocumentById(id);
		//model.addAttribute("typeDocument", typeDocument);
		else {
		return "redirect:/estadosMiembro";
		}
	}
    
}
