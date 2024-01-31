package com.nhnacademy.edu.springframework.config;

import com.nhnacademy.edu.springframework.sender.EmailMessageSender;
import com.nhnacademy.edu.springframework.sender.MessageSender;
import com.nhnacademy.edu.springframework.sender.SmsMessageSender;
import com.nhnacademy.edu.springframework.service.MessageSendService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
public class javaConfig {
	@Bean
	public MessageSender emailMessageSender(){
		return new EmailMessageSender();
	}
	@Bean
	public MessageSender smsMessageSender(){
		return new SmsMessageSender();
	}
	@Bean
	public MessageSendService messageSendService(){
		return new MessageSendService(smsMessageSender());
	}
}
