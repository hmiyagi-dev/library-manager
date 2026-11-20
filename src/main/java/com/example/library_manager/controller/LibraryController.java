package com.example.library_manager.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller 
public class LibraryController {
    @GetMapping("/hello")
    public String hello(Model model) {
        model.addAttribute("msg", "こんにちは");
        return "hello";
    }
    
}
