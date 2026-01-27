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
        this.transaction = new IncomeImpl(DESCRIPTION, AMOUNT, DATE);
    }

    @Test
    void testTransactionInitialization() {
        assertNotNull(transaction.getId());
        assertEquals(DESCRIPTION, transaction.getDescription());
        assertEquals(AMOUNT, transaction.getAmount());
        assertEquals(DATE, transaction.getDate());
    }
}
