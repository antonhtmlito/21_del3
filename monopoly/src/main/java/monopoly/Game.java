package monopoly;

import java.util.Random;
import java.util.Scanner;

public class Game {
    
   int playerCount = 0;
    int currentPlayer = 1;
    Scanner scanner = new Scanner(System.in);
    Player[] players;


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
                        "Player "+i,// playerName, 
                        1000, //playerMoney, 
                        false, //inJail, 
                        false,  //hasFreeJailCard, 
                        0,  // currentFieldPosition,
                        0 //position

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
        /*  public static void main(String[] args) {
            System.out.println("Spillet starter!");
            Player player1 = new Player("Spiller1", 1000);
            System.out.println(player1.toString());
            Player player2 = new Player("Spiller2", 1500);
            System.out.println(player2.toString());
            Field[] allFields = GameBoard.getFieldArray();
          
            System.out.println("Spillet er sluttet!");
        } */
    

}
