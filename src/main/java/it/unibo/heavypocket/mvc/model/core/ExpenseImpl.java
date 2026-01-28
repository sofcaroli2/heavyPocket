package it.unibo.heavypocket.mvc.model.core;

import java.time.LocalDate;
import java.util.Collections;
import java.util.Set;
import java.math.BigDecimal;

public final class ExpenseImpl extends TransactionImpl implements Expense {

    private final Set<Tag> tags;

    public ExpenseImpl(final String description, final BigDecimal amount, final LocalDate date,
            final Set<? extends Tag> tags) {
        super(description, amount, date);
        this.tags = Set.copyOf(tags);
    }

    @Override
    public Set<Tag> getTags() {
        return Collections.unmodifiableSet(this.tags);
    }
}
