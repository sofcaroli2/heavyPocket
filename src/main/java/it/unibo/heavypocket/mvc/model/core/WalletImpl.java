package it.unibo.heavypocket.mvc.model.core;

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
        return null;
    }

    @Override
    public List<Transaction> getTransactions(){
        return null;
    }

    @Override
    public double getBalance(){
        return 0;
    }

    @Override
    public Wallet addTransaction(final Transaction transaction){
        return this;
    }
}
