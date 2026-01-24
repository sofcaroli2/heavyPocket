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

    @BeforeEach
    void setUp() {
        this.tag = new TagImpl("Food");
    }

    @Test
    void testTagInitialization() {
        assertNotNull(tag.getId());
        assertEquals("Food", tag.getName());
    }
}
