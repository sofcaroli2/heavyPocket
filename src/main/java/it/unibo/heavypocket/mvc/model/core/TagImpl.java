package it.unibo.heavypocket.mvc.model.core;

import java.util.UUID;

public record TagImpl(UUID id, String name) implements Tag {

    public TagImpl(final String name) {
        this(UUID.randomUUID(), name);
    }
}
