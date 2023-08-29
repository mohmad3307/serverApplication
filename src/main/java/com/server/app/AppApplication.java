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
		System.out.println("***************** the data added *****************" +
				"\n name : Whole Wheat Biscuit" +
				"\n quantity : 5" +
				"\n category : snacks");
		groceryItemRepo.save(new barber( "Whole Wheat Biscuit", 5, "snacks"));
		System.out.println("***************** the data added *****************" +
				"\n name : XYZ Kodo Millet healthy" +
				"\n quantity : 2" +
				"\n category : millets");
		groceryItemRepo.save(new barber( "XYZ Kodo Millet healthy", 2, "millets"));
		System.out.println("***************** the data added *****************" +
				"\n name : Dried Whole Red Chilli" +
				"\n quantity : 2" +
				"\n category : spices");
		groceryItemRepo.save(new barber( "Dried Whole Red Chilli", 2, "spices"));
		System.out.println("***************** the data added *****************" +
				"\n name : Healthy Pearl Millet" +
				"\n quantity : 1" +
				"\n category : millets");
		groceryItemRepo.save(new barber( "Healthy Pearl Millet", 1, "millets"));
		System.out.println("***************** the data added *****************" +
				"\n name : Bonny Cheese Crackers Plain" +
				"\n quantity : 6" +
				"\n category : snacks");
		groceryItemRepo.save(new barber( "Bonny Cheese Crackers Plain", 6, "snacks"));
		System.out.println("**************************************************");
		System.out.println("Data creation complete...");
	}

	@Override
	public void run(String... args) throws Exception {
		createGroceryItems();
	}
}
