package com.productms.product_micro.repository;

import com.productms.product_micro.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

    // Search products by name (case-insensitive and partial matches)
    List<Product> findByNameContainingIgnoreCase(String name);

    // Search products by category (case-insensitive)
    List<Product> findByCategoryIgnoreCase(String category);
}
