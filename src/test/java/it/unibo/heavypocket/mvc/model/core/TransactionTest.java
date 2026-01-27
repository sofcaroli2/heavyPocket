package it.unibo.heavypocket.mvc.model.core;

import java.util.List;
import java.util.Set;
import java.time.LocalDate;
import java.math.BigDecimal;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

class TransactionTest {

    private Transaction transaction;
    private static final BigDecimal AMOUNT = BigDecimal.valueOf(100.0);
    private static final String DESCRIPTION = "TestTransaction";
    private static final LocalDate DATE = LocalDate.now();

    @BeforeEach
    void setUp() {
        this.transaction = new IncomeImpl(DESCRIPTION, AMOUNT, DATE);
    }

    @Test
    void testTransactionInitialization() {
        assertEquals(DESCRIPTION, transaction.getDescription());
        assertEquals(AMOUNT, transaction.getAmount());
        assertEquals(DATE, transaction.getDate());
        // assertTrue(transaction instanceof Income);
    }
}
