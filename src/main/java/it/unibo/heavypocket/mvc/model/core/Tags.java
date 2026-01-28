package it.unibo.heavypocket.mvc.model.core;

import java.util.Set;

public final class Tags {

    private Tags() {
    }

    public static Tag createTag(final String name) {
        // @todo aggiungere validazione dati
        return new TagImpl(name);
    }

    public static TagCollection createTagCollection(final Set<Tag> tags) {
        return new TagCollectionImpl(tags);
    }
}
