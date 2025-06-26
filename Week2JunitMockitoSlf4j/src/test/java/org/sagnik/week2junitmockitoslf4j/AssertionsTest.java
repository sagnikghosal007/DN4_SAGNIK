package org.sagnik.week2junitmockitoslf4j;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AssertionsTest {
    @Test
    public void testAssertions() {
        System.out.println("Running Assertions Test...");

        assertEquals(5, 2 + 3);             // Equals
        assertTrue(5 > 3);                  // True
        assertFalse(5 < 3);                 // False
        assertNull(null);                  // Null
        assertNotNull("JUnit is awesome!"); // Not null
    }
}

