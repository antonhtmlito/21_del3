package monopoly;

import org.junit.jupiter.api.Test;

public class PropertyFieldTests {
    @Test
    void testDoAction() {
      // see assertion examples here: https://howtodoinjava.com/junit5/junit-5-assertions-examples/
    }

    @Test
    public void testDoActionBuyField() {
        PropertyField propertyField = new PropertyField("Property", 10, "Blue", 200, 20);
        Player player = new Player("Player1", 1000);

        propertyField.doAction(player);

        assertEquals(player, propertyField.getOwner());
    }

    @Test
    public void testDoActionPayRent() {
        PropertyField propertyField = new PropertyField("Property", 10, "Blue", 200, 20);
        Player owner = new Player("Owner", 1000);
        Player player = new Player("Player1", 1000);

        propertyField.setOwner(owner);

        propertyField.doAction(player);

        assertEquals(980, player.getPlayerMoney());
        assertEquals(1020, owner.getPlayerMoney());
    }

    @Test
    public void testDoActionOwnField() {
        PropertyField propertyField = new PropertyField("Property", 10, "Blue", 200, 20);
        Player player = new Player("Player1", 1000);

        propertyField.setOwner(player);

        propertyField.doAction(player);

        assertEquals(1000, player.getPlayerMoney());
    }

    @Test
    public void testDoActionBankruptcy() {
        PropertyField expensiveProperty = new PropertyField("ExpensiveProperty", 15, "Red", 1000, 100);
        Player player = new Player("Player1", 100);

        expensiveProperty.doAction(player);

        assertTrue(player.isBankrupt());
    }

    @Test
    public void testDoActionInsufficientFundsToBuy() {
        PropertyField expensiveProperty = new PropertyField("ExpensiveProperty", 15, "Red", 1000, 100);
        Player player = new Player("Player1", 500);

        expensiveProperty.doAction(player);

        assertNull(expensiveProperty.getOwner());
    }
}
