package monopoly;

public class GameBoard {
    private Field[] fields = {
       new FreeField("x","Start", 0, 2000),
       new PropertyField("x","BURGERBAREN", 1, Color.BROWN, 1000, 1000),
       new PropertyField("x","PIZZARIAET", 2, Color.BROWN, 1000, 1000),
       new ChanceField("x","CHANCE", 3),
       new PropertyField("x","SLIKBUTIKKEN", 4, Color.LIGHTBLUE, 1000, 1000),
       new PropertyField("x","ISKIOSKEN", 5, Color.LIGHTBLUE, 1000, 1000),        
       new JailField("x","I FÆNGSEL PÅ BESØG", 6),
       new PropertyField("x","MUSEET", 7, Color.PINK, 2000, 2000),
       new PropertyField("x","BIBLOTEKET", 8, Color.PINK, 2000, 2000),
       new ChanceField("x","CHANCE", 9),
       new PropertyField("x","SKATERPARKEN", 10, Color.LIGHTYELLOW, 2000, 2000),
       new PropertyField("x","SWIMMINGPOOLEN", 11, Color.LIGHTYELLOW, 2000, 2000),
       new FreeField("x","GRATIS PARKERING",12),
       new PropertyField("x","SPILLEHALLEN", 13, Color.RED, 3000, 3000),
       new PropertyField("x","BIOGRAFEN", 14, Color.RED, 3000, 3000),
       new ChanceField("x","CHANCE",15),
       new PropertyField("x","LEGETØJSBUTIKKEN", 16, Color.YELLOW, 3000, 3000),
       new PropertyField("x","DYREHANDLEN", 17, Color.YELLOW, 3000, 3000),
       new GoToJailField("x","GÅ I FÆNGSEL", 18),
       new PropertyField("x","BOWLINGHALLEN", 19, Color.GREEN, 4000, 4000),
       new PropertyField("x","ZOO", 20, Color.GREEN, 4000, 4000),
       new ChanceField("x","CHANCE", 21),      
       new PropertyField("x","VANDLANDET", 22, Color.BLUE, 5000, 5000),
       new PropertyField("x","STRANPROMENADEN", 23, Color.BLUE, 5000, 5000)
    };
    
    public Field getField(int number) {
         return fields[number];
     }

     public Field[] getFields() {
         return fields;
     }

}
