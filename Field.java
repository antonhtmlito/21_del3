import java.util.Random;
import java.util.Scanner;

class Player {
    private String playerName;
    private int playerMoney;
    private boolean inJail;
    private boolean hasFreeJailCard;
    private int currentFieldPosition;
    public boolean p1Turn;

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

    private int[] cards = new int[20];

    public void pickChance() {
        System.out.println("Player: " + player + " pickup chance.");
        
        for (int i = 0; i < cards.length; i++) {
            cards[i] = i + 1;
        }

        int temp = cards[0];

        if (p1Turn = true) {
            pos = p1Pos;
        }
        else {
            pos = p2Pos;
        }

        if (temp == 0) {
            System.out.println("Ryk frem til Start og modtag M2.");
            pos = 0;
            playerMoney =+ 2;
        }
        else if (temp == 1) {
            System.out.println("Ryk 5 felter frem.");
            pos =+ 5;
        }
        else if (temp == 2) {
            System.out.println("Ryk 1 felt frem, eller tag et chancekort mere");
            Scanner scan = new Scanner(System.in);

            String command = scan.nextLine();
            switch(command) {
                case "ryk":
                    pos =+ 1;
                    break;
                case "chance":
                    //igen??
                    break;
            }
            scan.close();
        }
        else if (temp == 3) {
            System.out.println("Ryk frem til Strandpromenaden");
            pos = 23;
        }
        else if (temp == 4) {
            System.out.println("Du har spist for meget slik. Betal M2 til banken.");
            playerMoney =- 2;
        }
        else if (temp == 5) {
            System.out.println("Det er din fødselsdag! Alle giver dig M1. Tillykke med fødselsdagen!");
            playerMoney =+ playerAmount + 1;
            //alles money =- 1;
        }
        else if (temp == 6) {
            System.out.println("Du har lavet alle dine lektier. Modtag M2 fra banken.");
            playerMoney =+ 2;
        }
        else if (temp == 7) {
            System.out.println("Gratis felt! Ryk frem til Skaterparken for at lave det perfekte grind! hvis ingen ejer den, får du den gratis! Ellers skal du betale leje til ejeren.");
            pos = 10;
            if (isOwned = false) {
                //få grunden
            }
            else {
                //betal leje
            }
        }
        else if (temp == 8) {
            System.out.println("Gratis felt! Ryk frem til et orange felt. Hvis det er ledigt, får du det gratis! Ellers skal du betale leje til ejeren.");
            //ryk til 10 eller 11

        }
        else if (temp == 9) {
            System.out.println("Gratis felt! Ryk frem til et orange eller grønt felt. Hvis det er ledigt, får du det gratis! Ellers skal du betale leje til ejeren.");
            //ryk til 10, 11, 19 eller 20
        }
        else if (temp == 10) {
            System.out.println("Gratis felt! Ryk frem til et lyseblåt felt. Hvis det er ledigt, får du det gratis! Ellers skal du betale leje til ejeren.");
            //ryk til 4 eller 5
        }
        else if (temp == 11) {
            System.out.println("Gratis felt! Ryk frem til et pink eller mørkeblåt felt. Hvis det er ledigt, får du det gratis! Ellers skal du betale leje til ejeren.");
            //ryk til 7, 8, 22 eller 23
        }
        else if (temp == 12) {
            System.out.println("Gratis felt! Ryk frem til et rødt felt. Hvis det er ledigt, får du det gratis! Ellers skal du betale leje til ejeren.");
            //ryk til 13 eller 14
        }
        else if (temp == 13) {
            System.out.println("Gratis felt! Ryk frem til et lyseblåt eller rødt felt. Hvis det er ledigt, får du det gratis! Ellers skal du betale leje til ejeren.");
            //ryk til 4, 5, 13 eller 14
        }
        else if (temp == 14) {
            System.out.println("Gratis felt! Ryk frem til et brunt eller gult felt. Hvis det er ledigt, får du det gratis! Ellers skal du betale leje til ejeren.");
            //ryk til 1, 2, 16 eller 17
        }
        else if (temp == 15) {
            System.out.println("Du løslades uden omkostninger. Behold dette kort, indtil du får brug for det.");
            hasFreeJailCard = true;
        }
        else if (temp == 16) {
            System.out.println("Giv dette kort til Bilen, og tag et chancekort mere. Bil: på din næste tur skal du drøne frem til et hvilket som helst ledigt felt og købe det. Hvis der ikke er nogle ledige felter, skal du købe et fra en anden spiller!");
            //igen??
            //ryk til et ledigt felt (isOwned = false)
        }
        else if (temp == 17) {
            System.out.println("Giv dette kort til Skibet, og tag et chancekort mere. Skib: på din næste tur skal du selje frem til et hvilket som helst ledigt felt og købe det. Hvis der ikke er nogle ledige felter, skal du købe et fra en anden spiller!");
            //igen??
            //ryk til et ledigt felt (isOwned = false)
        }
        else if (temp == 18) {
            System.out.println("Giv dette kort til Katten, og tag et chancekort mere. Kat: på din næste tur skal du liste dig hen på et hvilket som helst ledigt felt og købe det. Hvis der ikke er nogle ledige felter, skal du købe et fra en anden spiller!");
            //igen??
            //ryk til et ledigt felt (isOwned = false)
        }
        else if (temp == 19) {
            System.out.println("Giv dette kort til Hunden, og tag et chancekort mere. Hund: på din næste tur skal du hoppe hen på et til et hvilket som helst ledigt felt og købe det. Hvis der ikke er nogle ledige felter, skal du købe et fra en anden spiller!");
            //igen??
            //ryk til et ledigt felt (isOwned = false)
        }

        if (p1Turn = true) {
            p1Pos = pos;
        }
        else {
            p2Pos = pos;
        }

        for (int i = 0; i < cards.length - 1; i++) {
            cards[i] = cards[i + 1];
        }

        cards[cards.length - 1] = temp;
        
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
abstract class Field {
    protected int position;
    protected String name;

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


class PropertyField extends Field implements FieldAction {
    private String color;
    private int value = 0;
    private String owner = null;
    private int rent;
    private boolean isOwned = false;
   

    public PropertyField(String name, int position, String color, int value, int rent, boolean isOwned) {
        super(name, position);
        this.color = color;
        this.value = value;
        this.rent = rent;
        this.isOwned = isOwned;
    }

    public void doAction(Player player) {
        System.out.println("Action for PropertyField: " + name);
        System.out.println("Player: " + player);
        if(this.owner == null) {
            player.buyField(this);
            this.owner = player;
            this.isOwned = true;
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

class DiceRoll {
    private static int d1;
    private int p1Pos;
    private int p2Pos;
    private static boolean p1Turn;

    public DiceRoll() {
        p1Pos = 0;
        p2Pos = 0;
        p1Turn = true;
    }

    public void rollDice() {
        Random ran = new Random();

        d1 = ran.nextInt(6) + 1;

        if (p1Turn) {
            p1Pos += d1;
        }
        else {
            p2Pos += d1;
        }
        
    }

    public static int getd1() {
        return d1;
    }

    public int getp1Pos() {
        if (p1Pos >= 24) {
            return p1Pos - 24;
        } 
        else {
            return p1Pos;
        }
    }

    public int getp2Pos() {
        if (p2Pos >= 24) {
            return p2Pos - 24;
        } 
        else {
            return p2Pos;
        }
    }

}

class Main {
    public static void main(String[] args) {
        System.out.println("Indtast venligst antallet af spillere. Vælg mellem 2 og 4.");
        public int playerAmount;
        public String playerCar;
        public String p1;
        public String p2;
        public String p3;
        public String p4;
        Scanner scan = new Scanner(System.in);

            String command = scan.nextLine();
            switch(command) {
                case "2":
                    playerAmount = 2;
                    break;
                case "3":
                    playerAmount = 3;
                    break;
                case "4":
                    playerAmount = 4;
                    break;
                default:
                    System.out.println("I kan kun være mellem 2 og 4 spillere. Indtast venligst igen.");
            }

            private int[] p = new int[playerAmount];
            int i = 1;
            while (i <= playerAmount)
            System.out.println("Vælg spillebrik for spiller" + i);
                switch(command) {
                    case "Hund":
                        playerCar = Hund;
                        break;
                    case "Kat":
                        playerCar = Kat;
                        break;
                    case "Skib":
                        playerCar = Skib;
                        break;
                    case "Bil":
                        playerCar = Bil;
                        break;
                    default:
                        System.out.println("I kan kun være mellem 2 og 4 spillere. Indtast venligst igen.");
                    i++;
                    p[i] = playerCar;
                }

        Player player1 = new Player("Player1", 1000);
        Player player2 = new Player("Player2", 1500);

        Field[] allFields = ArrayOfFields.getFieldArray();

        DiceRoll diceRoll = new DiceRoll();
        var scan = new Scanner(System.in);

        while (true) {
            scan.nextLine();

            diceRoll.rollDice();

            if (DiceRoll.p1Turn) {
                p1Pos =+ DiceRoll.getd1();
                p1Turn = false;
            }
            else {
                p2Pos =+ DiceRoll.getd1();
                p1Turn = true;
            }
        }
        scan.close();
      
    }
}