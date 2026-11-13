package com.example.adder;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class AdderTest {

    @Test
    void addTwoNumbers() {
        assertEquals(8, Adder.add(3, 5));
    }

    @Test
    void handlesIntegerBoundariesPredictably() {
        assertEquals(Integer.MAX_VALUE, Adder.add(Integer.MAX_VALUE, 0));
        assertEquals(Integer.MIN_VALUE, Adder.add(Integer.MIN_VALUE, 0));
    }
}
