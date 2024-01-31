package com.nhnacademy.edu.springframework.service;

import com.nhnacademy.edu.springframework.domain.User;
import com.nhnacademy.edu.springframework.sender.MessageSender;

public class MessageSendService {
	MessageSender messageSender;

	public MessageSendService(){}
	public MessageSendService(MessageSender messageSender){
		this.messageSender = messageSender;
	}

	public void setMessageSender(MessageSender messageSender) {
		this.messageSender = messageSender;
	}

	public void doSendMessage(User user, String message){
		messageSender.sendMessage(user, message);
	}
}
