package com.avin.InventoryTracker.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.avin.InventoryTracker.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
    Optional<Product> findByName(String name);
}