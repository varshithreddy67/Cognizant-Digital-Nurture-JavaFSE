package com.example;

import java.util.NoSuchElementException;

public class UserService {

    public User getUserById(Long id) {
        throw new NoSuchElementException("User not found");
    }
}