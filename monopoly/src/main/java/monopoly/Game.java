package monopoly;

import java.util.Random;
import java.util.Scanner;

public class Game {
    int playerCount = 0;
    int currentPlayer = 1;
    Scanner scanner = new Scanner(System.in);
    Player[] players;

    public static class Player {
        int position;

        public int getPosition() {
            return position;
        }

        public void setPosition(int position) {
            this.position = position;
        }

        public void move(int eyes) {
            if (position + eyes >= 20) {
                position = position + eyes - 20;
            } else {
                position = position + eyes;
            }
        }

        public Player(int position) {
            this.position = position;
        }

    }

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
                    players[i] = new Player(0);
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
        System.out.println("#####");
        System.out.print("         |");
        for (int i = 0; i < 20; i++) {
            System.out.print(String.format("%3d |", i));
        }
        System.out.println();

        for (int i = 0; i < playerCount; i++) {
            System.out.print("Player " + (i+1)+" |  ");

            for(int j=0;j<players[i].getPosition();j++){
               System.out.print("     ");
            }
            System.out.println("X");
        }

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

            players[currentPlayer - 1].move(eyes);
            // next player
            if (currentPlayer == playerCount) {
                currentPlayer = 1;
            } else {
                currentPlayer++;
            }
        }
    }

    public static void main(String[] args) {
        new Game().startGame();
    }

}

/**
 * int playerAmount=0;
 * String playerCar="";
 * String p1="";
 * String p2="";
 * String p3="";
 * String p4="";
 * int p1Pos=0;
 * int p2Pos=0;
 * boolean p1Turn=false;
 * boolean p2Turn=false;
 * 
 * try (Scanner scan = new Scanner(System.in)) {
 * 
 * String command = scan.nextLine();
 * switch (command) {
 * case "2":
 * playerAmount = 2;
 * break;
 * case "3":
 * playerAmount = 3;
 * break;
 * case "4":
 * playerAmount = 4;
 * break;
 * default:
 * System.out.println("I kan kun være mellem 2 og 4 spillere. Indtast venligst
 * igen.");
 * return;
 * }
 * 
 * int[] p = new int[playerAmount];
 * int i = 1;
 * while (i <= playerAmount)
 * System.out.println("Vælg spillebrik for spiller" + i);
 * switch (command) {
 * case "Hund":
 * playerCar = "Hund";
 * break;
 * case "Kat":
 * playerCar = "Kat";
 * break;
 * case "Skib":
 * playerCar = "Skib";
 * break;
 * case "Bil":
 * playerCar = "Bil";
 * break;
 * default:
 * System.out.println("I kan kun være mellem 2 og 4 spillere. Indtast venligst
 * igen.");
 * i++;
 * //p[i] = playerCar;
 * }
 * 
 * Player player1 = new Player("Player1", 1000);
 * Player player2 = new Player("Player2", 1500);
 * 
 * Field[] allFields = ArrayOfFields.getFieldArray();
 * 
 * DiceRoll diceRoll = new DiceRoll();
 * 
 * while (true) {
 * scan.nextLine();
 * 
 * diceRoll.rollDice();
 * 
 * if (p1Turn) {
 * p1Pos = +DiceRoll.getd1();
 * p1Turn = false;
 * } else {
 * p2Pos = +DiceRoll.getd1();
 * p1Turn = true;
 * }
 * }
 * }
 * }
 * 
 * 
 * }
 * }
 */
