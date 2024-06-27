package com.kartheek.email.service;

import com.kartheek.email.model.RegisterReq;
import org.springframework.http.ResponseEntity;

public interface RegisterService {
    ResponseEntity<String> sendEmail(RegisterReq user);
}
