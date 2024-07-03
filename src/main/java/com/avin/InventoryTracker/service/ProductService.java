package com.avin.InventoryTracker.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.avin.InventoryTracker.entity.Product;
import com.avin.InventoryTracker.repository.ProductRepository;

@Service
public class ProductService {
    @Autowired
    private ProductRepository repository;

    public List<Product> getAllProducts() {
        return repository.findAll();
    }

    public Optional<Product> getProductByName(String name) {
        return repository.findByName(name);
    }

    public Product addProduct(Product product) {
        return repository.save(product);
    }

    public List<Product> getLowStockProducts(int threshold) {
        return repository.findAll().stream()
                .filter(p -> p.getQuantity() < threshold)
                .collect(Collectors.toList());
    }
}
