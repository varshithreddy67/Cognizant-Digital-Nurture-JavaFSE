package com.cognizant.inventory;

public class InventoryTest {

    public static void main(String[] args) {

        InventoryManager manager = new InventoryManager();

        manager.addProduct(new Product(101, "Laptop", 10, 55000));
        manager.addProduct(new Product(102, "Mouse", 50, 500));
        manager.addProduct(new Product(103, "Keyboard", 25, 1200));

        System.out.println("\nInventory List:");
        manager.displayInventory();

        manager.updateProduct(102, "Wireless Mouse", 40, 750);

        System.out.println("\nAfter Update:");
        manager.displayInventory();

        manager.deleteProduct(103);

        System.out.println("\nAfter Delete:");
        manager.displayInventory();
    }
}