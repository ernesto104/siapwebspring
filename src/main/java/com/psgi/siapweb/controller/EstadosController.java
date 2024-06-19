package com.psgi.siapweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EstadosController {


    @GetMapping("/estados")
    public String getInfo(Model model){
        model.addAttribute("activePage", "info");
        return "estadosTable";
    }



    //////////////////////////////

    @GetMapping("/estadosMiembro")
    public String getEstadosMiembro(Model model){
        model.addAttribute("activePage", "info");
        return "estadosMiembroTable";
    }

    
}
