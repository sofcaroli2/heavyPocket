package it.unibo.heavypocket.mvc.model.core;

import java.time.LocalDate;
import java.util.Objects;
import java.util.UUID;
import java.math.BigDecimal;

public class TransactionImpl implements Transaction {

    private final UUID id;
    private final String description;
    private final BigDecimal amount;
    private final LocalDate date;

    protected TransactionImpl(final String description, final BigDecimal amount, final LocalDate date) {
        this.id = UUID.randomUUID();
        this.description = description;
        this.amount = amount;
        this.date = date;
    }

    @Override
    public final UUID getId() {
        return this.id;
    }

    @Override
    public final String getDescription() {
        return this.description;
    }

    @Override
    public final BigDecimal getAmount() {
        return this.amount;
    }

    @Override
    public final LocalDate getDate() {
        return this.date;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.getId(), this.getAmount(), this.getDate(), this.getDescription(), this.getTags());
    }

    @Override
    public boolean equals(final Object obj) {
        if (obj instanceof final TransactionImpl other) {
            return Objects.equals(this.getId(), other.getId())
                    && Objects.equals(this.getAmount(), other.getAmount())
                    && Objects.equals(this.getDate(), other.getDate())
                    && Objects.equals(this.getDescription(), other.getDescription());
        }
        return false;
    }
}
