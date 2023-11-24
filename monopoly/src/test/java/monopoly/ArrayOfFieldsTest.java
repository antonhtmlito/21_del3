package monopoly;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class GameBoardTest {

    @Test
    void getFieldArrayShouldNotBeNull() {
        assertNotNull(GameBoard.getFieldArray());
    }

    @Test
    void getFieldArrayShouldReturnNonEmptyArray() {
        assertTrue(GameBoard.getFieldArray().length > 0);
    }

    @Test
    void getFieldArrayElementsShouldNotBeNull() {
        for (Field field : GameBoard.getFieldArray()) {
            assertNotNull(field);
        }
    }

    @Test
    void getFieldArrayElementsShouldHaveValidPositions() {
        for (Field field : GameBoard.getFieldArray()) {
            assertTrue(field.getPosition() >= 0);
        }
    }

    @Test
    void getFieldArrayElementsShouldHaveValidNames() {
        for (Field field : GameBoard.getFieldArray()) {
            assertNotNull(field.getName());
            assertFalse(field.getName().isEmpty());
        }
    }
}
