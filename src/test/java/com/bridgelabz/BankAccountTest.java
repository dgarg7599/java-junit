import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BankAccountTest {

    private BankAccount account;

    @BeforeEach
    void setUp() {
        account = new BankAccount();
    }

    @Test
    void testDeposit() {
        account.deposit(100);
        assertEquals(100, account.getBalance());
    }

    @Test
    void testWithdraw() {
        account.deposit(200);
        account.withdraw(50);
        assertEquals(150, account.getBalance());
    }

    @Test
    void testWithdraw_InsufficientFunds_ShouldThrowException() {
        assertThrows(IllegalArgumentException.class, () -> account.withdraw(100));
    }
}
