package com.bezkoder.spring.thymeleaf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
//@EnableJpaRepositories(basePackages = "com.bezkoder.spring.thymeleaf")
public class SpringBootThymeleafExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootThymeleafExampleApplication.class, args);
	}

}
