import java.util.*;

public class TypeB extends Thing {

    protected int timeSinceLast;

    public TypeB (int row, int col, int dir, char lab) {
        super (row, col, dir, lab);
    }

    public void maybeTurn (Random rand) {
        int i = rand.nextInt(3);
        this.timeSinceLast++;

        if (this.timeSinceLast == 10) {
            this.timeSinceLast = 0;
            if (i == 1) {
                rightTurn();
            }
            if (i == 2) {
                leftTurn();
            }   
        }
    }
}