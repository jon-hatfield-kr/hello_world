package com.kroger.kicapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {

    @GetMapping("/hello-world")
    //@ResponseBody
    public String helloWorld() {
        return "Hello world!";
    }
}
