package com.kroger.kicapp.controller;

import com.kroger.kicapp.exceptions.InvalidForcastException;
import com.kroger.kicapp.model.Forecast;
import com.kroger.kicapp.service.ForecastService;
import com.kroger.kicapp.service.ForecastValidator;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.multipart.MultipartFile;

@Slf4j
@Controller
public class ForecastController {

    @Autowired
    ForecastService forecastService;

    @Autowired
    ForecastValidator forecastValidator;

    @PostMapping("/uploadForecast")
    public ResponseEntity<String> uploadForecast(MultipartFile forecastFile) {
        ResponseEntity<String> response;

        log.info("Validating received forecast file");

        try {
            Forecast forecast = forecastValidator.validate(forecastFile);

            log.info("Saving forecast #" + forecast.getId());
            log.debug("Forecast: " + forecast.toJson());
            forecastService.saveForecast(forecast);

            response = new ResponseEntity<>(HttpStatus.OK);

        }
        catch(InvalidForcastException invalidForcastException) {
            log.error("The received forecast failed validation");
            response = new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

        return response;
    }
}
