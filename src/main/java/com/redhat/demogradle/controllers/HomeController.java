package com.redhat.demogradle.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping("/")
    public String home() {
        String result = "Hello OpenShift World!\nSecond time around\n";
        return result;
    }

}