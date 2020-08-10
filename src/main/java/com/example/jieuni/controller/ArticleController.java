package com.example.jieuni.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ArticleController {
    @GetMapping("/articles")
    public String articles(){
        return "index/articles";
    }

}
