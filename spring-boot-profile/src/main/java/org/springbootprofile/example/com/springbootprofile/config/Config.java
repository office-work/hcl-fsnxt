package org.springbootprofile.example.com.springbootprofile.config;

import javax.annotation.PostConstruct;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Profile(value="dev")
@Configuration
public class Config {

	@PostConstruct
	public void testConfig() {
		System.out.println("Testing dev profile");
	}
}
