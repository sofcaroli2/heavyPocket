package it.unibo.heavypocket.mvc.model.core;

import java.util.Optional;
import java.util.Set;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class TagCollectionTest {

    private static final Tag TAG = Tags.createTag("Groceries");
    private static final Tag UPDATE_TAG = Tags.createTag("Utilities");

    private TagCollection tagCollection;

    @BeforeEach
    void setUp() {
        this.tagCollection = Tags.createTagCollection(Set.of());
    }

    @Test
    void testTagCollectionInitialization() {
        assertNotNull(tagCollection);
        assertEquals(0, tagCollection.getAllTags().size());
    }

    @Test
    void testAddTag() {
        this.tagCollection = tagCollection.addTag(TAG);
        assertEquals(1, tagCollection.getAllTags().size());
        assertEquals("Groceries", tagCollection.getAllTags().iterator().next().name());
    }

    @Test
    void testRemoveTag() {
        this.tagCollection = tagCollection.addTag(TAG);
        this.tagCollection = tagCollection.removeTag(TAG);
        assertEquals(0, tagCollection.getAllTags().size());
    }

    @Test
    void testUpdateTag() {
        this.tagCollection = tagCollection.addTag(TAG);
        this.tagCollection = tagCollection.updateTag(TAG.id(), UPDATE_TAG);
        assertEquals(1, tagCollection.getAllTags().size());
        assertEquals("Utilities", tagCollection.getAllTags().iterator().next().name());
    }

    @Test
    void testContainsTag() {
        this.tagCollection = tagCollection.addTag(TAG);
        assertEquals(true, tagCollection.containsTag(TAG));
    }

    @Test
    void testGetTagById() {
        this.tagCollection = tagCollection.addTag(TAG);
        Optional<Tag> Tag = tagCollection.getTagById(TAG.id());
        assertNotNull(Tag);
        assertEquals(TAG.name(), Tag.get().name());
    }
}