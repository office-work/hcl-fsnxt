package org.db.com.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages =  "org.db.com.*")
public class NotificationBootApp {

	public static void main(String[] args) {
		SpringApplication.run(NotificationBootApp.class, args);
	}

}