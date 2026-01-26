package it.unibo.heavypocket.mvc.model.core;

import java.util.List;
import java.math.BigDecimal;

public interface Wallet {
    
    String getName();

    List<Transaction> getTransactions();

    BigDecimal getBalance();

    Wallet addTransaction(final Transaction transaction);
}
