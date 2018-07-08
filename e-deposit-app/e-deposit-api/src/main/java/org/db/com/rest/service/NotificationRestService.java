package org.db.com.rest.service;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/notification")
public abstract interface NotificationRestService {
	
	@GetMapping(value="/test")
	public abstract String sayHello();
	
	@GetMapping(value="/sendEmail")
	public abstract String sendEmail();
	
}
