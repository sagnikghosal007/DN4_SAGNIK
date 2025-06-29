package Week2JunitMockitoSlf4j.src.test.java.org.sagnik.week2junitmockitoslf4j.MockitoExercises;

import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

public class MockitoStubbingTest {

    @Test
    void testStubMethodReturnValue() {
        List<String> mockList = mock(List.class);

        when(mockList.get(0)).thenReturn("Mockito");
        when(mockList.get(1)).thenReturn("Test");

        assertEquals("Mockito", mockList.get(0));
        assertEquals("Test", mockList.get(1));
        assertNull(mockList.get(2)); // default stub
    }
}

