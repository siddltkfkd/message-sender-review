package com.nhnacademy.edu.springframework.sender;

import com.nhnacademy.edu.springframework.domain.User;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("real")
public class EmailMessageSender implements MessageSender{
	@Override
	public void sendMessage(User user, String message) {
		System.out.println(user.getEmail() + " - " + message);
	}
}
