package com.nhnacademy.edu.springframework.service;

import com.nhnacademy.edu.springframework.domain.User;
import com.nhnacademy.edu.springframework.sender.MessageSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class MessageSendService {
	@Autowired()
	@Qualifier("smsMessageSender")
	MessageSender messageSender;
	public MessageSendService(){}

	public void doSendMessage(User user, String message){
		messageSender.sendMessage(user, message);
	}
}
