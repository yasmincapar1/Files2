package com.filerepository.repository;

import com.filerepository.repository.repository.entity.Product;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RepositoryApplication {

	public static void main(String[] args) {
		//this is the main method where you run the program from
		SpringApplication.run(RepositoryApplication.class, args);

	}
	public void trial(){
		//builder helps us create an object
		Product product=Product.builder().name("username6").price(45748).build();
		//Product product1=Product.builder().name("computer2").price(799).build();



	}


}
