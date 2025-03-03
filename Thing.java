import java.util.*

public abstract class Thing {
    // dir: 0=North, 1=East, 2=South, 3=West.
    // timeSinceLast: this is only important for "TypeB" Things.
    public int row, col, dir, timeSinceLast;
    public char lab = 'r';
    public boolean isTypeB;

    public void rightTurn(Thing t) {
    t.dir = (t.dir + 1) % 4;
  }

  public void leftTurn(Thing t) {
    t.dir = (t.dir + 3) % 4;
  }

  public void maybeTurn(Thing t) {
    int i = rand.nextInt(3);

    if (t.isTypeB) {
      t.timeSinceLast++;

      if (t.timeSinceLast == 10) {
        t.timeSinceLast = 0;

        if (i == 1) {
          rightTurn(t);
        }

        if (i == 2) {
          leftTurn(t);
        }
      }
    } else   {
      if (i == 1) {
        rightTurn(t);
      }

      if (i == 2) {
        leftTurn(t);
      }
    }
  }

  public void step(Thing t) {
    final int[] dc = {
      0, 1, 0, -1
    }, dr = {
      1, 0, -1, 0
    };
    t.row += dr[t.dir];
    t.col += dc[t.dir];
  }
  }