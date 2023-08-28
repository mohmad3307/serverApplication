package com.server.app.service;

import com.server.app.model.barber;
import com.server.app.repository.barberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class barberService {
    private final barberRepository barberRepository;

    @Autowired
    public barberService(barberRepository barberRepository) {
        this.barberRepository = barberRepository;
    }

    public barber saveDocument(barber document) {
        return barberRepository.save(document);
    }
}
