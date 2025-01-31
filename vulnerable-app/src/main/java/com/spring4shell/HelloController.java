package com.spring4shell;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HelloController {

    @GetMapping("/")
    public String home(Model model) {
        return "index";
    }

    @PostMapping("/hello")
    public String welcome(
    		@ModelAttribute DemoObject demo) {
        return "index";
    }

}
