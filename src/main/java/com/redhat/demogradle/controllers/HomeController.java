package com.redhat.demogradle.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @Value("${output.message}")
    private String message;

    @RequestMapping("/")
    public String home() {
        String result = this.message + " Third time around";
        return result;
    }

}