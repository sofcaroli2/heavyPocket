package it.unibo.heavypocket.mvc.model.core;

public interface Expense extends Transaction {
    
    Set<Tag> getTags();
}
