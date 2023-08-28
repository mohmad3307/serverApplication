package com.server.app.controller;


import com.server.app.model.barber;
import com.server.app.service.barberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class barberDecumentController {
    private final barberService barberService;

    @Autowired
    public barberDecumentController(barberService barberService) {
        this.barberService = barberService;
    }

    @PostMapping("/documents")
    public barber createDocument(@RequestBody barber barber) {
        return barberService.saveDocument(barber);
    }
}
