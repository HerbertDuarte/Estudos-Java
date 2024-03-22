package com.example.test.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.test.dtos.UserDTO;
import com.example.test.entities.UserEntity;
import com.example.test.services.UserService;
import jakarta.validation.Valid;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;


@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping()
    public ResponseEntity<UserEntity> createUser(@RequestBody @Valid UserDTO body) {

        return ResponseEntity.status(HttpStatus.CREATED).body(userService.createUser(body));
    }

    @GetMapping()
    public ResponseEntity<List<UserEntity>> listAllUsers() {
        return ResponseEntity.status(HttpStatus.OK).body(userService.listUsers());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<UserEntity>> findById(@PathVariable UUID id) {
        return ResponseEntity.status(HttpStatus.OK).body(
                userService.findOne(id));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Optional<UserEntity>> updateUser(@PathVariable UUID id) {
        return ResponseEntity.status(HttpStatus.CREATED).body(
                userService.findOne(id));
    }


}
