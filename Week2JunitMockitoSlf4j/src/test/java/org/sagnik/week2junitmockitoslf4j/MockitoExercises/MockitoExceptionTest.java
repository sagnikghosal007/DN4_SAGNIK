package Week2JunitMockitoSlf4j.src.test.java.org.sagnik.week2junitmockitoslf4j.MockitoExercises;

import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

import java.util.List;

public class MockitoExceptionTest {

    @Test
    void testExceptionThrowing() {
        List<String> mockList = mock(List.class);
        when(mockList.get(0)).thenThrow(new RuntimeException("Index 0 not allowed"));

        try {
            mockList.get(0);
        } catch (RuntimeException e) {
            System.out.println(e.getMessage()); // Index 0 not allowed
        }
    }
}
