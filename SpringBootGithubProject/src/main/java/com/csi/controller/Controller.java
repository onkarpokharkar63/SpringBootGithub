package com.csi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class Controller {

    @GetMapping
    public String sayWelcome(){
        return "Hello Onkar";
    }
    @GetMapping("/address")
    public String sayAddress(){
        return "PCMC";
    }

}
