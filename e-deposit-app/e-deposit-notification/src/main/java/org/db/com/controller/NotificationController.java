package org.db.com.controller;

import org.db.com.rest.service.NotificationRestService;
import org.db.com.service.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class NotificationController implements NotificationRestService {

	@Autowired
	NotificationService notificationService;
	
	
	@Override
	public String sayHello() {
		return "hi..";
	}

	@Override
	public String sendEmail() {
		return notificationService.sendEmail();
	}

}
