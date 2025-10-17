package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

@Controller
public class HomeController {
    @GetMapping("/hallo")
    @ResponseBody
    public String hallo() {
        return "Hallo Welt!";
    }

    @GetMapping("/home")
    public String home() {
        return "home";
    }

    @GetMapping("/form")
    public String form() {
        return "form";
    }

    @GetMapping("/processform")
    @ResponseBody
    public String processform(@RequestParam Map<String, String> form) {
        return "formprocessed: " + form;
    }
}
