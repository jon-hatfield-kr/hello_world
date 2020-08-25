package com.kroger.kicapp.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.multipart.MultipartFile;

@Slf4j
@Controller
public class ForecastController {

    @PostMapping("/uploadForecast")
    public ResponseEntity<String> uploadForecast(MultipartFile forecast) {

        ResponseEntity<String> response = new ResponseEntity<>(HttpStatus.OK);

        return response;
    }
}
