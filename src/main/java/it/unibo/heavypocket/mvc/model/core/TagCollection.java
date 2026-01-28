package it.unibo.heavypocket.mvc.model.core;

import java.util.Optional;
import java.util.UUID;
import java.util.Set;

public interface TagCollection {

    TagCollection addTag(Tag tag);

    TagCollection removeTag(Tag tag);

    TagCollection updateTag(UUID id, Tag newTag);
    
    boolean containsTag(Tag tag);

    Set<Tag> getAllTags();

    Optional<Tag> getTagById(UUID id);
}
