package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringDemoController {

    @GetMapping("/home")
    public String home(){
        return "home";
    }
}
