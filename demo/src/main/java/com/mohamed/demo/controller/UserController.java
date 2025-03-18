package com.mohamed.demo.controller;

import com.mohamed.demo.Service.UserService;
import com.mohamed.demo.model.LoginRequest;
import com.mohamed.demo.model.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody LoginRequest login ) {
        User user = userService.loginUser(login.getEmail(), login.getPassword());
        if(user != null){
            return ResponseEntity.ok("user Logged in");
        }
        return  ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid credentials");

    }

}
