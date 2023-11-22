package monopoly;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PropertyFieldTest {

    @Test
    void propertyFieldInitializationShouldBeCorrect() {
        PropertyField propertyField = new PropertyField("TestProperty", 1, "Blue", 200, 20);

        assertEquals("TestProperty", propertyField.getName());
        assertEquals(1, propertyField.getPosition());
        assertEquals("Blue", propertyField.getColor());
        assertEquals(200, propertyField.getValue());
        assertEquals(20, propertyField.getRent());
        assertNull(propertyField.getOwner());
    }

    @Test
    void propertyFieldDoActionShouldAllowPlayerToBuyField() {
        PropertyField propertyField = new PropertyField("TestProperty", 1, "Blue", 200, 20);
        Player player = new Player("TestPlayer", 1000);

        propertyField.doAction(player);

        assertEquals(player, propertyField.getOwner());
    }

    @Test
    void propertyFieldDoActionShouldNotAllowOwnerToBuyFieldAgain() {
        PropertyField propertyField = new PropertyField("TestProperty", 1, "Blue", 200, 20);
        Player player = new Player("TestPlayer", 1000);

        propertyField.doAction(player);
        propertyField.doAction(player); // Try to buy again

        assertEquals(player, propertyField.getOwner());
    }

    @Test
    void propertyFieldDoActionShouldChargeRentToOtherPlayer() {
        PropertyField propertyField = new PropertyField("TestProperty", 1, "Blue", 200, 20);
        Player owner = new Player("Owner", 1000);
        Player player = new Player("TestPlayer", 1000);

        propertyField.doAction(owner); // Owner buys the property
        propertyField.doAction(player); // Other player lands on the property

        assertEquals(980, player.getPlayerMoney()); // Assuming the rent is 20
    }
}
