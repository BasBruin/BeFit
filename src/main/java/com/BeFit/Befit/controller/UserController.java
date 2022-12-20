package com.BeFit.Befit.controller;

import com.BeFit.Befit.model.User;
import com.BeFit.Befit.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/Gymmember")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @PostMapping("/add")
    User newUser(@RequestBody User gymMember){
        return userRepository.save(gymMember);
    }

    @GetMapping("/getAll")
    List<User> getallUsers() {
        return userRepository.findAll();
    }
}
