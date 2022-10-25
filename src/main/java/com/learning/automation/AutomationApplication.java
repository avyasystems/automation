package com.learning.automation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AutomationApplication {

	public static void main(String[] args) {
		System.out.println("This is the main program");
		System.out.println("You can see this line because it is updating in Git");
		SpringApplication.run(AutomationApplication.class, args);
	}

}
