package com.psgi.siapweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {
    


    @GetMapping("/usersTable")
    public String getUserTable(Model model){
        //model.addAttribute("activePage", "info");
        return "usersTable";
    }
}
