package it.unibo.heavypocket.mvc.model.core;

import java.time.LocalDate;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class WalletTest {

    private Wallet wallet;
    private final double WALLET_AMOUNT = 0.0;
    private final String NAME = "Wallet";
    private final List<Transaction> TRANSACTIONS = List.of();
    private final String TRANSACTION_DESCRIPTION = "Salary";
    private final double TRANSACTION_AMOUNT = 100.0;
    private final LocalDate TRANSACTION_DATE = LocalDate.now();

    @BeforeEach
    void setUp() {
       this.wallet = new WalletImpl(NAME, WALLET_AMOUNT, TRANSACTIONS);
    }

    @Test
    void testWalletInitialization() {
        assertEquals(NAME, wallet.getName());
        assertEquals(WALLET_AMOUNT, wallet.getBalance());
        assertNotNull(wallet.getTransactions());
        assertTrue(wallet.getTransactions().isEmpty());
    }

    @Test
    void testAddTransaction() {
        final var transaction = new IncomeImpl(TRANSACTION_DESCRIPTION, TRANSACTION_AMOUNT, TRANSACTION_DATE);
        this.wallet = wallet.addTransaction(transaction);
        assertEquals(1, wallet.getTransactions().size());
        assertEquals(WALLET_AMOUNT + TRANSACTION_AMOUNT, wallet.getBalance());
        assertEquals(TRANSACTION_DESCRIPTION, wallet.getTransactions().get(0).getDescription());
    }
}
