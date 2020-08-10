package com.example.jieuni.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StaticController {
    @GetMapping("/privacy")
    public String privacy(){
        return "statics/privacy";
    }

    @GetMapping("/terms")
    public String terms(){
        return "statics/terms";
    }
}
