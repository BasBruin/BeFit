package com.BeFit.Befit.service;

import com.BeFit.Befit.model.User;

import java.util.List;

public interface UserService {
    public User saveUser(User user);
    public List<User> getAllUsers();
}
