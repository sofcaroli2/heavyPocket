package it.unibo.heavypocket.mvc.model.core;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ExpenseTest {
    
    private Expense expense;

    @BeforeEach
    void setUp() {
        this.expense = new ExpenseImpl("Dinner", 50.0, Set.of(new TagImpl("Food")));
    }

    @Test
    void testExpenseInitialization() {
        assertEquals("Dinner", expense.getDescription());
        assertEquals(50.0, expense.getAmount());
        assertNotNull(expense.getDate());
        assertNotNull(expense.getTags());
        assertEquals(1, expense.getTags().size());
        assertTrue(expense.getTags().stream().anyMatch(tag -> tag.getName().equals("Food")));
    }
}
