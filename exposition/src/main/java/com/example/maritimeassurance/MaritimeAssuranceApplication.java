package com.example.maritimeassurance;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(value = "com.example")
@EnableJpaRepositories("com.example")
@EntityScan("com.example")
public class MaritimeAssuranceApplication{

	public static void main(String[] args) {
		System.out.println("test");
		SpringApplication.run(MaritimeAssuranceApplication.class, args);
	}

}
