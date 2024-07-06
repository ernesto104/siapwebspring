package com.psgi.siapweb.controller;

import java.util.List;
import java.util.NoSuchElementException;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.psgi.siapweb.domain.model.Demarcacion;
import com.psgi.siapweb.domain.service.DemarcacionService;
import com.psgi.siapweb.resources.DemarcacionDto;

@Controller
public class UbigeoPSGIController {


    @Autowired
    private DemarcacionService demarcacionService;

    @Autowired
    private ModelMapper mapper;


    @GetMapping("/ubigeoPSGI")
    public String getUbigeoPSGI(Model model){
        //model.addAttribute("activePage", "info");

        List<DemarcacionDto> demarcacions = demarcacionService.getAllDemarcacion().stream().map(this::convertToDto).toList();
        model.addAttribute("demarcaciones", demarcacions);

        return "mainMenu/maintainMenu/ubigeoPSGI";
    }

    /*@GetMapping({"/mainMenu"})
    public String getMainMenu(Model model){
        model.addAttribute("activePage", "mainMenu");
        return "mainMenu";
    }*/ 


    private DemarcacionDto convertToDto(Demarcacion entity) {
        DemarcacionDto demarcacionDto = mapper.map(entity, DemarcacionDto.class);


        //long demarcacionIndex = entity.getDemarcacion_padre();

        //String vcCodigo = entity.getCodigo();




        String regionName = entity.getDemarcacion();
        String areaName = entity.getDemarcacion();
        String zonaName = entity.getDemarcacion();
        String sectorName = entity.getDemarcacion();
        String grupoName = entity.getDemarcacion();

        for (int i = 0; i <= entity.getDemarcacion_padre(); i++) {
            
            if( i == 1) {
                String vcCodigo = entity.getCodigo();
                vcCodigo = vcCodigo.substring(0, 4);
                Demarcacion demarcacionRegion = demarcacionService.getDemarcacionByVcCodigo(vcCodigo);
                regionName = demarcacionRegion.getDemarcacion();

                demarcacionDto.setRegion(regionName);
            }


            if( i == 2  ) {
                String vcCodigo = entity.getCodigo();
                vcCodigo = vcCodigo.substring(0, 7);
                Demarcacion demarcacionArea = demarcacionService.getDemarcacionByVcCodigo(vcCodigo);
                areaName = demarcacionArea.getDemarcacion();

                demarcacionDto.setArea(areaName);
            }

             
            if( i == 3) {
                String vcCodigo = entity.getCodigo();
                vcCodigo = vcCodigo.substring(0, 10);
                Demarcacion demarcacionZona = demarcacionService.getDemarcacionByVcCodigo(vcCodigo);
                zonaName = demarcacionZona.getDemarcacion();

                demarcacionDto.setZona(zonaName);
            }


            if( i == 4) {
                String vcCodigo = entity.getCodigo();
                //vcCodigo= "0101001001001";
                vcCodigo = vcCodigo.substring(0, 13);
                Demarcacion demarcacionSector = demarcacionService.getDemarcacionByVcCodigo(vcCodigo);
                
                if(demarcacionSector == null ) {
                    demarcacionDto.setSector(" ");
                } else {
                    sectorName = demarcacionSector.getDemarcacion();

                    demarcacionDto.setSector(sectorName);
                }
                
            }


            if(  i == 5) {
                String vcCodigo = entity.getCodigo();
                int countCodigo = vcCodigo.length();
                if(countCodigo == 16){
                    vcCodigo = vcCodigo.substring(0, 16);
                } else {
                    vcCodigo = vcCodigo.substring(0, 17);
                }
                Demarcacion demarcacionGrupo = demarcacionService.getDemarcacionByVcCodigo(vcCodigo);

                if(demarcacionGrupo == null ) {
                    demarcacionDto.setGrupo(" ");
                } else {
                    grupoName = demarcacionGrupo.getDemarcacion();

                    demarcacionDto.setGrupo(grupoName);
                }
                
            }
        }

        return demarcacionDto;
    }
    
}
