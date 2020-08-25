package com.kroger.kicapp.model;


import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.AccessLevel;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;

@Data
@Entity
public class Forecast {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private String storeId;

    @NotNull
    private Long productId;

    @NotNull
    private Float quantity;

    @NotNull
    private SimpleDateFormat targetDeliveryDate = new SimpleDateFormat("MM-dd-yyyy");

    @NotNull
    private String userId;

    @NotNull
    private String status;

    @NotNull
    private Timestamp lastUpdatedAt;

    @Getter(AccessLevel.NONE)
    @Setter(AccessLevel.NONE)
    private ObjectMapper mapper = new ObjectMapper();

    //@OneToMany(mappedBy = "id")
    //private List<ProductForecast> productForecasts = new ArrayList<ProductForecast>();


    public String toJson() {
        try {
            return mapper.writeValueAsString(this);
        }
        catch(Exception ex) {
            return "";
        }
    }
}
