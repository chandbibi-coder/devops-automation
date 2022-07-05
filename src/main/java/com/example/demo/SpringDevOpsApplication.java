package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringDevOpsApplication {

	@GetMapping
	public String message() {
		return "hello";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(SpringDevOpsApplication.class, args);
	}

}
