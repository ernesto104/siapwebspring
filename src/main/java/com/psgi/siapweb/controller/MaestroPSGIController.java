package com.psgi.siapweb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.psgi.siapweb.domain.model.MaestroPSGI;
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






}
