package com.nhnacademy.edu.springframework.service;

import com.nhnacademy.edu.springframework.domain.User;
import com.nhnacademy.edu.springframework.sender.MessageSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class MessageSendService {
	private MessageSender messageSender;

	public MessageSendService(){}
	@Autowired
	public MessageSendService(MessageSender messageSender){
		this.messageSender = messageSender;
	}


	public void doSendMessage(User user, String message){
		messageSender.sendMessage(user, message);
	}
}
