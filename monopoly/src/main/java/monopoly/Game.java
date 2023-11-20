package monopoly;

import java.util.Random;
import java.util.Scanner;

public class Game {

    int playerCount = 0;
    int currentPlayer = 1;
    Scanner scanner = new Scanner(System.in);
    Player[] players;
    GameBoard gameBoard = new GameBoard();

    public void startGame() {
        System.out.println("Velkommen til Monopoly Juinor");

        while (true) {
            System.out.println("");
            System.out.println("Hvor mange spillere skal spille.");
            System.out.println("Vælg mellem 2, 3 eller 4 spiller eller S for stop");

            String input = scanner.next();

            if (input.toLowerCase().equals("s")) {
                return;
            }
            if (input.equals("2") || input.equals("3") || input.equals("4")) {
                playerCount = Integer.parseInt(input);
                players = new Player[playerCount];
                for (int i = 0; i < playerCount; i++) {
                    players[i] = new Player(
                            "Player " + (i + 1),
                            1000,
                            false,
                            false,
                            0,
                            getSymbol(i)

                    );
                }
                playGame();
                continue;
            }
            System.out.println("Ugyldigt valg. prøv igen");
            System.out.println("");
        }

    }

    public void displayGame() {
        System.out.println("");
        System.out.println("");
        // System.out.print(" |");
        for (int i = 0; i < playerCount; i++) {
            Player p = players[i];
            System.out.print(p.getSymbol() + p.getPlayerName() + " $" + p.getPlayerMoney() + "   ");
        }
        System.out.println();
        for (int i = 0; i < 24; i++) {
            if (i != 0) {
                System.out.print("|");
            }
            System.out.print(String.format("%3d ", (i + 1)));

        }
        System.out.println();
        /*
         * for (int i = 0; i < 24; i++) {
         * 
         * if (i != 0) {
         * System.out.print("|");
         * }
         * System.out.print(String.format("%3s ", gameBoard.getField(i).getSymbol()));
         * 
         * }
         * System.out.println();
         */
        for (int i = 0; i < playerCount; i++) {
            Player p = players[i];
            System.out.print("  ");

            for (int j = 0; j < 24; j++) {
                Field field = gameBoard.getField(j);
                if (j != 0) {
                    System.out.print("    ");
                }
                if (p.getPosition() == j) {
                    System.out.print(p.getSymbol());
                } else {
                    if (isOwner(field, p)) {
                        System.out.print("⌂");
                    } else {
                        System.out.print(" ");
                    }
                }

            }
            System.out.println();
        }

    }

    public boolean isOwner(Field field, Player player) {
        if (field instanceof PropertyField) {
            PropertyField propertyField = (PropertyField) field;
            if (propertyField.getOwner() != null) {
                return player.equals(propertyField.getOwner());
            }
        }
        return false;

    }

    public int rollDice() {
        return new Random().nextInt(12) + 1;
    }

    public void playGame() {
        while (true) {

            displayGame();
            System.out.println("Roll the dice, Player " + currentPlayer);
            scanner.next();
            int eyes = rollDice();
            System.out.println("You rolled  " + eyes);
            Player p = players[currentPlayer - 1];

            boolean passedStart = p.move(eyes);

            // check if propertyfield and owned
            // if not owned buy it
            Field field = gameBoard.getFields()[p.getPosition()];
            if (field instanceof PropertyField) {
                PropertyField propertyField = (PropertyField) field;
                if (propertyField.getOwner() == null) {
                    propertyField.setOwner(p);
                }

            }

            // next player
            if (currentPlayer == playerCount) {
                currentPlayer = 1;
            } else {
                currentPlayer++;
            }
        }
    }

    public String getSymbol(int symbolNumber) {

        switch (symbolNumber) {
            case 0:
                return "🐶";
            case 1:
                return "🐱";
            case 2:
                return "🚢";
            case 3:
                return "🚗";
            default:
                return "❌";

        }

    }

    public static void main(String[] args) {
        new Game().startGame();
    }
    /*
     * public static void main(String[] args) {
     * System.out.println("Spillet starter!");
     * Player player1 = new Player("Spiller1", 1000);
     * System.out.println(player1.toString());
     * Player player2 = new Player("Spiller2", 1500);
     * System.out.println(player2.toString());
     * Field[] allFields = GameBoard.getFieldArray();
     * 
     * System.out.println("Spillet er sluttet!");
     * }
     */

}
