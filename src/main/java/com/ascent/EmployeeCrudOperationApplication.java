package com.ascent;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan (basePackages = "com.ascent")
public class EmployeeCrudOperationApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeCrudOperationApplication.class, args);
	}

}
