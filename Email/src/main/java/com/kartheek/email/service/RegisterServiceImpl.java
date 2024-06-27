package com.kartheek.email.service;

import com.kartheek.email.EmailSenderService;
import com.kartheek.email.model.RegisterReq;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.stereotype.Service;

@Service
public class RegisterServiceImpl implements RegisterService {

    @Autowired
    private EmailSenderService emailSenderService;

   @Override
    public ResponseEntity<String> sendEmail(RegisterReq user) {
        SimpleMailMessage mailMessage = new SimpleMailMessage();
        mailMessage.setTo(user.getEmail());
        mailMessage.setSubject("Complete Registration!");
        mailMessage.setText("To confirm your account, please click here : "
                +"http://localhost:8081/api/register/confirm-account?token=");
        emailSenderService.sendEmail(mailMessage);
        return new ResponseEntity<>("Verify email by the link sent on your email address", HttpStatus.OK);
    }

}
