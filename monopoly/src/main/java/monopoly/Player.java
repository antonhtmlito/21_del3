package monopoly;
import java.util.Random;
import java.util.Scanner;

public class Player {
    private String playerName;
    private int playerMoney;
    private boolean inJail;
    private boolean hasFreeJailCard;
    private int position;
    private String symbol;
    private static GameBoard gameBoard; 

    public Player(String playerName) {
        this.playerName = playerName;
        this.playerMoney = 20000;
        this.inJail = false;
        this.hasFreeJailCard = false;
        this.position = 0;
    }

    public void takeTurn() {
        Scanner scanner = new Scanner(System.in);
        if (this.inJail) {
            JailField.doAction(this);
        }
        System.out.println(playerName + "'s turn. Press Enter to roll the die.");
        scanner.nextLine();

        int eyes = rollDice();
        System.out.println("__________________________________________________________________________________________________\n");
        System.out.println("You rolled " + eyes);

        move(eyes);

        System.out.println("Current position: " + (position));

        Field field = gameBoard.getField(position);

        if (field instanceof PropertyField) {
            PropertyField propertyField = (PropertyField) field;
            if (propertyField.getOwner() == null) {
                System.out.println("You've landed on " + propertyField.getName() + ". This property is not owned. You have " + playerMoney + " money and the property costs " + propertyField.getValue() + ". Do you want to buy it? (Y/N)");
                String response = scanner.nextLine().toUpperCase();

                if (response.equals("Y")) {
                    buyField(propertyField);
                }
            } else if (!propertyField.getOwner().equals(this)) {
                System.out.println("You've landed on " + propertyField.getName() + ". But it's unfortunately already owned by " + propertyField.getOwner() + " and you must therefor pay them rent.");
                payRent(propertyField);
            } else if (propertyField.getOwner().equals(this)) {
                System.out.println("You've landed on " + propertyField.getName() + " but you already own it.");
            }
        }
        else if (field instanceof ChanceField) {
            System.out.println("You've landed on a chance field!");
            pickChance();
        }
        else if (field instanceof FreeField) {
            System.out.println("you've landed on a free field! Just relax and wait for you next turn.");
        }
        else if (field instanceof JailField) {
            System.out.println("Ah! You've landed on a jail field! No worries though. You're just visiting");
        }
        else if (field instanceof GoToJailField) {
            System.out.println("You got caught doing tax fraud!");
            GoToJailField goToJailField = (GoToJailField) field;
            goToJailField.doAction(this);
        }
        
    }

    private void buyField(PropertyField propertyField) {
        if (playerMoney >= propertyField.getValue()) {
            playerMoney -= propertyField.getValue();
            propertyField.setOwner(this);
            System.out.println(playerName + " bought " + propertyField.getName() +
                    " for $" + propertyField.getValue());
        } else {
            System.out.println(playerName + " does not have enough money to buy " + propertyField.getName());
        }
    }     

    void payRent(PropertyField propertyField) {
        int rentAmount = propertyField.getRent();

        if (playerMoney >= rentAmount) {
            playerMoney -= rentAmount;
            propertyField.getOwner().receiveRent(rentAmount);
            System.out.println(playerName + " paid $" + rentAmount + " rent to " + propertyField.getOwner().getPlayerName());
        } else {
            System.out.println(playerName + " does not have enough money to pay rent to " + propertyField.getOwner().getPlayerName());
        }
    }

    public void useJailFreeCard() {
        if (hasFreeJailCard) {
            System.out.println(playerName + " used a jail-free card.");
            hasFreeJailCard = false;
        } else {
            System.out.println(playerName + " doesn't have a jail-free card.");
        }
    }

    public void setGameBoard(GameBoard gameBoard) {
        Player.gameBoard = gameBoard;
    }    

    public void getReward(FreeField field) {
        playerMoney += 2000;
        System.out.println(playerName + " received a reward!");
    }

    private int[] cards = new int[6];

    public void pickChance() {
        System.out.println("Player: " + playerName + " pickup chance.");

        int temp = new Random().nextInt(cards.length);

        if (temp == 0) {
            System.out.println("Move to the start and receive 2000 Money.");
            position = 0;
            playerMoney += 2000;
        } else if (temp == 1) {
            System.out.println("Move 5 fields forward.");
            position += 5;
            if (position >= 24) {
                getReward(null);
            }
        } else if (temp == 2) {
            System.out.println("Move to the next field");
            position += 1;
            if (position >= 24) {
                getReward(null);
            }
        } else if (temp == 3) {
            System.out.println("You ate too much candy. Pay 2000 money to the bank.");
            playerMoney -= 2000;
        } else if (temp == 4) {
            System.out.println("You have made all your homework. Receive 2000 money from the bank.");
            playerMoney += 2000;
        } else if (temp == 5) {
            System.out.println("You received a get out of jail free card. Keep it until you need it.");
            hasFreeJailCard = true;
        }
    }

    public void receiveRent(int rentAmount) {
        playerMoney += rentAmount;
        System.out.println(playerName + " received rent of $" + rentAmount);
    }

    public void setInJail(boolean inJail) {
        this.inJail = inJail;
        position = 6;
    }

    public boolean getInJail() {
        return inJail;
    }

    public void setHasFreeJailCard(boolean hasFreeJailCard) {
        this.hasFreeJailCard = hasFreeJailCard;
    }

    public boolean getHasFreeJailCard() {
        return hasFreeJailCard;
    }

    public int getPlayerMoney() {
        return playerMoney;
    }

    public String getSymbol() {
        return symbol;
    }

    public String getPlayerName() {
        return playerName;
    }

    private int rollDice() {
        return new Random().nextInt(6) + 1;
    }

    private void move(int eyes) {
        boolean passedStart;
        if (position + eyes >= 24) {
            position = position + eyes - 24;
            passedStart = true;
        } else {
            position = position + eyes;
            passedStart = false;
        }

        if (passedStart) {
            getReward(null);
        }
    }

    public int getPosition() {
        return position;
    }

    public void setPlayerMoney(int money) {
        this.playerMoney = money;
    }
}
