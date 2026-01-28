package it.unibo.heavypocket.mvc.model.core;

import java.math.BigDecimal;

public final class Transactions {

    private Transactions() {
    }

    public static Income createIncome(
            final String description,
            final BigDecimal amount,
            final java.time.LocalDate date) {
        // @todo: aggiungere validazione dati
        return new IncomeImpl(description, amount, date);
    }

    public static Expense createExpense(
            final String description,
            final BigDecimal amount,
            final java.time.LocalDate date,
            final java.util.Set<? extends Tag> tags) {
        // @todo: aggiungere validazione dati
        return new ExpenseImpl(description, amount, date, tags);
    }
}
