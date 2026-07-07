package com.example;

import org.junit.jupiter.api.Test;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;

public class ProductControllerTest {

    @Test
    public void testGetProduct() throws Exception {
        ProductService productService = mock(ProductService.class);

        when(productService.getProductById(1))
                .thenReturn(new Product(1, "Laptop", 55000.0));

        ProductController productController = new ProductController(productService);

        MockMvc mockMvc = MockMvcBuilders.standaloneSetup(productController).build();

        mockMvc.perform(get("/products/1"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.id").value(1))
                .andExpect(jsonPath("$.name").value("Laptop"))
                .andExpect(jsonPath("$.price").value(55000.0));
    }
}