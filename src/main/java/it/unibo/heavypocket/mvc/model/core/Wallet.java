package it.unibo.heavypocket.mvc.model.core;

import java.util.List;
import java.util.UUID;
import java.math.BigDecimal;

public interface Wallet {

    String getName();

    List<Transaction> getTransactions();

    BigDecimal getBalance();

    Wallet addTransaction(final Transaction transaction);

    Wallet removeTransaction(final UUID transactionId);

    Wallet updateTransaction(final UUID oldTransactionId, final Transaction newTransaction);
}
