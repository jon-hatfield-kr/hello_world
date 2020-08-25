package com.kroger.kicapp.service;

import com.kroger.kicapp.model.Forecast;
import com.kroger.kicapp.repository.ForecastRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ForecastService {

    @Autowired
    ForecastRepository repository;

    public void saveForecast(Forecast forecast) {

        repository.save(forecast);
    }
}
