package com.psgi.siapweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProgramsController {


    @GetMapping("/programs")
    public String getControlSystem(Model model){
        //model.addAttribute("activePage", "maintainMenu");
        return "programsTable";
    }
}
