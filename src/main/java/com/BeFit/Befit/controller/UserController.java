package com.BeFit.Befit.controller;

import com.BeFit.Befit.model.User;
import com.BeFit.Befit.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
@CrossOrigin
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/add")
    public String add(@RequestBody User user){
        userService.saveUser(user);
        return "User has been added";
    }

    @GetMapping("/getAll")
    public List<User> list() {
        return userService.getAllUsers();
    }
}
