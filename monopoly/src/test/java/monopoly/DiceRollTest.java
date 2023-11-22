package monopoly;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DiceRollTest {

    @Test
    void rollDiceShouldGenerateValuesInRange() {
        int result = DiceRoll.rollDice();
        assertTrue(result >= 1 && result <= 6);
    }

    @Test
    void rollDiceShouldGenerateRandomValues() {
        int result1 = DiceRoll.rollDice();
        int result2 = DiceRoll.rollDice();
        assertNotEquals(result1, result2);
    }

    @Test
    void getp1PosShouldNotBeNegative() {
        DiceRoll diceRoll = new DiceRoll();
        assertTrue(diceRoll.getp1Pos() >= 0);
    }

    @Test
    void getp2PosShouldNotBeNegative() {
        DiceRoll diceRoll = new DiceRoll();
        assertTrue(diceRoll.getp2Pos() >= 0);
    }

    @Test
    void getp1PosShouldResetAfterPassingBoundary() {
        DiceRoll diceRoll = new DiceRoll();
        diceRoll.rollDice();
        diceRoll.rollDice();
        diceRoll.rollDice();
        assertTrue(diceRoll.getp1Pos() >= 0 && diceRoll.getp1Pos() < 24);
    }

    @Test
    void getp2PosShouldResetAfterPassingBoundary() {
        DiceRoll diceRoll = new DiceRoll();
        diceRoll.rollDice();
        diceRoll.rollDice();
        diceRoll.rollDice();
        assertTrue(diceRoll.getp2Pos() >= 0 && diceRoll.getp2Pos() < 24);
    }

    @Test
    void getd1ShouldNotBeNegative() {
        assertTrue(DiceRoll.getd1() >= 0);
    }

    @Test
    void getd1ShouldResetAfterEachRoll() {
        DiceRoll.rollDice();
        assertEquals(0, DiceRoll.getd1());
    }
}
