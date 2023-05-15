package com.javatechie.azure.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringAzureDemo2Application {

	@GetMapping("/message")
	public String message(){
		return "Congrats! Your app has successfully been deployed in MS Azure Cloud!";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringAzureDemo2Application.class, args);
	}

}
