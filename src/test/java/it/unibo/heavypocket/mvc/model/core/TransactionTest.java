package it.unibo.heavypocket.mvc.model.core;

import java.util.List;
import java.util.Set;
import java.time.LocalDate;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TransactionTest {

    private Transaction transaction;
    private final double AMOUNT = 100.0;
    private final String DESCRIPTION = "TestTransaction";
    private final LocalDate DATE = LocalDate.now();

    @BeforeEach
    void setUp() {
        this.transaction = new IncomeImpl(DESCRIPTION, AMOUNT, DATE);
    }

    @Test
    void testTransactionInitialization() {
        assertEquals(DESCRIPTION, transaction.getDescription());
        assertEquals(AMOUNT, transaction.getAmount());
        assertEquals(DATE, transaction.getDate());
        assertTrue(transaction instanceof Income);
    }
}
