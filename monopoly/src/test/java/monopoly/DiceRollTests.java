package monopoly;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DiceRollTests {

    @Test
    void testRollDiceInRange() {
        DiceRoll diceRoll = new DiceRoll();
        diceRoll.rollDice();
        int result = DiceRoll.getd1();

        assertTrue(result >= 1 && result <= 6, "Dice roll result should be between 1 and 6");
    }

    @Test
    void testRollDiceConsistency() {
        DiceRoll diceRoll = new DiceRoll();

        for (int i = 0; i < 100; i++) {
            diceRoll.rollDice();
            int result = DiceRoll.getd1();
            assertTrue(result >= 1 && result <= 6, "Dice roll result should be between 1 and 6");
        }
    }

    @Test
    void testPlayerMovement() {
        DiceRoll diceRoll = new DiceRoll();
        int initialPosition = diceRoll.getp1Pos();

        diceRoll.rollDice();
        int newPosition = diceRoll.getp1Pos();

        assertNotEquals(initialPosition, newPosition, "Player position should be updated after rolling the dice");
    }

    @Test
    void testPlayerPositionOverflow() {
        DiceRoll diceRoll = new DiceRoll();

        diceRoll.setp1Pos(20);

        diceRoll.rollDice();
        int newPosition = diceRoll.getp1Pos();

        assertEquals(newPosition, 1, "Player position should wrap around to 1 after reaching the end");
    }

    @Test
    void testPlayerPositionNotOverflow() {
        DiceRoll diceRoll = new DiceRoll();

        diceRoll.setp1Pos(15);

        diceRoll.rollDice();
        int newPosition = diceRoll.getp1Pos();

        assertEquals(newPosition, 15 + DiceRoll.getd1(), "Player position should be updated correctly");
    }
}
