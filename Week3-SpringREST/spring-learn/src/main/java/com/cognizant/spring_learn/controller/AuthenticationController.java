package com.cognizant.spring_learn.controller;

import com.cognizant.spring_learn.jwt.AuthenticationRequest;
import com.cognizant.spring_learn.jwt.AuthenticationResponse;
import com.cognizant.spring_learn.jwt.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class AuthenticationController {

    @Autowired
    private JwtUtil jwtUtil;

    @PostMapping("/authenticate")
    public AuthenticationResponse createAuthenticationToken(
            @RequestBody AuthenticationRequest request) {

        // Dummy authentication
        if ("user".equals(request.getUsername())
                && "pwd".equals(request.getPassword())) {

            String jwt = jwtUtil.generateToken(request.getUsername());

            return new AuthenticationResponse(jwt);
        }

        throw new RuntimeException("Invalid Username or Password");
    }
}