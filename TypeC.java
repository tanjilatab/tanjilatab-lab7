import java.util.*;

public class TypeC extends Thing {
    public TypeC(int row, int col, int dir, char lab) {
        super (row, col, dir, lab);
    }
    int counter = 0;

    public void maybeTurn (Random rand) {
        int i = rand.nextInt(3);
        if (counter % 10 == 0) {
            leftTurn();
        }
        else {
            rightTurn();
            leftTurn();
        }
        counter++;
        rightTurn();
    }
}