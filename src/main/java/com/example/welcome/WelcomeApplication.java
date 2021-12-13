package com.example.welcome;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class WelcomeApplication {

	public static void main(String[] args) {
		SpringApplication.run(WelcomeApplication.class, args);

	}

	@GetMapping("/welcome")
	public String hello() {
		return "Hello Sandhya";
	}

}
