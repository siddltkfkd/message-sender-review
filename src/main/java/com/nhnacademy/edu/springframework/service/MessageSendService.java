package com.nhnacademy.edu.springframework.service;

import com.nhnacademy.edu.springframework.domain.User;
import com.nhnacademy.edu.springframework.sender.MessageSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class MessageSendService {
	MessageSender messageSender;
	public MessageSendService(MessageSender messageSender){
		this.messageSender = messageSender;
	}

	public void doSendMessage(User user, String message){
		messageSender.sendMessage(user, message);
	}
}
