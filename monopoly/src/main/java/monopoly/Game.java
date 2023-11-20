package monopoly;
public class Game {
    
   
        public static void main(String[] args) {
            System.out.println("Spillet starter!");
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
            while (i <= playerAmount) {
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
            }
            Player player1 = new Player("Spiller1", 1000);
            System.out.println(player1.toString());
            Player player2 = new Player("Spiller2", 1500);
            System.out.println(player2.toString());
            Field[] allFields = ArrayFields.getFieldArray();

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
          
            System.out.println("Spillet er sluttet!");
        }
    

}
