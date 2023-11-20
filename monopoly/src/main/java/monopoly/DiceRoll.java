package monopoly;

import java.util.Random;

class DiceRoll {
    private static int d1;
    private int p1Pos;
    private int p2Pos;
    private static boolean p1Turn;

    public DiceRoll() {
        p1Pos = 0;
        p2Pos = 0;
        p1Turn = true;
    }

    public void rollDice() {
        Random ran = new Random();

        d1 = ran.nextInt(6) + 1;

        if (p1Turn) {
            p1Pos += d1;
        }
        else {
            p2Pos += d1;
        }
        
    }

    public static int getd1() {
        return d1;
    }

    public int getp1Pos() {
        if (p1Pos >= 24) {
            return p1Pos - 24;
        } 
        else {
            return p1Pos;
        }
    }

    public int getp2Pos() {
        if (p2Pos >= 24) {
            return p2Pos - 24;
        } 
        else {
            return p2Pos;
        }
    }

}
