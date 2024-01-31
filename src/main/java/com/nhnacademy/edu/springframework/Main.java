package com.nhnacademy.edu.springframework;

import com.nhnacademy.edu.springframework.domain.User;
import com.nhnacademy.edu.springframework.sender.MessageSender;
import com.nhnacademy.edu.springframework.sender.SmsMessageSender;
import com.nhnacademy.edu.springframework.service.MessageSendService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		User user = new User("email.naver.com", "010-xxxx-xxxx");
		String message = "hi";

		try(ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml")){
			context.getBean("messageSendService", MessageSendService.class).doSendMessage(user, message);
		}
	}

}