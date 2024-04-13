package com.kartheek.email;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class RegisterServiceImpl {

    @Autowired
    private EmailSenderService emailSenderService;


    public ResponseEntity<String> sendEmail(String userEmail) {
        SimpleMailMessage mailMessage = new SimpleMailMessage();
        mailMessage.setTo(userEmail);
        mailMessage.setSubject("Complete Registration!");
        mailMessage.setText("To confirm your account, please click here : "
                +"http://localhost:8081/api/register/confirm-account?token=");
        emailSenderService.sendEmail(mailMessage);
        return new ResponseEntity<>("Verify email by the link sent on your email address", HttpStatus.OK);
    }

}
