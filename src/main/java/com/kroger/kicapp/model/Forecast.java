package com.kroger.kicapp.model;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
@Entity
public class Forecast {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String storeId;
    private Date targetDeliveryDate;
    private String userId;
    private String status;
    private Timestamp lastUpdatedAt;

    private List<ProductForecast> productForecasts = new ArrayList<ProductForecast>();


}
