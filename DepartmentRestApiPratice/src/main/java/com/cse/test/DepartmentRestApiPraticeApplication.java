package com.cse.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = "com.cse.test")
public class DepartmentRestApiPraticeApplication {

	public static void main(String[] args) {
		SpringApplication.run(DepartmentRestApiPraticeApplication.class, args);
	}

}
