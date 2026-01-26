package it.unibo.heavypocket.mvc.model.core;

import java.time.LocalDate;
import java.math.BigDecimal;

public interface Transaction {
 
    String getDescription();
    
    BigDecimal getAmount();

    LocalDate getDate();
}
