package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import javax.persistence.*;
import java.com.example.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
}