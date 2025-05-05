package com.user_management.exception_handling.controller;

import com.user_management.exception_handling.model.User;
import com.user_management.exception_handling.service.UserService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<String> getUser(@PathVariable Long id){
        String user = userService.getUserById(id);
        return ResponseEntity.ok(user);
    }

    @PostMapping
    public ResponseEntity<String> createUser(@Valid @RequestBody User user){
        return ResponseEntity.ok("User Created: " +user.getName());
    }
}
