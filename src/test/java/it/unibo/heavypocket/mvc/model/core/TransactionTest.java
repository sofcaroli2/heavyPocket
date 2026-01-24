package it.unibo.heavypocket.mvc.model.core;

import java.util.List;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TransactionTest {

    private Transaction transaction;

    @BeforeEach
    void setUp() {
        this.transaction = new TransactionImpl("Groceries", 150.0);
    }

    @Test
    void testTransactionInitialization() {
        assertEquals("Groceries", transaction.getDescription());
        assertEquals(150.0, transaction.getAmount());
        assertNotNull(transaction.getDate());
    }
}
