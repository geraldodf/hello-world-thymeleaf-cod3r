package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class PrimeiroController {

    @GetMapping("/hello-world")
    public String HelloWorld(){
        return "hello";
    }

    @GetMapping("/dinamico/{msg}")
    public String dinamico(Model model, @PathVariable String msg){
        model.addAttribute("msg", msg);
        return "hello";
    }
}
