package com.csi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class ApplicationController {

    @GetMapping
    public String sayHello(){
        return "WELCOME TO FINTECH CREADIT SYSTEM INDIA";
    }
    @GetMapping("/address")
    public String address(){
        return "PUNE MH INDIA";

    }
}
