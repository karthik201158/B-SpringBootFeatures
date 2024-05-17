package com.kartheek.customvalidations.roletypes;

import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @PostMapping("/users")
    public String createUser(@Valid @RequestBody User user) {
        // Your logic to handle valid user object
        return "User created successfully";
    }
}
