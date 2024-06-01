package com.psgi.siapweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RolesController {


    @GetMapping("/roles")
        public String getControlSystem(Model model){
            //model.addAttribute("activePage", "maintainMenu");
            return "rolesTable";
        }

}
