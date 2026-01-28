package it.unibo.heavypocket.mvc.model.core;

import java.util.HashSet;
import java.util.Set;
import java.util.Optional;
import java.util.UUID;

public final class TagCollectionImpl implements TagCollection {

    private final Set<Tag> tags;

    public TagCollectionImpl(Set<Tag> tags) {
        this.tags = Set.copyOf(tags);
    }

    @Override
    public TagCollection addTag(Tag tag) {
        final Set<Tag> newTags = new HashSet<>(this.tags);
        newTags.add(tag); 
        return new TagCollectionImpl(newTags);
    }

    @Override
    public TagCollection removeTag(Tag tag) {
        final Set<Tag> newTags = new HashSet<>(this.tags);
        newTags.remove(tag);
        return new TagCollectionImpl(newTags);
    }

    @Override
    public TagCollection updateTag(UUID id, Tag newTag) {
        final Set<Tag> newTags = new HashSet<>(this.tags);
        newTags.removeIf(tag -> tag.id().equals(id));
        newTags.add(newTag);
        return new TagCollectionImpl(newTags);
    }

    @Override
    public boolean containsTag(Tag tag) {
        return this.tags.contains(tag);
    }

    @Override
    public Set<Tag> getAllTags() {
        return Set.copyOf(this.tags);
    }

    @Override
    public Optional<Tag> getTagById(UUID id) {
        return this.tags.stream()
                .filter(tag -> tag.id().equals(id))
                .findFirst();
    }
    
}
