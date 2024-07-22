package com.psgi.siapweb.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.psgi.siapweb.domain.model.Demarcacion;
import com.psgi.siapweb.domain.model.DetalleGeneral;
import com.psgi.siapweb.domain.model.MaestroPSGI;
import com.psgi.siapweb.domain.model.TypeDocument;
import com.psgi.siapweb.domain.service.DemarcacionService;
import com.psgi.siapweb.domain.service.DetalleGeneralService;
import com.psgi.siapweb.domain.service.MaestroPSGIService;


@Controller
public class MaestroPSGIController {
    

    @Autowired
    private MaestroPSGIService maestroPSGIService;

    @Autowired
    private DemarcacionService demarcacionService;

    @Autowired
    private DetalleGeneralService detalleGeneralService;


    @GetMapping("/registerPersonalDataForm")
    public String getPersonalDataRegisterForm(Model model){
        

        List<DetalleGeneral> detalleGeneralsEducation = detalleGeneralService.getAllDetalleGeneralByEducation(8L);
        //List<DetalleGeneral> detalleGeneralsEducation = detalleGeneralService.getAllDetalleGeneral();

        List<Demarcacion> demarcacions = demarcacionService.getAllDemarcacion();

            List<String> elementsDemarcacion = Arrays.asList("codigo", "demarcacion");

            List<List<String>> ele = new ArrayList<>();
            for (Demarcacion demarcacion : demarcacions) {
                elementsDemarcacion = Arrays.asList(demarcacion.getCodigo(), demarcacion.getDemarcacion());
                ele.add(elementsDemarcacion);
            }
        
        
            MaestroPSGI maestroPSGI= new MaestroPSGI();
            DetalleGeneral detalleGeneral = new DetalleGeneral();
            detalleGeneral.setId(32L);
            maestroPSGI.setId_dg_grado_instruccion(detalleGeneral);



        model.addAttribute("educations", detalleGeneralsEducation);
        model.addAttribute("demarcacions",ele);
        model.addAttribute("activePage", "info");
        model.addAttribute("registerData", maestroPSGI);
        return "mainMenu/registroDataPersonalMenu/personalDataRegisterForm";
    }

    @GetMapping("/registerPersonalDataTable")
    public String getAllPersonalDataRegisterInitialTable(Model model, @RequestParam(defaultValue = "", name = "nombreCompleto") String NombreCompleto){
        List<MaestroPSGI> maestroPSGIs = maestroPSGIService.getAllMaestroPSGIByCompleteName(NombreCompleto);

        model.addAttribute("maestroPSGIs", maestroPSGIs);
        //model.addAttribute("NombreCompleto", NombreCompleto);
        System.out.println("\n "+NombreCompleto);
        model.addAttribute("activePage", "info");
        return "mainMenu/registroDataPersonalMenu/personalDataRegisterTable";
    }




    @PostMapping("/registerPersonalDataTableSearch")
    public String getAllPersonalDataRegisterSearchTable(Model model, @Param("NombreCompleto") String NombreCompleto){
        List<MaestroPSGI> maestroPSGIs = maestroPSGIService.getAllMaestroPSGIByCompleteName(NombreCompleto);


        model.addAttribute("maestroPSGIs", maestroPSGIs);
        model.addAttribute("activePage", "info");
        return "redirect:registerPersonalDataTable";
    }


    @GetMapping("/editPersonalRegister/{id}"/* , params="action=saveTypeDocument"*/)
	public String editypeDocument(@PathVariable  Long id ,Model model/* , @ModelAttribute("typeDocument") TypeDocument typeDocumentData*/) { // Nombre de typeDocument como referencia
			MaestroPSGI maestroPsgi = maestroPSGIService.getMaestroPSGIById(id);
            List<DetalleGeneral> detalleGeneralsEducation = detalleGeneralService.getAllDetalleGeneralByEducation(8L);
            List<Demarcacion> demarcacions = demarcacionService.getAllDemarcacion();

            List<String> elementsDemarcacion = Arrays.asList("codigo", "demarcacion");

            List<List<String>> ele = new ArrayList<>();
            for (Demarcacion demarcacion : demarcacions) {
                elementsDemarcacion = Arrays.asList(demarcacion.getCodigo(), demarcacion.getDemarcacion());
                ele.add(elementsDemarcacion);
            }


		
		//TypeDocument typeDocument=typeDocumentService.editTypeDocumentById(id_documento,typeDocumentData);

		//TypeDocument typeDocument=typeDocumentService.getTypeDocumentById(id);
		if (maestroPsgi.getClass().equals(NoSuchElementException.class)) {
            
			return "redirect:/maintainMenu";
		} else {
		//model.addAttribute("typeDocument", typeDocument);

        if(maestroPsgi.getId_dg_grado_instruccion() ==null){
            DetalleGeneral detalleGeneral = new DetalleGeneral();
            detalleGeneral.setId(32L);
            maestroPsgi.setId_dg_grado_instruccion(detalleGeneral);
        }

        model.addAttribute("educations", detalleGeneralsEducation);
        model.addAttribute("demarcacions",ele);



		//model.addAttribute("maestroPsgi", maestroPsgi);
        model.addAttribute("registerData", maestroPsgi);
		return "mainMenu/registroDataPersonalMenu/personalDataRegisterForm";}
	}


}
