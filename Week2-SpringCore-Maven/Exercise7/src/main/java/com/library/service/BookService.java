package com.library.service;

import com.library.repository.BookRepository;

public class BookService {

    private BookRepository constructorRepository;
    private BookRepository setterRepository;

    public BookService(BookRepository constructorRepository) {
        this.constructorRepository = constructorRepository;
    }

    public void setSetterRepository(BookRepository setterRepository) {
        this.setterRepository = setterRepository;
    }

    public void displayBooks() {
        System.out.println("BookService: Constructor Injection Output:");
        constructorRepository.displayBooks();

        System.out.println("BookService: Setter Injection Output:");
        setterRepository.displayBooks();
    }
}