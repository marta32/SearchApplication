package com.example.springboot.service;

import com.example.springboot.entity.Product;
import com.example.springboot.repository.ProductRepository;

import java.util.List;

public interface ProductService {
    List<Product> searchProducts(String query);
}