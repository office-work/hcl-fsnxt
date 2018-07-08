package org.db.com.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
//@ComponentScan(basePackages = { "org.db.com.controller","org.db.com.service","org.db.com.repo","org.db.com.api","org.db.com.rest.service"  })
@ComponentScan(basePackages =  "org.db.com.*")
@EnableJpaRepositories(basePackages = {"org.db.com.repo"})
@EntityScan(basePackages="org.db.com.entity")
public class EDepositApp {
	public static void main(String[] args) {
		SpringApplication.run(EDepositApp.class, args);
	}

}
