package com.example;

import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class UserServiceTest {

    @Test
    void testGetUserById() {
        UserRepository mockRepository = mock(UserRepository.class);

        User user = new User(1L, "Varshith");
        when(mockRepository.findById(1L)).thenReturn(Optional.of(user));

        UserService userService = new UserService(mockRepository);
        User result = userService.getUserById(1L);

        assertEquals("Varshith", result.getName());
    }
}