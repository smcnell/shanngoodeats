package com.example.shannongoodeats.shanngoodeats;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.example.shannongoodeats.shanngoodeats", "controllers"})
public class ShanngoodeatsApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShanngoodeatsApplication.class, args);
	}
}
