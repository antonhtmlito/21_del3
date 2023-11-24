package monopoly;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ChanceFieldTest {

    @Test
    void doActionShouldNotThrowException() {
        ChanceField chanceField = new ChanceField("Test Chance Field", 1);
        Player testPlayer = new Player("Test Player", 1000);

        assertDoesNotThrow(() -> chanceField.doAction(testPlayer));
    }

    @Test
    void doActionShouldPickChanceForPlayer() {
        ChanceField chanceField = new ChanceField("Test Chance Field", 1);
        Player testPlayer = new Player("Test Player", 1000);

        chanceField.doAction(testPlayer);

        
    }

    @Test
    void doActionShouldNotThrowExceptionForNullPlayer() {
        ChanceField chanceField = new ChanceField("Test Chance Field", 1);

        assertDoesNotThrow(() -> chanceField.doAction(null));
    }

    @Test
    void doActionShouldNotThrowExceptionForNullName() {
        ChanceField chanceField = new ChanceField(null, 1);
        Player testPlayer = new Player("Test Player", 1000);

        assertDoesNotThrow(() -> chanceField.doAction(testPlayer));
    }

    @Test
    void doActionShouldNotThrowExceptionForEmptyName() {
        ChanceField chanceField = new ChanceField("", 1);
        Player testPlayer = new Player("Test Player", 1000);

        assertDoesNotThrow(() -> chanceField.doAction(testPlayer));
    }

    @Test
    void doActionShouldNotThrowExceptionForNegativePosition() {
        ChanceField chanceField = new ChanceField("Test Chance Field", -1);
        Player testPlayer = new Player("Test Player", 1000);

        assertDoesNotThrow(() -> chanceField.doAction(testPlayer));
    }
}
