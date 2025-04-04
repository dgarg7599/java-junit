import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UserRegistrationTest {
    UserRegistration user;

    @BeforeEach
    void setup(){
        user = new UserRegistration();
    }

    @Test
    void testValid(){
        user.registerUser("user123", "user123@mail.com", "abcxd123");
        assertEquals("user123", user.username);
        assertEquals("user123@mail.com", user.email);
        assertEquals("abcxd123", user.password);
    }

    @Test
    void invalidTest(){
        Exception exception = assertThrows(IllegalArgumentException.class, () -> user.registerUser("123user", "user123@mail.com", "abcxd123"));
        assertEquals("Illegal Arguments for User", exception.getMessage());
        exception = assertThrows(IllegalArgumentException.class, () -> user.registerUser("user123", "user123@mail.c", "abcxd123"));
        assertEquals("Illegal Arguments for User", exception.getMessage());
        exception = assertThrows(IllegalArgumentException.class, () -> user.registerUser("user123", "user123@mail.com", "123"));
        assertEquals("Illegal Arguments for User", exception.getMessage());
    }
}
