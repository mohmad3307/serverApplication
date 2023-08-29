package com.server.app.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;


@Document(collection = "barbers")
public class barber {

    @Id
    private String id;

    private String name;
    private String number;
    private String email;
    private String username;
    private String password;
    private String firstname;
    private String lastname;
    private List<Map<String,List<Map<String,String>>>> times;
    private String openTime;
    private String closeTime;
    private List<String> breakDays;
    private List<String> hardDates;
    private String location;
    private String googleDriveImigUrl;
    private boolean normalPlan;
    private boolean reservationPlan;
    private boolean analysis;
    private String planEndDate;
    private int quantity;
    private String category;

    public barber( String name, int quantity, String category) {
        super();
        this.name = name;
        this.quantity = quantity;
        this.category = category;
    }
}


