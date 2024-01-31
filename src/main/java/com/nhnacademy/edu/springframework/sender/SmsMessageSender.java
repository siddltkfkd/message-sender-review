package com.nhnacademy.edu.springframework.sender;

import com.nhnacademy.edu.springframework.domain.User;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile({"dev", "default"})
public class SmsMessageSender implements MessageSender{
	@Override
	public void sendMessage(User user, String message) {
		System.out.println(user.getPhoneNumber() + " - " + message);
	}
}
