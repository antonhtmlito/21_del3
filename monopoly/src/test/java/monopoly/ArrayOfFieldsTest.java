package monopoly;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ArrayOfFieldsTest {

    @Test
    void getFieldArrayShouldNotBeNull() {
        assertNotNull(ArrayOfFields.getFieldArray());
    }

    @Test
    void getFieldArrayShouldReturnNonEmptyArray() {
        assertTrue(ArrayOfFields.getFieldArray().length > 0);
    }

    @Test
    void getFieldArrayElementsShouldNotBeNull() {
        for (Field field : ArrayOfFields.getFieldArray()) {
            assertNotNull(field);
        }
    }

    @Test
    void getFieldArrayElementsShouldHaveValidPositions() {
        for (Field field : ArrayOfFields.getFieldArray()) {
            assertTrue(field.getPosition() >= 0);
        }
    }

    @Test
    void getFieldArrayElementsShouldHaveValidNames() {
        for (Field field : ArrayOfFields.getFieldArray()) {
            assertNotNull(field.getName());
            assertFalse(field.getName().isEmpty());
        }
    }
}
