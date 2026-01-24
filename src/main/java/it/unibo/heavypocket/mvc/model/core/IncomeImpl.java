package it.unibo.heavypocket.mvc.model.core;

import java.time.LocalDate;

public class IncomeImpl implements Income {

    private String description;
    private double amount;
    private LocalDate date;

    @Override
    public String getDescription() {
        return null;
    }

    @Override
    public double getAmount() {
        return 0;
    }

    @Override
    public LocalDate getDate() {
        return null;
    }
}
