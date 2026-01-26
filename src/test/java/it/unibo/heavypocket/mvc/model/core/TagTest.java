package it.unibo.heavypocket.mvc.model.core;

import java.util.UUID;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class TagTest {
    
    private Tag tag;
    private final static String TAG_NAME = "Food";

    @BeforeEach
    void setUp() {
        this.tag = new TagImpl(TAG_NAME);
    }

    @Test
    void testTagInitialization() {
        assertNotNull(tag.id());
        assertEquals(TAG_NAME, tag.name());
    }
}
