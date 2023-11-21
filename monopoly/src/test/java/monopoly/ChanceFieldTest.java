package test.java.monopoly;
import monopoly.Player;
import org.junit.Test;
import static org.junit.Assert.*;

public class ChanceFieldTest {

    @Test
    public void testDoActionPlayerPicksChance() {
        ChanceField chanceField = new ChanceField("Chance", 5);
        Player player = new Player("Player1", 1000);

        System.out.println("Action for ChanceField: " + chanceField.getName());
        System.out.println("Player: " + player);


        chanceField.doAction(player);

        assertTrue(player.hasPickedChance());
    }

    @Test
    public void testDoActionPlayerHasFreeJailCard() {
        ChanceField chanceField = new ChanceField("Chance", 5);
        Player player = new Player("Player1", 1000);
        player.setHasFreeJailCard(true);

        chanceField.doAction(player);

        assertFalse(player.isInJail());
        assertFalse(player.hasFreeJailCard());
    }

    @Test
    public void testDoActionPlayerSentToJail() {
        ChanceField chanceField = new ChanceField("Chance", 5);
        Player player = new Player("Player1", 1000);

        chanceField.doAction(player);

        assertTrue(player.isInJail());
    }

    @Test
    public void testDoActionPlayerWithFreeJailCardSentToJail() {
        ChanceField chanceField = new ChanceField("Chance", 5);
        Player player = new Player("Player1", 1000);
        player.setHasFreeJailCard(true);

        chanceField.doAction(player);

        assertFalse(player.hasFreeJailCard());
        assertTrue(player.isInJail());
    }

    @Test
    public void testDoActionPlayerWithNoFreeJailCardSentToJail() {
        ChanceField chanceField = new ChanceField("Chance", 5);
        Player player = new Player("Player1", 1000);

        chanceField.doAction(player);

        assertFalse(player.hasFreeJailCard());
        assertTrue(player.isInJail());
    }
}
