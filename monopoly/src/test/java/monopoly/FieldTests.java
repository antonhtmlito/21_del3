package monopoly;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FieldTests {

    @Test
    void testFieldInitialization() {
        Field field = new ChanceField("x", "CHANCE", 3);

        Assertions.assertEquals("x", field.getSymbol());
        Assertions.assertEquals("CHANCE", field.getName());
        Assertions.assertEquals(3, field.getPosition());
    }

    @Test
    void testFreeFieldAction() {
        FreeField freeField = new FreeField("x", "Gratis Parkering", 12);

        Player player = new Player("TestPlayer", 1500);
        freeField.doAction(player);

    }

    @Test
    void testJailFieldAction() {
        JailField jailField = new JailField("x", "Fængsel", 6);

        Player player = new Player("TestPlayer", 1500);
        jailField.doAction(player);

    }
}
