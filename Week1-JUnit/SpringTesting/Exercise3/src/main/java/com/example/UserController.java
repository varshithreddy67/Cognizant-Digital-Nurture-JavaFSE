package com.example;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

   @GetMapping("/{id}")
public ResponseEntity<User> getUser(@PathVariable("id") Long id) {
    return ResponseEntity.ok(userService.getUserById(id));
}
}