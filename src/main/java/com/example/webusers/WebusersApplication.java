package com.example.webusers;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.example.webusers")
@EntityScan("com.example.webusers.modals")
public class WebusersApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebusersApplication.class, args);
	}
}
