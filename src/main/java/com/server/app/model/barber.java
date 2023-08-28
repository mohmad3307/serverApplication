package com.server.app.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "barbers")
public class barber {

    @Id
    private String id;

    private String name;
    private int quantity;
    private String category;

    public barber( String name, int quantity, String category) {
        super();
        this.name = name;
        this.quantity = quantity;
        this.category = category;
    }
}


