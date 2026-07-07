package com.example;

import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class UserServiceTest {

    @Test
    void testMissingUserThrowsException() {
        UserRepository mockRepository = mock(UserRepository.class);

        when(mockRepository.findById(1L)).thenReturn(Optional.empty());

        UserService userService = new UserService(mockRepository);

        assertThrows(NoSuchElementException.class, () -> {
            userService.getUserById(1L);
        });
    }
}