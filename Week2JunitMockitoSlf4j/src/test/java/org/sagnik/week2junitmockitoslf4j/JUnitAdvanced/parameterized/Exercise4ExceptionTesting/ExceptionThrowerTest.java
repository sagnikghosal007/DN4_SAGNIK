package org.sagnik.week2junitmockitoslf4j.JUnitAdvanced.parameterized.Exercise4ExceptionTesting;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ExceptionThrowerTest {

    @Test
    void testThrowsException() {
        ExceptionThrower thrower = new ExceptionThrower();
        assertThrows(IllegalArgumentException.class, () -> {
            thrower.throwException(null);
        });
    }

    @Test
    void testDoesNotThrow() {
        ExceptionThrower thrower = new ExceptionThrower();
        assertDoesNotThrow(() -> {
            thrower.throwException("valid");
        });
    }
}
