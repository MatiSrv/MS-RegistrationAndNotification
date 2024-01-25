
package com.project.microservicesnotification.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailSenderService {

    @Autowired
    private JavaMailSender mailSender;

    public void sendEmail(String toEmail) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom("demomsbiz@gmail.com");
        message.setTo(toEmail);
        message.setText("Congratulations! You have successfully registered on the site. We're thrilled to have you on board.\r\n" + //
                "Thank you for joining our community. Feel free to explore and enjoy the features of the site");
        message.setSubject("Welcome to our site! Your Registration Was Successful!");

        mailSender.send(message);


    }
}
