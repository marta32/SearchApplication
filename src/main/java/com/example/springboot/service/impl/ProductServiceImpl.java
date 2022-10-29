package com.example.springboot.service.impl;

import com.example.springboot.entity.Product;
import com.example.springboot.repository.ProductRepository;
import com.example.springboot.service.ProductService;

import java.util.List;

public class ProductServiceImpl implements ProductService {

    private ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public List<Product> searchProducts(String query) {
        List<Product> products = productRepository.searchProducts(query);
        return products;
    }
}
