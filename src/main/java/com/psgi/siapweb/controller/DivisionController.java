package com.psgi.siapweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DivisionController {


    @GetMapping("/division")
    public String getInfo(Model model){
        model.addAttribute("activePage", "division");
        return "divisionTable";
    }

}
