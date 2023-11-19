package monopoly;

public class ArrayFields {
    private static Field[] fields = {
       new FreeField("Start", 0, 2000),
       new PropertyField("BURGERBAREN", 1, Color.BROWN, 1000, 1000),
       new PropertyField("PIZZARIAET", 2, Color.BROWN, 1000, 1000),
       new ChanceField("CHANCE", 3),
       new PropertyField("SLIKBUTIKKEN", 4, Color.LIGHTBLUE, 1000, 1000),
       new PropertyField("ISKIOSKEN", 5, Color.LIGHTBLUE, 1000, 1000),        
       new JailField("I FÆNGSEL PÅ BESØG", 6),
       new PropertyField("MUSEET", 7, Color.PINK, 2000, 2000),
       new PropertyField("BIBLOTEKET", 8, Color.PINK, 2000, 2000),
       new ChanceField("CHANCE", 9),
       new PropertyField("SKATERPARKEN", 10, Color.LIGHTYELLOW, 2000, 2000),
       new PropertyField("SWIMMINGPOOLEN", 11, Color.LIGHTYELLOW, 2000, 2000),
       new FreeField("GRATIS PARKERING",12),
       new PropertyField("SPILLEHALLEN", 13, Color.RED, 3000, 3000),
       new PropertyField("BIOGRAFEN", 14, Color.RED, 3000, 3000),
       new ChanceField("CHANCE",15),
       new PropertyField("LEGETØJSBUTIKKEN", 16, Color.YELLOW, 3000, 3000),
       new PropertyField("DYREHANDLEN", 17, Color.YELLOW, 3000, 3000),
       new GoToJailField("GÅ I FÆNGSEL", 18),
       new PropertyField("BOWLINGHALLEN", 19, Color.GREEN, 4000, 4000),
       new PropertyField("ZOO", 20, Color.GREEN, 4000, 4000),
       new ChanceField("CHANCE", 21),      
       new PropertyField("VANDLANDET", 22, Color.BLUE, 5000, 5000),
       new PropertyField("STRANPROMENADEN", 23, Color.BLUE, 5000, 5000)
    };
    
     public static Field[] getFieldArray() {
         return fields;
     }
}
