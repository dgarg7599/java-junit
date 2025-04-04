import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class DateFormatterTest {
    @Test
    public void validTest(){
        assertEquals("03-04-2025",DateFormatter.formatDate("2025-04-03"));
    }

    @Test
    public void invalidTest(){
        Exception exception = assertThrows(IllegalArgumentException.class, () -> DateFormatter.formatDate("2025/04/03"));
        assertEquals("Wrong Input Date", exception.getMessage());
    }
}
