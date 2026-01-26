package it.unibo.heavypocket.mvc.model.core;

import java.time.LocalDate;

public abstract class AbstractTransaction implements Transaction {

    private final String description;
    private final double amount;
    private final LocalDate date;

    protected AbstractTransaction(final String description, final double amount, final LocalDate date) {
        this.description = description;
        this.amount = amount;
        this.date = date;
    }
    
    @Override
    public final String getDescription() {
        return this.description;
    }   

    @Override
    public final double getAmount() {
        return this.amount;
    }

    @Override
    public final LocalDate getDate() {
        return this.date;
    }
}
