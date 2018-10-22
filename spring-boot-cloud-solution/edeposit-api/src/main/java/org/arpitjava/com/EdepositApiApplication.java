package org.arpitjava.com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients(basePackages= {"org.arpitjava.com"})
@EnableDiscoveryClient
public class EdepositApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(EdepositApiApplication.class, args);
	}
}
