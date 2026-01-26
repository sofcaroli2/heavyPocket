package it.unibo.heavypocket.mvc.model.core;

import java.time.LocalDate;
import java.util.Collections;
import java.util.Set;

public class ExpenseImpl extends AbstractTransaction implements Expense {

    private final Set<Tag> tags;

    public ExpenseImpl(final String description, final double amount, final LocalDate date, final Set<Tag> tags) {
        super(description, amount, date);
        this.tags = Set.copyOf(tags);
    }

    @Override
    public Set<Tag> getTags(){
        return Collections.unmodifiableSet(this.tags);
    }
}    
    
