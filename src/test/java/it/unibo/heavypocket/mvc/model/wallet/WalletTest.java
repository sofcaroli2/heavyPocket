package it.unibo.heavypocket.mvc.model.wallet;

import java.util.List;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class WalletTest {

    private Wallet wallet;

    @BeforeEach
    void setUp() {
       this.wallet = new WalletImpl("Wallet", 0.0, List.of());
    }

    @Test
    void testWalletInitialization() {
        assertEquals("Wallet", wallet.getName());
        assertEquals(0.0, wallet.getBalance());
        assertNotNull(wallet.getTransactions());
        assertTrue(wallet.getTransactions().isEmpty());
    }

    @Test
    void testAddTransaction() {
        final var transaction = new TransactionImpl("Salary", 1000.0);
        wallet.addTransaction(transaction);
        assertEquals(1, wallet.getTransactions().size());
        assertEquals(1000.0, wallet.getBalance());
        assertEquals("Salary", wallet.getTransactions().get(0).getDescription());
    }
}
