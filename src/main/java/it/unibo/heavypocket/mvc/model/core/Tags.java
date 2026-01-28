package it.unibo.heavypocket.mvc.model.core;

public final class Tags {

    private Tags() {
    }

    public static Tag createTag(final String name) {
        // @todo aggiungere validazione dati
        return new TagImpl(name);
    }
}
