package com.nhnacademy.edu.springframework;

import com.nhnacademy.edu.springframework.domain.User;
import com.nhnacademy.edu.springframework.sender.EmailMessageSender;
import com.nhnacademy.edu.springframework.sender.MessageSender;
import com.nhnacademy.edu.springframework.sender.SmsMessageSender;
import com.nhnacademy.edu.springframework.service.MessageSendService;

public class Main {

	public static void main(String[] args) {
		User user = new User("email.naver.com", "010-xxxx-xxxx");
		String message = "hi";

		MessageSender smsMessageSender = new SmsMessageSender();

		new MessageSendService(smsMessageSender).doSendMessage(user, message);
	}

}