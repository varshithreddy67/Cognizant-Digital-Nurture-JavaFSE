package com.cognizant.search;

public class SearchTest {

    public static void main(String[] args) {

        Product[] products = {
                new Product(101, "Laptop", "Electronics"),
                new Product(102, "Mouse", "Accessories"),
                new Product(103, "Keyboard", "Accessories"),
                new Product(104, "Monitor", "Electronics")
        };

        Product[] sortedProducts = {
                new Product(103, "Keyboard", "Accessories"),
                new Product(101, "Laptop", "Electronics"),
                new Product(104, "Monitor", "Electronics"),
                new Product(102, "Mouse", "Accessories")
        };

        SearchService searchService = new SearchService();

        System.out.println("Linear Search Result:");
        Product result1 = searchService.linearSearch(products, "Keyboard");

        if (result1 != null) {
            result1.displayProduct();
        } else {
            System.out.println("Product not found.");
        }

        System.out.println("\nBinary Search Result:");
        Product result2 = searchService.binarySearch(sortedProducts, "Monitor");

        if (result2 != null) {
            result2.displayProduct();
        } else {
            System.out.println("Product not found.");
        }
    }
}