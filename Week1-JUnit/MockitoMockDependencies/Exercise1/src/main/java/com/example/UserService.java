package com.example;

public class UserService {

    public User getUserById(Long id) {
        return new User(id, "Varshith");
    }
}