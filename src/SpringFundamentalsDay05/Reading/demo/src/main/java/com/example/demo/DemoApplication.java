package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}


	@RequestMapping("/")
	// 3. Method that maps to the request route above
	public String hello() { // 3
		return "Hello World!";
	}

	@RequestMapping("/new_route")
	// 3. Method that maps to the request route above
	public String newMessage() { // 3
		return "This is new";
	}
}
