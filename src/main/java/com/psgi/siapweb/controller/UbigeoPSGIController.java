package com.psgi.siapweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UbigeoPSGIController {


    @GetMapping("/ubigeoPSGI")
    public String getUbigeoPSGI(Model model){
        //model.addAttribute("activePage", "info");
        return "mainMenu/maintainMenu/ubigeoPSGI";
    }

    /*@GetMapping({"/mainMenu"})
    public String getMainMenu(Model model){
        model.addAttribute("activePage", "mainMenu");
        return "mainMenu";
    }*/ 
    
}
