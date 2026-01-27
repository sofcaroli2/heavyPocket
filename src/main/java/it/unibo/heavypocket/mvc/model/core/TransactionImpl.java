package it.unibo.heavypocket.mvc.model.core;

import java.time.LocalDate;
import java.math.BigDecimal;

public class TransactionImpl implements Transaction {

    private final String description;
    private final BigDecimal amount;
    private final LocalDate date;

    protected TransactionImpl(final String description, final BigDecimal amount, final LocalDate date) {
        this.description = description;
        this.amount = amount;
        this.date = date;
    }

    @Override
    public final String getDescription() {
        return this.description;
    }

    @Override
    public final BigDecimal getAmount() {
        return this.amount;
    }

    @Override
    public final LocalDate getDate() {
        return this.date;
    }
}
