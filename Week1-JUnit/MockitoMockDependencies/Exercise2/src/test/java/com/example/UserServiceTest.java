package com.example;

import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class UserServiceTest {

    @Test
    public void testGetUserById() {
        UserRepository userRepository = mock(UserRepository.class);

        when(userRepository.findById(1L))
                .thenReturn(Optional.of(new User(1L, "Varshith")));

        UserService userService = new UserService(userRepository);

        User user = userService.getUserById(1L);

        assertEquals(1L, user.getId());
        assertEquals("Varshith", user.getName());
    }
}