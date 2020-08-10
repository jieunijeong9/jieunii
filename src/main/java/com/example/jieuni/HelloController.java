package com.example.jieuni;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
    @GetMapping("/hello")
    public String hi(Model model){
        model.addAttribute("hothot", "덥니");
        return "first";
    }
}
