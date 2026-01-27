package it.unibo.heavypocket.mvc.model.core;

import java.util.Collections;
import java.util.List;
import java.util.UUID;
import java.util.ArrayList;
import java.math.BigDecimal;

public final class WalletImpl implements Wallet {

    private final String name;
    private final BigDecimal balance;
    private final List<Transaction> transactions;

    public WalletImpl(final String name, final BigDecimal balance, final List<Transaction> transactions) {
        this.name = name;
        this.balance = balance;
        this.transactions = List.copyOf(transactions);
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public List<Transaction> getTransactions() {
        return Collections.unmodifiableList(this.transactions);
    }

    @Override
    public BigDecimal getBalance() {
        return this.balance;
    }

    @Override
    public Wallet addTransaction(final Transaction transaction) {
        final List<Transaction> newTransactions = new ArrayList<>(this.transactions);
        newTransactions.add(transaction);
        return new WalletImpl(this.name, this.balance.add(transaction.getAmount()), newTransactions);
    }

    @Override
    public Wallet removeTransaction(final UUID transactionId) {
        final List<Transaction> newTransactions = new ArrayList<>(this.transactions);
        Transaction toRemove = null;
        for (final Transaction t : newTransactions) {
            if (t.getId().equals(transactionId)) {
                toRemove = t;
                break;
            }
        }
        if (toRemove != null) {
            newTransactions.remove(toRemove);
            return new WalletImpl(this.name, this.balance.subtract(toRemove.getAmount()), newTransactions);
        }
        return this;
    }

    @Override
    public Wallet updateTransaction(final UUID oldTransactionId, final Transaction newTransaction) {
        final List<Transaction> newTransactions = new ArrayList<>(this.transactions);
        Transaction toUpdate = null;
        for (final Transaction t : newTransactions) {
            if (t.getId().equals(oldTransactionId)) {
                toUpdate = t;
                break;
            }
        }
        if (toUpdate != null) {
            newTransactions.remove(toUpdate);
            newTransactions.add(newTransaction);
            final BigDecimal newBalance = this.balance.subtract(toUpdate.getAmount()).add(newTransaction.getAmount());
            return new WalletImpl(this.name, newBalance, newTransactions);
        }
        return this;
    }
}
