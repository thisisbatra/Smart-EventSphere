package com.eventsphere.controller;


import com.eventsphere.entity.User;
import com.eventsphere.service.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/auth")
public class UserController {

    @Autowired
    private UserServices userServices;

    @PostMapping("/signup")
    public ResponseEntity<User> registerUser(@RequestBody User user) {
        User savedUser = userServices.registerUser(user);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedUser);
    }

//    @PostMapping("/login")
//    public ResponseEntity<String> loginUser(@RequestBody LoginRequest loginRequest) {
//        // Authentication logic will be implemented here
//        return ResponseEntity.ok("Login successful");
//    }

    @GetMapping("/users")
    public ResponseEntity<List<User>> getAllUsers() {
        List<User> users = userServices.getAllUsers();
        return ResponseEntity.ok(users);
    }
}

