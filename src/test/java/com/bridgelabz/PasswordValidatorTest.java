import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class PasswordValidatorTest {

    @ParameterizedTest
    @ValueSource(strings = {"StrongP@ss1", "Valid123A"})
    void testValidPasswords(String password) {
        assertTrue(PasswordValidator.isValid(password));
    }

    @ParameterizedTest
    @ValueSource(strings = {"short", "noDigits", "NOLOWERCASE"})
    void testInvalidPasswords(String password) {
        assertFalse(PasswordValidator.isValid(password));
    }
}
