package test.java.monopoly;
import monopoly;
import org.junit.Test;
import static org.junit.Assert.*;

public class DiceRollTest {

    @Test
    public void testRollDiceInRange() {
        DiceRoll diceRoll = new DiceRoll();
        diceRoll.rollDice();
        int result = DiceRoll.getd1();
        assertTrue(result >= 1 && result <= 6);
    }

    @Test
    public void testPlayerPositionAfterRoll() {
        DiceRoll diceRoll = new DiceRoll();
        diceRoll.rollDice();
        int eyes = DiceRoll.getd1();

        int initialPosition = 0;
        int expectedPosition = (initialPosition + eyes) % 24;

        assertEquals(expectedPosition, diceRoll.getp1Pos());
    }

    @Test
    public void testPlayerPositionAtEdgeOfBoard() {
        DiceRoll diceRoll = new DiceRoll();

        diceRoll.setp1Pos(23);

        diceRoll.rollDice();

        assertEquals(0, diceRoll.getp1Pos());
    }

    @Test
    public void testPlayerTurnToggle() {
        DiceRoll diceRoll = new DiceRoll();
        
            diceRoll.rollDice();
        assertTrue(diceRoll.isP1Turn());

              diceRoll.rollDice();
        assertFalse(diceRoll.isP1Turn());
    }

}
