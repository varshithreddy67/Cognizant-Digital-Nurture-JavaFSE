package com.example;

public class ProductService {

    public Product getProductById(int id) {
        return new Product(id, "Laptop", 55000.0);
    }
}