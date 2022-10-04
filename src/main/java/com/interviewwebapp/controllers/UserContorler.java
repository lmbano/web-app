package com.interviewwebapp.controllers;


import com.interviewwebapp.models.User;
import com.interviewwebapp.repos.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class UserContorler {

    @Autowired
    private UserRepository userRepository;


    @GetMapping("/user")
    public List<User> retrieveAllUsers() {
        return userRepository.findAll();
    }

}
