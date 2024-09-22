package com.example.ToDo.controller;

import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ControllerMain {

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("message", "Willkommen zum funktionierenden Test!");
        return "home";
    }
}
