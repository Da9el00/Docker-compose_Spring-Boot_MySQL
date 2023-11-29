package com.example.springgradle.controller;

import com.example.springgradle.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/user/{id}")
    public ResponseEntity<String> getUserName(@PathVariable Long id){
        String name = userService.getUsernameById(id);
        return new ResponseEntity<>(name, HttpStatus.OK);
    }
}
