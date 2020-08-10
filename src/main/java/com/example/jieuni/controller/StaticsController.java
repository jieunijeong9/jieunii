package com.example.jieuni.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StaticsController {
    @GetMapping("/privacy")
    public String privacy(){
        return "statics/privacy";
    }
    @GetMapping("/terms")
    public String terms(Model model) {
        model.addAttribute("trms","이용약관");
        return "statics/terms";
    }

}
