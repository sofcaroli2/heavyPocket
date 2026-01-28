package it.unibo.heavypocket.mvc.model.core;

public final class Wallets {
    
    private Wallets() {}

    public static Wallet createWallet(final String name) {
        return new WalletImpl(name, java.math.BigDecimal.ZERO, java.util.Collections.emptyList());
    }
}
