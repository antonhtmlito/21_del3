package monopoly;

import java.util.Scanner;

class Game {
    public static void main(String[] args) {
        System.out.println("Indtast venligst antallet af spillere. Vælg mellem 2 og 4.");
        int playerAmount;
        String playerCar;
        String p1;
        String p2;
        String p3;
        String p4;
        try (Scanner scan = new Scanner(System.in)){

        String command = scan.nextLine();
        switch (command) {
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
                return;
        }

        // private int[] p = new int[playerAmount];
        int i = 1;
        while (i <= playerAmount)
            System.out.println("Vælg spillebrik for spiller" + i);
        switch (command) {
            case "Hund":
                playerCar = "Hund";
                break;
            case "Kat":
                playerCar = "Kat";
                break;
            case "Skib":
                playerCar = "Skib";
                break;
            case "Bil":
                playerCar = "Bil";
                break;
            default:
                System.out.println("I kan kun være mellem 2 og 4 spillere. Indtast venligst igen.");
                i++;
                // p[i] = playerCar;
        }

        Player player1 = new Player("Player1", 1000);
        Player player2 = new Player("Player2", 1500);

        Field[] allFields = ArrayOfFields.getFieldArray();

        DiceRoll diceRoll = new DiceRoll();
        

        while (true) {
            scan.nextLine();

            diceRoll.rollDice();

            // if (DiceRoll.p1Turn) {
            // p1Pos =+ DiceRoll.getd1();
            // p1Turn = false;
            // }
            // else {
            // p2Pos =+ DiceRoll.getd1();
            // p1Turn = true;
            // }
        }
}
    }
}
