package com.cognizant.sorting;

public class SortingTest {

    public static void main(String[] args) {

        Order[] orders = {

                new Order(101, "Rahul", 5500),

                new Order(102, "Varshith", 2300),

                new Order(103, "Anil", 8900),

                new Order(104, "Krishna", 4100)

        };

        SortingService sorting = new SortingService();

        System.out.println("Bubble Sort:");

        sorting.bubbleSort(orders);

        sorting.display(orders);

        Order[] orders2 = {

                new Order(101, "Rahul", 5500),

                new Order(102, "Varshith", 2300),

                new Order(103, "Anil", 8900),

                new Order(104, "Krishna", 4100)

        };

        System.out.println("\nQuick Sort:");

        sorting.quickSort(orders2, 0, orders2.length - 1);

        sorting.display(orders2);
    }
}