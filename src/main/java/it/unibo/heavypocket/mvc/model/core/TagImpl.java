package it.unibo.heavypocket.mvc.model.core;

import java.util.UUID;

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
    
}
