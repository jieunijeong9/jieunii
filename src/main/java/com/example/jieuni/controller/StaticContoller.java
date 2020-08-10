package com.example.jieuni.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StaticContoller {
    // Privacy 화면 보여줘
    @GetMapping("/privacy")
    public String privacy(Model model){
        model.addAttribute("pri","개인정보입니다");
        return "statics/privacy";
    }

    // Terms 화면 보여줘
    @GetMapping("/terms")
    public String terms(Model model){
        model.addAttribute("ter","약관입니다");
        return "statics/terms";
    }
}
