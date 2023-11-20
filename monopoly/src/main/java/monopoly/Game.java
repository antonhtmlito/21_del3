package monopoly;
public class Game {
    
   
        public static void main(String[] args) {
            System.out.println("Spillet starter!");
            Player player1 = new Player("Spiller1", 1000);
            System.out.println(player1.toString());
            Player player2 = new Player("Spiller2", 1500);
            System.out.println(player2.toString());
            Field[] allFields = ArrayFields.getFieldArray();
          
            System.out.println("Spillet er sluttet!");
        }
    

}
