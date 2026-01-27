package it.unibo.heavypocket.mvc.model.core;

import java.util.Set;

public interface Expense extends Transaction {

    Set<Tag> getTags();
}
