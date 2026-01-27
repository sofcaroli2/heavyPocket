package it.unibo.heavypocket.mvc.model.core;

import java.time.LocalDate;
import java.math.BigDecimal;
import java.util.UUID;

public interface Transaction {

    UUID getId();

    String getDescription();

    BigDecimal getAmount();

    LocalDate getDate();
}
