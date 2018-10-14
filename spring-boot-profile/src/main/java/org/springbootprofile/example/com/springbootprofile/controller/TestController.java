package org.springbootprofile.example.com.springbootprofile.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
	@Value(value="${spring.message.test}")
	String msg;
	
	@GetMapping(value="/test")
	public String test() {
		return msg;
	}

}
