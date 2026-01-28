package it.unibo.heavypocket.mvc.model.core;

import java.util.List;
import java.util.UUID;
import java.math.BigDecimal;

public interface Wallet {

    String getName();

    List<Transaction> getTransactions();

    BigDecimal getBalance();

    Wallet addTransaction(Transaction transaction);

    Wallet removeTransaction(UUID transactionId);

    Wallet updateTransaction(UUID oldTransactionId, Transaction newTransaction);
}
