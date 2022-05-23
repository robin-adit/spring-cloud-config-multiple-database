package com.robin.controller;

import com.robin.entity.User;
import com.robin.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @PutMapping("/add")
    public User addUser(@RequestBody User user)
    {
        User createdUser = userService.addUser(user);
        System.out.println("In Controller Class -- Created User " + createdUser.toString());
        return createdUser;
    }

    @GetMapping("/user/{id}")
    public User getUserById(@PathVariable("id") Long id)
    {

        return userService.getUserById(id);
    }
}
