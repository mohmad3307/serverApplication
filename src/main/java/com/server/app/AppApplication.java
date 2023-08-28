package com.server.app;

import com.server.app.model.barber;
import com.server.app.repository.barberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
public class AppApplication implements CommandLineRunner {

	@Autowired
	barberRepository groceryItemRepo;
	public static void main(String[] args) {
		SpringApplication.run(AppApplication.class, args);

	}
	public void createGroceryItems() {
		System.out.println("Data creation started...");
		groceryItemRepo.save(new barber( "Whole Wheat Biscuit", 5, "snacks"));
		groceryItemRepo.save(new barber( "XYZ Kodo Millet healthy", 2, "millets"));
		groceryItemRepo.save(new barber( "Dried Whole Red Chilli", 2, "spices"));
		groceryItemRepo.save(new barber( "Healthy Pearl Millet", 1, "millets"));
		groceryItemRepo.save(new barber( "Bonny Cheese Crackers Plain", 6, "snacks"));
		System.out.println("Data creation complete...");
	}

	@Override
	public void run(String... args) throws Exception {
		createGroceryItems();
	}
}
