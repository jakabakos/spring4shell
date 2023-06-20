package com.spring4shell;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HelloController {

    @GetMapping("/hello")
    public String helloForm(Model model) {
        model.addAttribute("hello", new DemoObject());
        return "index";
    }

    @PostMapping("/hello")
    public String helloSubmit(@ModelAttribute DemoObject hello, Model model) {
        return "index";
    }

}
