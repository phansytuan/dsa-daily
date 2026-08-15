package java_core.Generic;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.util.List;
import org.junit.jupiter.api.Test;

class BoxTest {

    @Test
    void storesAndReturnsValueOfDeclaredType() {
        assertEquals("hello", new Box<>("hello").getValue());
        assertEquals(42, new Box<>(42).getValue());
        assertEquals(List.of(1, 2), new Box<>(List.of(1, 2)).getValue());
    }

    @Test
    void setterReplacesValue() {
        Box<Integer> box = new Box<>(1);

        box.setValue(2);

        assertEquals(2, box.getValue());
    }

    @Test
    void acceptsNullValue() {
        Box<String> box = new Box<>("value");

        box.setValue(null);

        assertNull(box.getValue());
    }
}
