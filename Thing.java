import java.util.*;

public abstract class Thing {
    
    public Random rand = new Random (System.currentTimeMillis());

    protected int row;
    protected int col;
    protected int dir;
    int timeSinceLast;
    protected char lab = 'r';
    boolean isTypeB;

    public Thing (int row, int col, int dir, char lab) {
        this.row = row;
        this.col = col;
        this.dir = dir;
        this.lab = lab;
    }

    public void rightTurn() {
        this.dir = (dir + 1) % 4;
    }

    public void leftTurn() {
        this.dir = (dir + 3) % 4;
    }

    public void step() {
        final int[] dc = {0, 1, 0, -1},
                    dr = {1, 0, -1, 0};

        if (dir >= 0 && dir < dc.length) {
            col += dc[dir];
            row += dr[dir];
        }
    }

    public abstract void maybeTurn (Random rand);
}

/*
    // dir: 0=North, 1=East, 2=South, 3=West.
    // timeSinceLast: this is only important for "TypeB" Things.
    public int row, col, dir, timeSinceLast;
    public char lab = 'r';
    public boolean isTypeB;

*/

 /* public void rightTurn(Thing t) {
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
  */