package com.example;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class UserRepositoryTest {

    @Test
    void testFindByName() {
        UserRepository mockRepository = mock(UserRepository.class);

        List<User> users = List.of(
                new User(1L, "Varshith"),
                new User(2L, "Varshith")
        );

        when(mockRepository.findByName("Varshith")).thenReturn(users);

        List<User> result = mockRepository.findByName("Varshith");

        assertEquals(2, result.size());
        assertEquals("Varshith", result.get(0).getName());
    }
}