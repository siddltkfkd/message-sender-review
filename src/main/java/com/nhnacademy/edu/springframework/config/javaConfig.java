package com.nhnacademy.edu.springframework.config;

import com.nhnacademy.edu.springframework.sender.EmailMessageSender;
import com.nhnacademy.edu.springframework.sender.MessageSender;
import com.nhnacademy.edu.springframework.sender.SmsMessageSender;
import com.nhnacademy.edu.springframework.service.MessageSendService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class javaConfig {
	@Autowired
	@Qualifier("smsMessageSender")
	private MessageSender messageSender;
	@Bean
	public MessageSender emailMessageSender(){
		return new EmailMessageSender();
	}
	@Bean
	public MessageSender smsMessageSender(){
		return new SmsMessageSender();
	}

	// 방법 1
	@Bean
	public MessageSendService messageSendService(){
		return new MessageSendService(smsMessageSender());
	}

	// 방법 2
	@Bean
	public MessageSendService messageSendService2(){
		return new MessageSendService(messageSender);
	}
}