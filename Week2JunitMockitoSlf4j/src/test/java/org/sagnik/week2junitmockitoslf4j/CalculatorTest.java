package org.sagnik.week2junitmockitoslf4j;

import org.sagnik.week2junitmockitoslf4j.JUnitBasicTesting.testing.Calculator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    public void setup() {
        calculator = new Calculator();
        System.out.println("Setup complete");
    }

    @Test
    public void testAddition() {
        int a = 5, b = 3;
        int result = calculator.add(a, b);
        assertEquals(8, result);
    }

    @Test
    public void testSubtraction() {
        int result = calculator.subtract(10, 4);
        assertEquals(6, result);
    }
}

