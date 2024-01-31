package com.nhnacademy.edu.springframework;

import com.nhnacademy.edu.springframework.domain.User;

public class Main {
	// main에 sendMessage를 계속 만들면 기능이 추가 될 때 마다 메소드를 만들고 다시 컴파일 해 줘야 한다.
	// MessageSender를 만들자.
	public static void main(String[] args) {
		User user = new User("email.naver.com", "010-xxxx-xxxx");
		String message = "hi";
		Main main = new Main();
		main.sendSmsMessage(user, message);
		main.sendEmailMessage(user, message);
	}

	private void sendSmsMessage(User user, String message){
		System.out.println(user.getPhoneNumber() + " - " + message);
	}

	private void sendEmailMessage(User user, String message){
		System.out.println(user.getEmail() + " - " + message);

	}
}