package com.kristyn.springboot2011;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class homeController {
    @RequestMapping("/loadform")
    public String loadFormPage(){
        return "formtemplate";
    }
    @RequestMapping("/processform")
    public String loadFormPage(@RequestParam("email") String email, Model model) {
        model.addAttribute("emailval", email);
        return "confirm";
    }
}
