package com.eventsphere.service;


import com.eventsphere.entity.User;
import com.eventsphere.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServices {

    @Autowired
    private UserRepository userRepository;

//    @Autowired
//    private BCryptPasswordEncoder passwordEncoder;

    // Register a new user (Sign up)
    public User registerUser(User user) {
        //user.setPassword(passwordEncoder.encode(user.getPassword())); // Encode password
        return userRepository.save(user);
    }

    // Find user by email
    public User findUserByEmail(String email) {
        return userRepository.findByEmail(email).orElseThrow(()->new RuntimeException("user not found with email :"+email));
    }

    // Fetch all users
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
}
