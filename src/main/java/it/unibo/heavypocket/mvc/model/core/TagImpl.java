package it.unibo.heavypocket.mvc.model.core;

import java.util.UUID;
import java.util.Objects;

public class TagImpl implements Tag {
    
    private final UUID id;
    private final String name;

    public TagImpl(final String name) {
        this.id = UUID.randomUUID();
        this.name = name;
    }

    @Override
    public UUID getId() {
        return this.id;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.getId(), this.getName());
    }

    @Override
    public boolean equals(final Object obj) {
        if (obj instanceof final TagImpl other) {
            return Objects.equals(this.getId(), other.getId()) && 
            Objects.equals(this.getName(), other.getName());
        }
        return false;
    }
}
