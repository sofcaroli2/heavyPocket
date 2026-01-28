package it.unibo.heavypocket.mvc.model.core;

import java.beans.Transient;
import java.util.Set;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class TagCollectionTest {

    private static final Tag TAG = Tags.createTag("Groceries");

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

}
