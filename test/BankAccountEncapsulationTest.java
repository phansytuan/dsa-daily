import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class BankAccountEncapsulationTest {

    @Test
    void exposesInitialBalance() {
        assertEquals(100.0, new BankAccountEncapsulation(100.0).getBalance(), 1e-9);
    }

    @Test
    void depositAddsToBalance() {
        BankAccountEncapsulation account = new BankAccountEncapsulation(100.0);

        account.nopTien(50.5);
        account.nopTien(0.5);

        assertEquals(151.0, account.getBalance(), 1e-9);
    }

    @Test
    void ignoresNonPositiveDeposit() {
        BankAccountEncapsulation account = new BankAccountEncapsulation(100.0);

        account.nopTien(0);
        account.nopTien(-25);

        assertEquals(100.0, account.getBalance(), 1e-9);
    }
}
