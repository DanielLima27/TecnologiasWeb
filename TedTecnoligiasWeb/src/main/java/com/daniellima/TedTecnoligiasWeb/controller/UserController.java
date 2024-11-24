package com.daniellima.TedTecnoligiasWeb.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping()
public class UserController {

    @GetMapping("/name")
    public String name(){
        return "Daniel";
    }


}