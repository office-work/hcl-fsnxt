package org.arpit.com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages="org.arpit.com.*")
@SpringBootApplication
public class EdepositAppApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(EdepositAppApiApplication.class, args);
	}
}
