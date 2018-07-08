package org.db.com.service;

import org.springframework.stereotype.Service;

@Service
public class NotificationServiceImpl implements NotificationService{

	@Override
	public String sendEmail() {
		return "Email Successfully Sent.";
	}

	
}
