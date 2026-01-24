package it.unibo.heavypocket.mvc.model.core;

import java.time.LocalDate;

public interface Transaction {
 
    String getDescription();
    
    double getAmount();

    LocalDate getDate();
}
