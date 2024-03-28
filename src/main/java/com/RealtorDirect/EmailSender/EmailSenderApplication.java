package com.RealtorDirect.EmailSender;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class EmailSenderApplication {
	@Autowired

	private RealtorDirect senderService;
	public static void main(String[] args) {
		SpringApplication.run(EmailSenderApplication.class, args);
	}
	@EventListener(ApplicationReadyEvent.class)
	public void sendMail(){
		senderService.sendEmail("kamranislam40@gmail.com ", "Looking for a Realtor?", "I hope this message finds you well! I wanted to reach out and share some exciting real estate opportunities tailored to your preferences. From prime locations to personalized service, we're here to help you find your dream home. Let's chat and explore your options!");
	}
}

