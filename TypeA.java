import java.util.*;

public class TypeA extends Thing {
    public TypeA (int row, int col, int dir, char lab) {
        super (row, col, dir, lab);
    }

    public void maybeTurn (Random rand) {
        int i = rand.nextInt(3);
        if (i == 1) {
            rightTurn();
        }
        if (i == 2) {
            leftTurn();
        }
    }
}