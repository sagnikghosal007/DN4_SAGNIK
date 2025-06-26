package org.sagnik.week2junitmockitoslf4j.JUnitAdvanced.parameterized.Exercise4ExceptionTesting;

public class ExceptionThrower {
    public void throwException(String input) {
        if (input == null) {
            throw new IllegalArgumentException("Input cannot be null");
        }
    }
}

