package monopoly;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ChanceFieldTests {

    @Test
    void testDoAction_PlayerPicksChance() {
        Player player = new Player("TestPlayer", 1000);
        ChanceField chanceField = new ChanceField("x", "Test Chance Field", 0);

        chanceField.doAction(player);

        Assertions.assertTrue(player.chancePicked);
    }

    @Test
    void testDoAction_PrintsMessageToConsole() {
 
        Player player = new Player("TestPlayer", 1000);
        ChanceField chanceField = new ChanceField("x", "Test Chance Field", 0);

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        chanceField.doAction(player);

        System.setOut(System.out);

        String expectedMessage = "Konskevens ved chancefelt Test Chance Field\nSpiller: TestPlayer\n";
        Assertions.assertEquals(expectedMessage, outputStream.toString());
    }

}
