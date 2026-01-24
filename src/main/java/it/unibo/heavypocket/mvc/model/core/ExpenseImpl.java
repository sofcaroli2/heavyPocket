package it.unibo.heavypocket.mvc.model.core;

import java.time.LocalDate;
import java.util.Set;

public class ExpenseImpl implements Expense {

    private String description;
    private double amount;
    private LocalDate date;
    private Set<Tag> tags;

    @Override
    public String getDescription(){
        return null;
    }
    
    @Override
    public double getAmount(){
        return 0;
    }

    @Override
    public LocalDate getDate(){
        return null;
    }
    
    @Override
    public Set<Tag> getTags(){
        return null;
    }
}    
    
