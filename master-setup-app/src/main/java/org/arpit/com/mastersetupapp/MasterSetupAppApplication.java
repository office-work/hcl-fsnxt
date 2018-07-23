package org.arpit.com.mastersetupapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages="org.arpit.com.mastersetupapp.*")
@SpringBootApplication
public class MasterSetupAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(MasterSetupAppApplication.class, args);
	}
}
