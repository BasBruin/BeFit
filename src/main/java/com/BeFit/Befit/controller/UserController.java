package com.BeFit.Befit.controller;

import com.BeFit.Befit.model.User;
import com.BeFit.Befit.repository.UserRepository;
import netscape.javascript.JSObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin
@RequestMapping("/Gymmember")
public class UserController {
    @Autowired
    private UserRepository userRepository;



    @GetMapping("/getAll")
    List<User> getallUsers() {
        return userRepository.findAll();
    }

    @DeleteMapping("/Delete/{id}")
    void DeleteUser(@PathVariable int id){
        userRepository.delete(userRepository.findById(id).orElse(null));
    }

    @PostMapping("/add")
    User newUser(@RequestBody String newUser) throws JSONException {
        final JSONObject obj = new JSONObject(newUser);
        String username = obj.getString("Name");
        int prBench = Integer.parseInt(obj.getString("PRBench"));

        User _newUser = new User();
        _newUser.setName(username);
        _newUser.setPRBench(prBench);

        return userRepository.save(_newUser);

    }
    @PatchMapping("/Update")
    User UpdateUser(@RequestBody String newUser) throws JSONException{
        final JSONObject obj = new JSONObject(newUser);
        int id = obj.getInt("id");
        String username = obj.getString("Name");
        int prBench = Integer.parseInt(obj.getString("PRBench"));

        User _newUser = new User();
        _newUser.setName(username);
        _newUser.setPRBench(prBench);
        _newUser.setId(id);

        return userRepository.save(_newUser);
    }

}
