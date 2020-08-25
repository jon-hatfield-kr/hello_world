package com.kroger.kicapp.service;

import com.kroger.kicapp.exceptions.InvalidForcastException;
import com.kroger.kicapp.model.Forecast;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class ForecastValidator {
    public Forecast validate(MultipartFile forecastFile) throws InvalidForcastException {

        return new Forecast();
    }
}
