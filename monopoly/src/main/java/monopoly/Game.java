package monopoly;
import java.util.Scanner;

public class Game {
    private int playerCount = 0;
    private Player[] players;
    private GameBoard gameBoard = new GameBoard();
    private Scanner scanner = new Scanner(System.in);

    public void startGame() {
        System.out.println("Welcome to Monopoly Junior");
        while (true) {
            System.out.println("How many players will play? (2-4)");
            try {
                playerCount = Integer.parseInt(scanner.nextLine());
                if (playerCount >= 2 && playerCount <= 4) {
                    break;
                } else {
                    System.out.println("Invalid input. Please enter a number between 2 and 4.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number.");
            }
        }

        players = new Player[playerCount];

for (int i = 0; i < playerCount; i++) {
    System.out.println("Enter name for Player " + (i + 1) + ": ");
    String playerName = scanner.nextLine();

    players[i] = new Player(playerName);
    players[i].setGameBoard(gameBoard);
}
        while (true) {
            for (Player player : players) {
                player.takeTurn();
                displayGame();
                if (isGameOver()) {
                    endGame();
                    return;
                }
            }
        }
    }

    private void displayGame() {
        System.out.println("\nCurrent Game Board:");
        for (Player player : players) {
            System.out.println(player.getPlayerName() + "'s position: " + (player.getPosition()) + " Money: " + player.getPlayerMoney());
        }
    }

    private boolean isGameOver() {
        for (Player player : players) {
            if (player.getPlayerMoney() <= 0) {
                return true;
            }
        }
        return false;
    }

    private void endGame() {
        System.out.println("Game Over!");
    }

    public static void main(String[] args) {
        new Game().startGame();
    }
}
