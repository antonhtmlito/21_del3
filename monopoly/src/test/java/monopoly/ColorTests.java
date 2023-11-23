package monopoly;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ColorTests {
    
    @Test
    void testColorConstants() {
        Assertions.assertEquals(0, Color.BROWN);
        Assertions.assertEquals(1, Color.LIGHTBLUE);
        Assertions.assertEquals(2, Color.PINK);
        Assertions.assertEquals(3, Color.LIGHTYELLOW);
        Assertions.assertEquals(4, Color.RED);
        Assertions.assertEquals(5, Color.YELLOW);
        Assertions.assertEquals(6, Color.GREEN);
        Assertions.assertEquals(7, Color.BLUE);
    }

}
