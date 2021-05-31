package com.shar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = {"com.shar"})
@SpringBootApplication
public class ResTdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ResTdemoApplication.class, args);
	}

}