package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTimeout;

import java.time.Duration;

public class PerformanceTesterTest {

    @Test
    void testPerformance() {
        PerformanceTester performanceTester = new PerformanceTester();

        assertTimeout(Duration.ofSeconds(1), () -> {
            performanceTester.performTask();
        });
    }
}