package com.kroger.kicapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloWorld {

    @GetMapping("/hello-world")
    //@ResponseBody
    public String helloWorld() {
        return "Hello world!";
    }
}
