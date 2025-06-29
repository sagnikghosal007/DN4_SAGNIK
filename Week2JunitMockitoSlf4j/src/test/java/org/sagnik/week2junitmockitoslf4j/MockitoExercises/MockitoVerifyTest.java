package Week2JunitMockitoSlf4j.src.test.java.org.sagnik.week2junitmockitoslf4j.MockitoExercises;

import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;
import java.util.List;

public class MockitoVerifyTest {

    @Test
    void testVerifyInteractions() {
        List<String> mockList = mock(List.class);

        mockList.add("Java");
        mockList.add("Spring");
        mockList.clear();

        verify(mockList).add("Java");
        verify(mockList).add("Spring");
        verify(mockList).clear();
    }
}
