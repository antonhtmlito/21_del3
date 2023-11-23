import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GameTests {

    @Test
    void testPlayerMovement() {
        Game game = new Game();
        Player player = new Player("TestPlayer", 1500);

        player.move(3);
        Assertions.assertEquals(3, player.getPosition());

        player.move(18);
        Assertions.assertEquals(1, player.getPosition());
        Assertions.assertEquals(1700, player.getPlayerMoney()); 
    }

    @Test
    void testPropertyOwnership() {

        Game game = new Game();
        Player player1 = new Player("Player1", 1500);
        Player player2 = new Player("Player2", 1500);

        PropertyField propertyField = (PropertyField) game.gameBoard.getField(1);

        player1.move(1); 
        propertyField.doAction(player1); 

        Assertions.assertEquals(player1, propertyField.getOwner());

        player2.move(1);
        propertyField.doAction(player2);
        Assertions.assertEquals(1400, player2.getPlayerMoney()); 
    }

    @Test
    void testJailActions() {
        Game game = new Game();
        Player player = new Player("TestPlayer", 1500);

        JailField jailField = (JailField) game.gameBoard.getField(6);

        jailField.doAction(player);

        Assertions.assertTrue(player.getInJail());

        player.setHasFreeJailCard(true);
        jailField.doAction(player);

        Assertions.assertFalse(player.getInJail());
        Assertions.assertFalse(player.getHasFreeJailCard());
    }
}
