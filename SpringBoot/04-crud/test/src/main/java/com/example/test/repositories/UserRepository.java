package com.example.test.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.test.entities.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, UUID> {

}
