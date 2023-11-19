package monopoly;
public class Game {
    
   
        public static void main(String[] args) {
            System.out.println("Start of game!");
            Player player1 = new Player("Player1", 1000);
            System.out.println(player1.toString());
            Player player2 = new Player("Player2", 1500);
            System.out.println(player2.toString());
            Field[] allFields = ArrayFields.getFieldArray();
          
            System.out.println("End of game!");
        }
    

}
