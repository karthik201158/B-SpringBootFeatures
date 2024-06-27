package com.kartheek.email;

import com.kartheek.email.model.RegisterReq;
import com.kartheek.email.service.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class RegistrationController {

    @Autowired
    private RegisterService registerService;

    @ResponseBody
    @PostMapping("/sendemail")
    public ResponseEntity<String> registerUser(@RequestBody RegisterReq registerReq){
        return registerService.sendEmail(registerReq);
    }
}
