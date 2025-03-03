import java.util.*;

public class DotChaser {
  
  /**
   * This static method is ok :)
   */
  public static void main(String[] args) {
    int N = 200;

    if( args.length != 0 )
      N = Integer.parseInt(args[0]);

    // INSTEAD OF A NODE, CREATE SOMETHING MORE USER-FRIENDLY.
    Node L = null;
    int count = 0;
    ThingList list = new ThingList();

    while( true ) {
      // Every N rounds, add another typeA and typeB Thing.
      if( count % N == 0 ) {

        // Add a typeA thing to the list.
        // (GEE, THAT'S A LOT OF CODE FOR JUST CREATING ONE THING)
        Thing tA = new TypeA(45, 50, 0, 'r');

        // Add a typeB thing to the list
        Thing tB = new TypeB(55, 50, 0, 'b');
        
        // Add a typeC thing to the list
        Thing tC = new TypeC(55, 50, 0, 'y');

        list.addThing(tA);
        list.addThing(tB);
        list.addThing(tC);
      }

      count++;
      Random rand = new Random(System.currentTimeMillis());
      list.printAll();
      list.moveAll(rand);
    }
  }
}
