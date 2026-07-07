package com.example;

import org.junit.jupiter.api.Test;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.hamcrest.Matchers.is;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

public class UserControllerTest {

    @Test
    void testCreateUser() throws Exception {
        UserService mockUserService = mock(UserService.class);

        User user = new User(1L, "Varshith");

        when(mockUserService.saveUser(org.mockito.ArgumentMatchers.any(User.class)))
                .thenReturn(user);

        UserController userController = new UserController(mockUserService);

        MockMvc mockMvc = MockMvcBuilders.standaloneSetup(userController).build();

        mockMvc.perform(post("/users")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content("{\"id\":1,\"name\":\"Varshith\"}"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.id", is(1)))
                .andExpect(jsonPath("$.name", is("Varshith")));
    }
}