package Week2JunitMockitoSlf4j.src.test.java.org.sagnik.week2junitmockitoslf4j.MockitoExercises;


import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;
public class MockitoBasicsTest {
    @Test
    void testMockListSize() {
        List<String> mockList = Mockito.mock(List.class);
        when(mockList.size()).thenReturn(5);

        assertEquals(5, mockList.size());
    }

    @Test
    void testVerifyMethodCall() {
        List<String> mockList = mock(List.class);
        mockList.add("Sagnik");
        mockList.clear();

        verify(mockList).add("Sagnik");
        verify(mockList).clear();
    }
}
