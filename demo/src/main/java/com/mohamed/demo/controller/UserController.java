package com.mohamed.demo.controller;

import com.mohamed.demo.Service.UserService;
import com.mohamed.demo.model.User;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    // Get all users
    @GetMapping
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }


    // Create a new user
    @PostMapping
    public String createUser(@RequestBody User user) {
        userService.addUser(user);
        return "User created successfully ! ";
    }


}
