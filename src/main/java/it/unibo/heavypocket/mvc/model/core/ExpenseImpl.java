package it.unibo.heavypocket.mvc.model.core;

import java.time.LocalDate;
import java.util.Collections;
import java.util.Objects;
import java.util.Set;
import java.math.BigDecimal;

public class ExpenseImpl extends TransactionImpl implements Expense {

    private final Set<Tag> tags;

    public ExpenseImpl(final String description, final BigDecimal amount, final LocalDate date, final Set<? extends Tag> tags) {
        super(description, amount, date);
        this.tags = Set.copyOf(tags);
    }

    @Override
    public Set<Tag> getTags() {
        return Collections.unmodifiableSet(this.tags);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.getAmount(), this.getDate(), this.getDescription(), this.getTags());
    }

    @Override
    public boolean equals(final Object obj) {
        if (obj instanceof final ExpenseImpl other) {
            return Objects.equals(this.getAmount(), other.getAmount()) &&
                    Objects.equals(this.getDate(), other.getDate()) &&
                    Objects.equals(this.getDescription(), other.getDescription()) &&
                    Objects.equals(this.getTags(), other.getTags());
        }
        return false;
    }
}
