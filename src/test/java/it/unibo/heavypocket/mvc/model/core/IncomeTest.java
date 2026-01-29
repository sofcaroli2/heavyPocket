package it.unibo.heavypocket.mvc.model.core;

import java.util.Set;
import java.time.LocalDate;
import java.math.BigDecimal;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

class IncomeTest {

    private static final BigDecimal AMOUNT = BigDecimal.valueOf(100.0);
    private static final String DESCRIPTION = "TestIncome";
    private static final LocalDate DATE = LocalDate.now();

    private Transaction transaction;

    @BeforeEach
    void setUp() {
        this.transaction = Transactions.createIncome(DESCRIPTION, AMOUNT, DATE);
    }

    @Test
    void testExpenseInitialization() {
        assertNotNull(transaction.getId());
        assertEquals(DESCRIPTION, transaction.getDescription());
        assertEquals(AMOUNT, transaction.getAmount());
        assertEquals(DATE, transaction.getDate());
    }
}
