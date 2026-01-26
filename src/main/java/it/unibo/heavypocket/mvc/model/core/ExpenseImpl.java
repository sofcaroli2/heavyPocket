package it.unibo.heavypocket.mvc.model.core;

import java.time.LocalDate;
import java.util.Collections;
import java.util.Set;

import it.unibo.heavypocket.mvc.model.core.TagImpl;

public class ExpenseImpl extends AbstractTransaction implements Expense {

    private final Set<TagImpl> tags;

    public ExpenseImpl(final String description, final double amount, final LocalDate date, final Set<TagImpl> tags) {
        super(description, amount, date);
        this.tags = Set.copyOf(tags);
    }

    @Override
    public Set<TagImpl> getTags(){
        return Collections.unmodifiableSet(this.tags);
    }
}    
    
