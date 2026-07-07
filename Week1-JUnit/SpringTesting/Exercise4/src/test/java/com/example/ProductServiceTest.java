package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProductServiceTest {

    @Test
    void testFullFlow() {
        ProductService productService = new ProductService();

        Product product = productService.getProductById(1L);

        assertEquals(1L, product.getId());
        assertEquals("Laptop", product.getName());
    }
}