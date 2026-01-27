package it.unibo.heavypocket.mvc.model.core;

import java.time.LocalDate;
import java.util.List;
import java.math.BigDecimal;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

class WalletTest {

    private Wallet wallet;
    private Transaction transaction;
    private static final BigDecimal WALLET_AMOUNT = BigDecimal.valueOf(0.0);
    private static final String NAME = "Wallet";
    private static final List<Transaction> TRANSACTIONS = List.of();
    private static final String TRANSACTION_DESCRIPTION = "Salary";
    private static final BigDecimal TRANSACTION_AMOUNT = BigDecimal.valueOf(100.0);
    private static final LocalDate TRANSACTION_DATE = LocalDate.now();

    @BeforeEach
    void setUp() {
        this.wallet = new WalletImpl(NAME, WALLET_AMOUNT, TRANSACTIONS);
        this.transaction = new IncomeImpl(TRANSACTION_DESCRIPTION, TRANSACTION_AMOUNT, TRANSACTION_DATE);
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
        this.wallet = wallet.addTransaction(transaction);
        assertEquals(1, wallet.getTransactions().size());
        assertEquals(WALLET_AMOUNT.add(TRANSACTION_AMOUNT), wallet.getBalance());
        assertEquals(TRANSACTION_DESCRIPTION, wallet.getTransactions().get(0).getDescription());
    }

    @Test
    void testRemoveTransaction() {
        this.wallet = wallet.addTransaction(transaction);
        this.wallet = wallet.removeTransaction(transaction.getId());
        assertEquals(0, wallet.getTransactions().size());
        assertEquals(WALLET_AMOUNT, wallet.getBalance());
    }

    @Test
    void testUpdateTransaction() {
        this.wallet = wallet.addTransaction(transaction);
        final var newTransaction = new IncomeImpl("updateTransaction", BigDecimal.valueOf(200.0), TRANSACTION_DATE);
        this.wallet = wallet.updateTransaction(transaction.getId(), newTransaction);
        assertEquals(1, wallet.getTransactions().size());
        assertEquals(WALLET_AMOUNT.add(BigDecimal.valueOf(200.0)), wallet.getBalance());
        assertEquals("updateTransaction", wallet.getTransactions().get(0).getDescription());
    }
}
