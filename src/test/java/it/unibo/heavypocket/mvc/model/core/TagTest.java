package it.unibo.heavypocket.mvc.model.core;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class TagTest {

    private static final String TAG_NAME = "Food";

    private Tag tag;

    @BeforeEach
    void setUp() {
        this.tag = Tags.createTag(TAG_NAME);
    }

    @Test
    void testTagInitialization() {
        assertNotNull(tag.id());
        assertEquals(TAG_NAME, tag.name());
    }
}
