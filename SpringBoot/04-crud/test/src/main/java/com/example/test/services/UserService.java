package com.example.test.services;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.test.dtos.UserDTO;
import com.example.test.entities.UserEntity;
import com.example.test.repositories.UserRepository;

@Service
public class UserService {

 @Autowired
 private UserRepository userRository;

 public UserEntity createUser(UserDTO user) {

  var userToSave = new UserEntity();
  userToSave.setEmail(user.getEmail());
  userToSave.setName(user.getName());
  userToSave.setUsername(user.getUsername());
  userToSave.setPassword(user.getPassword());

  return userRository.save(userToSave);
 }

 public List<UserEntity> listUsers() {
  return userRository.findAll();
 }

 public Optional<UserEntity> findOne(UUID id) {
  return userRository.findById(id);
 }

 public Optional<UserEntity> updateUser(UUID id) {
  if(userRository.existsById(id)){
   
  }
 }

}
