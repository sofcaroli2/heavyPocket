package it.unibo.heavypocket.mvc.model.core;

import java.time.LocalDate;
import java.math.BigDecimal;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class TransactionTest {

    private static final BigDecimal AMOUNT = BigDecimal.valueOf(100.0);
    private static final String DESCRIPTION = "TestTransaction";
    private static final LocalDate DATE = LocalDate.now();

    private Transaction transaction;

    @BeforeEach
    void setUp() {
        this.transaction = Transactions.createIncome(DESCRIPTION, AMOUNT, DATE);
    }

    @Test
    void testTransactionInitialization() {
        assertNotNull(transaction.getId());
        assertEquals(DESCRIPTION, transaction.getDescription());
        assertEquals(AMOUNT, transaction.getAmount());
        assertEquals(DATE, transaction.getDate());
    }

    @Test
    void testTransactionEquality() {
        final Transaction anotherTransaction = Transactions.createIncome(DESCRIPTION, AMOUNT, DATE);
        assertEquals(false, transaction.equals(anotherTransaction));
        assertEquals(true, transaction.equals(transaction));
    }

    @Test
    void testTransactionHashCode() {
        final Transaction anotherTransaction = Transactions.createIncome(DESCRIPTION, AMOUNT, DATE);
        assertNotNull(transaction.hashCode());
        assertNotNull(anotherTransaction.hashCode());
        assertEquals(false, transaction.hashCode() == anotherTransaction.hashCode());
    }
}