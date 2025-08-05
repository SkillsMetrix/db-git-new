package com.db.db_springcore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com")
public class DbSpringcoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(DbSpringcoreApplication.class, args);
	}

}
