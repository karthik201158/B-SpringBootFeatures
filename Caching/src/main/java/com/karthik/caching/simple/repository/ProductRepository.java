package com.karthik.caching.simple.repository;


import com.karthik.caching.simple.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
