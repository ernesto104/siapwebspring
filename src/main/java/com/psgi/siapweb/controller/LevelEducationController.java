package com.psgi.siapweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LevelEducationController {

    @GetMapping("/levelEducation")
    public String getUbigeoPSGI(Model model){
        //model.addAttribute("activePage", "info");
        return "mainMenu/maintainMenu/levelEducation";
    }

}
