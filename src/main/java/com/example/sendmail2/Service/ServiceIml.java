package com.example.sendmail2.Service;

import com.example.sendmail2.Constants;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;

@org.springframework.stereotype.Service
public class ServiceIml implements Service{
    private final JavaMailSender emailSender;

    public ServiceIml(JavaMailSender emailSender) {
        this.emailSender = emailSender;
    }

    @Override
    public void sendmail() {
        SimpleMailMessage message = new SimpleMailMessage();

        message.setTo(Constants.FRIEND_EMAIL);
        message.setSubject("Test Simple Email");
        message.setText("mail 13");

        // Send Message!
        emailSender.send(message);
    }
}
