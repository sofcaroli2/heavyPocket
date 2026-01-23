package it.unibo.heavypocket.mvc.model;

import java.util.List;

public interface Wallet {
    
    String getName();

    List<Transaction> getTransactions();

    double getBalance();

    Wallet addTransaction(final Transaction transaction);
}
