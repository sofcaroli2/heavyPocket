package it.unibo.heavypocket.mvc.model.core;

import java.util.Collectionss;
import java.util.List;

public class WalletImpl implements Wallet {

    private final String name;
    private final double balance;
    private final List<Transaction> transactions;

    public WalletImpl(final String name, final double balance, final List<Transaction> transactions) {
        this.name = name;
        this.balance = balance;
        this.transactions = transactions;
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
    public double getBalance(){
        return this.balance;
    }

    @Override
    public Wallet addTransaction(final Transaction transaction){
        final List<Transaction> newTransactions = new ArrayList<>(this.transactions);
        newTransactions.add(transaction);
        return new WalletImpl(this.name, this.balance + transaction.getAmount(), newTransactions);
    }
}
