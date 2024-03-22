package com.example.test.controllers;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.test.dtos.UserDTO;
import com.example.test.entities.UserEntity;
import com.example.test.services.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/user")
public class UserController {

 @Autowired
 private UserService userService;

 @PostMapping()
 public ResponseEntity<UserEntity> createUser(@RequestBody @Valid UserDTO body) {

  return ResponseEntity.status(HttpStatus.CREATED).body(userService.createUser(body));

 }

}
