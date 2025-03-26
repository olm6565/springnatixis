package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import javax.persistence.*;
import java.com.example.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
}