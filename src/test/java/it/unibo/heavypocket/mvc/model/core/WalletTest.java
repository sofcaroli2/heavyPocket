package it.unibo.heavypocket.mvc.model.core;

import java.time.LocalDate;
import java.math.BigDecimal;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

class WalletTest {

    private static final BigDecimal WALLET_AMOUNT = BigDecimal.ZERO;
    private static final String NAME = "Wallet";
    private static final String TRANSACTION_DESCRIPTION = "Salary";
    private static final BigDecimal TRANSACTION_AMOUNT = BigDecimal.valueOf(100.0);
    private static final LocalDate TRANSACTION_DATE = LocalDate.now();
    private static final String UPDATE_DESCRIPTION = "Updated Salary";
    private static final BigDecimal UPDATE_AMOUNT = BigDecimal.valueOf(200.0);

    private Wallet wallet;
    private Transaction transaction;

    @BeforeEach
    void setUp() {
        this.wallet = Wallets.createWallet(NAME);
        this.transaction = Transactions.createIncome(TRANSACTION_DESCRIPTION, TRANSACTION_AMOUNT, TRANSACTION_DATE);
    }

    @Test
    void testWalletInitialization() {
        assertEquals(NAME, wallet.getName());
        assertEquals(0, wallet.getBalance().compareTo(WALLET_AMOUNT));
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
        assertEquals(0, wallet.getBalance().compareTo(WALLET_AMOUNT));
    }

    @Test
    void testUpdateTransaction() {
        this.wallet = wallet.addTransaction(transaction);
        final var newTransaction = Transactions.createIncome(UPDATE_DESCRIPTION, UPDATE_AMOUNT, TRANSACTION_DATE);
        this.wallet = wallet.updateTransaction(transaction.getId(), newTransaction);
        assertEquals(1, wallet.getTransactions().size());
        assertEquals(WALLET_AMOUNT.add(UPDATE_AMOUNT), wallet.getBalance());
        assertEquals(UPDATE_DESCRIPTION, wallet.getTransactions().get(0).getDescription());
    }
}
