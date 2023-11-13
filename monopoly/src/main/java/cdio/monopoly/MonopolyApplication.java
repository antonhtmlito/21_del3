package cdio.monopoly;


public class MonopolyApplication {

	public static void main(String[] args) {
			Player player1 = new Player("Player1", 1000);
			PropertyField propertyField = new PropertyField("Property1", "Blue", 200, 20);
			propertyField.doAction(player1);
	
			Player player2 = new Player("Player2", 1500);
			ChanceField chanceField = new ChanceField("Chance1");
			chanceField.doAction(player2);
	}

}
