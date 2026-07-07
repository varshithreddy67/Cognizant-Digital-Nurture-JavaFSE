package com.example;

public class ProductService {

    public Product getProductById(Long id) {
        return new Product(id, "Laptop");
    }
}