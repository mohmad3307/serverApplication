package com.server.app.repository;

import com.server.app.model.barber;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface barberRepository extends MongoRepository<barber, String> {

    @Query("{name:'?0'}")
    barber findItemByName(String name);

    @Query(value="{category:'?0'}", fields="{'name' : 1, 'quantity' : 1}")
    List<barber> findAll(String category);

    public long count();

}
