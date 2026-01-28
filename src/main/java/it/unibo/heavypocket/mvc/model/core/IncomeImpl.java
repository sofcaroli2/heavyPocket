package it.unibo.heavypocket.mvc.model.core;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Objects;

public final class IncomeImpl extends TransactionImpl implements Income {

    public IncomeImpl(final String description, final BigDecimal amount, final LocalDate date) {
        super(description, amount, date);
    }
}
