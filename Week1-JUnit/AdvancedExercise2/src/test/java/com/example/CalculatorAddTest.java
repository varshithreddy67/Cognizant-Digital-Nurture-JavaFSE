package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorAddTest {

    @Test
    void testAdd() {
        Calculator calculator = new Calculator();
        assertEquals(8, calculator.add(5, 3));
    }
}