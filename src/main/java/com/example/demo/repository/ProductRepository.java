package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import javax.persistence.*;
import java.com.example.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
}