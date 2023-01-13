package com.BeFit.Befit.controller;

import com.BeFit.Befit.model.Group;
import com.BeFit.Befit.model.User;
import com.BeFit.Befit.repository.GroupRepository;
import com.BeFit.Befit.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@CrossOrigin
@RequestMapping("/Group")
public class GroupController {

    @Autowired
    private GroupRepository groupRepository;

    @Autowired
    private UserRepository userRepository;

    @PostMapping("/add")
    Group newGroup(@RequestBody Group newGroup){
        return groupRepository.save(newGroup);
    }

    @GetMapping("/getAll")
    List<Group> getallPartys(){

        return groupRepository.findAll();
    }

}