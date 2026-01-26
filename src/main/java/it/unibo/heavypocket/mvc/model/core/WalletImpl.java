package it.unibo.heavypocket.mvc.model.core;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.math.BigDecimal;

public class WalletImpl implements Wallet {

    private final String name;
    private final BigDecimal balance;
    private final List<Transaction> transactions;

    public WalletImpl(final String name, final BigDecimal balance, final List<Transaction> transactions) {
        this.name = name;
        this.balance = balance;
        this.transactions = List.copyOf(transactions);
    }
    
    @Override
    public String getName(){
        return this.name;
    }

    @Override
    public List<Transaction> getTransactions(){
        return Collections.unmodifiableList(this.transactions);
    }

    @Override
    public BigDecimal getBalance(){
        return this.balance;
    }

    @Override
    public Wallet addTransaction(final Transaction transaction){
        final List<Transaction> newTransactions = new ArrayList<>(this.transactions);
        newTransactions.add(transaction);
        return new WalletImpl(this.name, this.balance.add(transaction.getAmount()), newTransactions);
    }
}
