package com.cognizant.library;

public class LibraryTest {

    public static void main(String[] args) {

        Book[] books = {
                new Book(101, "Java Programming", "James Gosling"),
                new Book(102, "Python Basics", "Guido van Rossum"),
                new Book(103, "Data Structures", "Narasimha Karumanchi")
        };

        Book[] sortedBooks = {
                new Book(103, "Data Structures", "Narasimha Karumanchi"),
                new Book(101, "Java Programming", "James Gosling"),
                new Book(102, "Python Basics", "Guido van Rossum")
        };

        LibraryManager manager = new LibraryManager();

        System.out.println("Linear Search Result:");
        Book result1 = manager.linearSearch(books, "Python Basics");

        if (result1 != null) {
            result1.displayBook();
        } else {
            System.out.println("Book not found.");
        }

        System.out.println("\nBinary Search Result:");
        Book result2 = manager.binarySearch(sortedBooks, "Java Programming");

        if (result2 != null) {
            result2.displayBook();
        } else {
            System.out.println("Book not found.");
        }
    }
}