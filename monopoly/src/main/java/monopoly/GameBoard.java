package monopoly;

public class GameBoard {
    private Field[] fields = {
       new FreeField("Start", 0, 2000),
       new PropertyField("BURGERBAR", 1, Color.BROWN, 1000, 1000),
       new PropertyField("PIZZARIA", 2, Color.BROWN, 1000, 1000),
       new ChanceField("CHANCE", 3),
       new PropertyField("CANDYSHOP", 4, Color.LIGHTBLUE, 1000, 1000),
       new PropertyField("ICE CREAM SHOP", 5, Color.LIGHTBLUE, 1000, 1000),        
       new JailField("VISIT AT THE PRISON", 6),
       new PropertyField("MUSEUM", 7, Color.PINK, 2000, 2000),
       new PropertyField("LIBRARY", 8, Color.PINK, 2000, 2000),
       new ChanceField("CHANCE", 9),
       new PropertyField("SKATERPARK", 10, Color.LIGHTYELLOW, 2000, 2000),
       new PropertyField("SWIMMINGPOOL", 11, Color.LIGHTYELLOW, 2000, 2000),
       new FreeField("FREE PARKING",12),
       new PropertyField("GAME HALL", 13, Color.RED, 3000, 3000),
       new PropertyField("CINEMA", 14, Color.RED, 3000, 3000),
       new ChanceField("CHANCE",15),
       new PropertyField("TOY STORE", 16, Color.YELLOW, 3000, 3000),
       new PropertyField("PET STORE", 17, Color.YELLOW, 3000, 3000),
       new GoToJailField("GO TO PRISON", 18),
       new PropertyField("BOWLING CENTER", 19, Color.GREEN, 4000, 4000),
       new PropertyField("ZOO", 20, Color.GREEN, 4000, 4000),
       new ChanceField("CHANCE", 21),      
       new PropertyField("WATER PARK", 22, Color.BLUE, 5000, 5000),
       new PropertyField("PROMENADE", 23, Color.BLUE, 5000, 5000)
    };
    
    public Field getField(int number) {
        return fields[number];
    }

    public Field[] getFields() {
        return fields;
    }

}
