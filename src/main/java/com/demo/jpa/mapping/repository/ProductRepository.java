package com.demo.jpa.mapping.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.jpa.mapping.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

}
