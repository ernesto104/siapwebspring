package com.psgi.siapweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MaestroPSGIController {

    @GetMapping("/registerPersonalDataForm")
    public String getPersonalDataRegisterForm(Model model){
        model.addAttribute("activePage", "info");
        return "mainMenu/registroDataPersonalMenu/personalDataRegisterForm";
    }

}
