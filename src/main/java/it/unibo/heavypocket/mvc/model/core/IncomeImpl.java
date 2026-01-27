package it.unibo.heavypocket.mvc.model.core;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Objects;

public class IncomeImpl extends TransactionImpl implements Income {

    public IncomeImpl(final String description, final BigDecimal amount, final LocalDate date) {
        super(description, amount, date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.getAmount(), this.getDate(), this.getDescription());
    }

    @Override
    public boolean equals(final Object obj) {
        if (obj instanceof final IncomeImpl other) {
            return Objects.equals(this.getAmount(), other.getAmount()) &&
                    Objects.equals(this.getDate(), other.getDate()) &&
                    Objects.equals(this.getDescription(), other.getDescription());
        }
        return false;
    }
}
