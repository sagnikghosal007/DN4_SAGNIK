package Week2JunitMockitoSlf4j.src.test.java.org.sagnik.week2junitmockitoslf4j.MockitoExercises;

import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;
import static org.mockito.ArgumentMatchers.*;

import java.util.Map;

public class MockitoArgumentMatcherTest {

    @Test
    void testWithArgumentMatchers() {
        Map<String, String> mockMap = mock(Map.class);

        when(mockMap.get(anyString())).thenReturn("Mocked Value");

        System.out.println(mockMap.get("Hello")); // Mocked Value
        System.out.println(mockMap.get("World")); // Mocked Value
    }
}

