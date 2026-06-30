package com.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class MathUtilsTest {

    @Test
    public void testAdd() {
        MathUtils mathUtils = new MathUtils();
        assertEquals(8, mathUtils.add(5, 3));
    }

    @Test
    public void testMultiply() {
        MathUtils mathUtils = new MathUtils();
        assertEquals(20, mathUtils.multiply(4, 5));
    }

    @Test
    public void testIsEven() {
        MathUtils mathUtils = new MathUtils();
        assertTrue(mathUtils.isEven(10));
        assertFalse(mathUtils.isEven(7));
    }
}