package org.example.calculator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SumCalculatorTest {
    private SumCalculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new SumCalculator();
    }

    @Test
    void given1_whenSum_thenReturns1() {
        assertEquals(1, calculator.sum(1));
    }

    @Test
    void given3_whenSum_thenReturns6() {
        assertEquals(6, calculator.sum(3));
    }

    @Test
    void given0_whenSum_thenThrowsIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class, () -> calculator.sum(0));
    }
}