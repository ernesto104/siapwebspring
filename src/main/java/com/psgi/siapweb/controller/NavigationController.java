package com.psgi.siapweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


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
        return "mainMenu";
    }

    @GetMapping("/maintainMenu")
    public String getMaintainMenu(Model model){
        //model.addAttribute("activePage", "maintainMenu");
        return "maintainMenu";
    }


    @GetMapping("/typedocument")
    public String getTypeDocument(Model model){
        //model.addAttribute("activePage", "maintainMenu");
        return "typedocument";
    }
}
