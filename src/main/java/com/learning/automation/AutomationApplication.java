package com.learning.automation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AutomationApplication {

	public static void main(String[] args) {
		System.out.println("This is the main program");
		SpringApplication.run(AutomationApplication.class, args);
		System.out.println("Test123");
	}

}
