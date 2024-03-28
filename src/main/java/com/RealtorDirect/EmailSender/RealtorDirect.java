package com.RealtorDirect.EmailSender;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class RealtorDirect {
    @Autowired
    private JavaMailSender mailSender;

    public void sendEmail(String toEmail, String subject, String Message){
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom("kamranislam40@gmail.com"); //email to send message
        message.setTo(toEmail);
        message.setText(Message);
        message.setSubject(subject);

        mailSender.send(message);

        System.out.println("Mail Sent!");
    }


}
