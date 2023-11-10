class Player {
    private String playerName;
    private int playerMoney;

    public Player(String playerName, int playerMoney) {
        this.playerName = playerName;
        this.playerMoney = playerMoney;
    }

    public String toString() {
        return "Player{" +
                "playerName='" + playerName + '\'' +
                ", playerMoney=" + playerMoney +
                '}';
    }
}

interface FieldAction {
    void doAction(Player player);
}
abstract class Field {
    protected String name;

    public Field(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class PropertyField extends Field implements FieldAction {
    private String color;
    private int value;
    private String owner;
    private int rent;

    public PropertyField(String name, String color, int value, int rent) {
        super(name);
        this.color = color;
        this.value = value;
        this.rent = rent;
    }

    public void doAction(Player player) {
        System.out.println("Action for PropertyField: " + name);
        System.out.println("Player: " + player);
    }
}

class ChanceField extends Field implements FieldAction {
    public ChanceField(String name) {
        super(name);
    }

    public void doAction(Player player) {
        System.out.println("Action for ChanceField: " + name);
        System.out.println("Player: " + player);
    }
}

class JailField extends Field implements FieldAction {
    public JailField(String name) {
        super(name);
    }

    public void doAction(Player player) {
        System.out.println("Action for JailField: " + name);
        System.out.println("Player: " + player);
    }
}

class FreeField extends Field implements FieldAction {
    public FreeField(String name) {
        super(name);
    }

    public void doAction(Player player) {
        System.out.println("Action for FreeField: " + name);
        System.out.println("Player: " + player);
    }
}

class GoToJailField extends Field implements FieldAction {
    public GoToJailField(String name) {
        super(name);
    }

    public void doAction(Player player) {
        System.out.println("Action for GoToJailField: " + name);
        System.out.println("Player: " + player);
    }
}

class Main {
    public static void main(String[] args) {
        Player player1 = new Player("Player1", 1000);
        PropertyField propertyField = new PropertyField("Property1", "Blue", 200, 20);
        propertyField.doAction(player1);

        Player player2 = new Player("Player2", 1500);
        ChanceField chanceField = new ChanceField("Chance1");
        chanceField.doAction(player2);
    }
}