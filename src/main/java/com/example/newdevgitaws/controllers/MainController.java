package com.example.newdevgitaws.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class MainController {

    @GetMapping("/")
    public String welcome() {
        return "Welcome";
    }

    @GetMapping("/version")
    public String Version() {
        return "Version is only a number";
    }

}

