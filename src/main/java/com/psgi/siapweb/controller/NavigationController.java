package com.psgi.siapweb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.psgi.siapweb.domain.model.TypeDocument;
import com.psgi.siapweb.domain.service.TypeDocumentService;


@Controller
public class NavigationController {




    @GetMapping("/info")
    public String getInfo(Model model){
        model.addAttribute("activePage", "info");
        return "info";
    }

    @GetMapping({"/mainMenu"})
    public String getMainMenu(Model model){
        model.addAttribute("activePage", "mainMenu");
        return "mainMenu/mainMenu";
    }

    @GetMapping("/maintainMenu")
    public String getMaintainMenu(Model model){
        //model.addAttribute("activePage", "maintainMenu");
        return "mainMenu/maintainMenu/maintainMenu";
    }

    @GetMapping("/recoverPass")
    public String getRecoverPass(Model model){
        //model.addAttribute("activePage", "maintainMenu");
        return "recoverPass";
    }


    /*@GetMapping("/typedocument")
    public String getTypeDocument(Model model){
        //model.addAttribute("activePage", "maintainMenu");
        return "typedocument";
    }*/


    @GetMapping("/controlSystem")
    public String getControlSystem(Model model){
        //model.addAttribute("activePage", "maintainMenu");
        return "mainMenu/maintainMenu/controlSystem";
    }



}
