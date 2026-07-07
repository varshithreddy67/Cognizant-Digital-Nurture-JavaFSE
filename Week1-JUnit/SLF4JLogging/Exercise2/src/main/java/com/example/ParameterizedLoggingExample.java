package com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ParameterizedLoggingExample {

    private static final Logger logger =
            LoggerFactory.getLogger(ParameterizedLoggingExample.class);

    public static void main(String[] args) {

        String username = "Varshith";
        int userId = 101;

        logger.info("User {} with ID {} has logged in successfully", username, userId);

        logger.warn("User {} with ID {} has exceeded the warning limit", username, userId);

        logger.error("Error occurred while processing user {} with ID {}", username, userId);
    }
}