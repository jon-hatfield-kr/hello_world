package com.kroger.kicapp.model;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
@Entity
public class Forecast {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private String storeId;

    @NotNull
    private SimpleDateFormat targetDeliveryDate = new SimpleDateFormat("MM-dd-yyyy");

    @NotNull
    private String userId;

    @NotNull
    private String status;

    @NotNull
    private Timestamp lastUpdatedAt;

    //@OneToMany(mappedBy = "id")
    private List<ProductForecast> productForecasts = new ArrayList<ProductForecast>();


    public String toJson() {
        return null;
    }
}
