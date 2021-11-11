package com.aka.recette.controller;

import com.aka.recette.domain.User;
import com.aka.recette.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/users", name = "UsersController", produces = MediaType.APPLICATION_JSON_VALUE)
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public ResponseEntity<?> create (@RequestBody User user) {
        User userSaved = userService.save(user);
        return ResponseEntity.ok(userSaved);
    }
}
