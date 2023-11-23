package monopoly;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GameBoardTests {

    @Test
    void testGetField() {
        GameBoard gameBoard = new GameBoard();

        Field[] fields = gameBoard.getFields();
        for (int i = 0; i < fields.length; i++) {
            Assertions.assertSame(fields[i], gameBoard.getField(i));
        }
        
        Assertions.assertNull(gameBoard.getField(-1));
        Assertions.assertNull(gameBoard.getField(fields.length));
    }
}
