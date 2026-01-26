package it.unibo.heavypocket.mvc.model.core;

import java.time.LocalDate;

public class IncomeImpl extends AbstractTransaction implements Income {

    public IncomeImpl(final String description, final double amount, final LocalDate date) {
        super(description, amount, date);
    }
}
