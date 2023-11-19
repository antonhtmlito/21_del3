/*
class Player {
    private String playerName;
    private int playerMoney;
    private boolean inJail;
    private boolean hasFreeJailCard;
    private int currentFieldPosition;

    public void getReward(FreeField field) {
       // TODO : handle this
       // this.playerMoney = this.playerMoney + field.getReward();
    }

    public void payRent(Field field) {
       // TODO : handle this
    }

    public void buyField(Field field) {
       // TODO : handle this
    }

    public void useJailFreeCard() {
        //TODO :  handle this
    }

    public boolean getInJail() {
        return inJail;
    } 

    public void setInJail(boolean inJail) {
         this.inJail = inJail;
    } 

    public boolean getHasFreeJailCard() {
        return hasFreeJailCard;
    } 

    public void setHasFreeJailCard(boolean hasFreeJailCard) {
         this.hasFreeJailCard = hasFreeJailCard;
    }

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

    public void pickChance() {
        System.out.println("Player: " + player + " pickup chance.");
        // TODO: player pickup chance
    }
}

class ArrayOfFields {

    private static Field fields[20] = {
       new FreeField("Start", 0, 50);
       new PropertyField("PizzaHouse", 5, Color.GREEN, 100, 10);
       new PropertyField("PizzaHouse", 5, Color.GREEN, 100, 10);
       new PropertyField("PizzaHouse", 5, Color.GREEN, 100, 10);
       new PropertyField("PizzaHouse", 5, Color.GREEN, 100, 10);        
       new PropertyField("PizzaHouse", 5, Color.GREEN, 100, 10);
    } 

    public static Field[] getFieldArray() {
        return fields;
    }
}

interface FieldAction {
    void doAction(Player player);
}

*/
abstract class Field {
    protected int position;
    protected String name;

    public Field(String name) {
        this.name = name;
    }

    public Field(String name, int position) {
        this.name = name;
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public int getPosition() {
        return position;
    }
}

/* 
class PropertyField extends Field implements FieldAction {
    private String color;
    private int value = 0;
    private String owner = null;
    private int rent;
   

    public PropertyField(String name, int position, String color, int value, int rent) {
        super(name, position);
        this.color = color;
        this.value = value;
        this.rent = rent;
    }

    public void doAction(Player player) {
        System.out.println("Action for PropertyField: " + name);
        System.out.println("Player: " + player);
        if(this.owner == null) {
            player.buyField(this);
            this.owner = player;
        } else if(this.owner == player) {
           // do nothing
        } else {
            player.payRent(this);
        }
    }
}

class ChanceField extends Field implements FieldAction {
    public ChanceField(String name) {
        super(name);
    }

    public void doAction(Player player) {
        System.out.println("Action for ChanceField: " + name);
        System.out.println("Player: " + player);
        player.pickChance();
    }
}

class JailField extends Field implements FieldAction {
    public JailField(String name) {
        super(name);
    }

    public void doAction(Player player) {
        if(player.getInJail()) {
            // TODO : handle this
        } else {
             System.out.println("Player: " + player + " visit jail.");
        }
    }
}

class FreeField extends Field implements FieldAction {
    private int reward = 0;
    public FreeField(String name, int position) {
        super(name, position);
    }

    public FreeField(String name, int position, int reward) {
        super(name, position);
        this.reward = reward;
    }

    public void doAction(Player player) {
        System.out.println("Player: " + player + " landed on free field.");
        if(this.reward != 0) {
            player.getReward(this);
        }
    }
}


class GoToJailField extends Field implements FieldAction {
    public GoToJailField(String name) {
        super(name);
    }

    public void doAction(Player player) {
        if(player.hasFreeJailCard()) {
            System.out.println("Player: " + player + " has jail free card, continue play.");
            player.useJailFreeCard();
            return;
        }
        System.out.println("Player: " + player + " will be sent to jail.");
        player.setInJail(true);
    }
}


class Main {
    public static void main(String[] args) {
        Player player1 = new Player("Player1", 1000);
        Player player2 = new Player("Player2", 1500);

        Field[] allFields = ArrayOfFields.getFieldArray();
      
    }
}
*/