package it.unibo.heavypocket.mvc.model.core;

import java.util.Set;
import java.time.LocalDate;
import java.math.BigDecimal;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ExpenseTest {

    private static final BigDecimal AMOUNT = BigDecimal.valueOf(100.0);
    private static final String DESCRIPTION = "TestExpense";
    private static final LocalDate DATE = LocalDate.now();
    private static final Set<Tag> TAGS = Set.of(new TagImpl("Food"));

    private Transaction transaction;

    @BeforeEach
    void setUp() {
        this.transaction = new ExpenseImpl(DESCRIPTION, AMOUNT, DATE, TAGS);
    }

    @Test
    void testExpenseInitialization() {
        assertNotNull(transaction.getId());
        assertEquals(DESCRIPTION, transaction.getDescription());
        assertEquals(AMOUNT, transaction.getAmount());
        assertEquals(DATE, transaction.getDate());
        assertNotNull(((Expense) transaction).getTags());
        assertEquals(1, ((Expense) transaction).getTags().size());
        assertTrue(((Expense) transaction).getTags().stream().anyMatch(tag -> tag.name().equals("Food")));
    }
}
