import java.util.*;

public class ThingList {
    private Node head;

    private class Node {
        public Thing data;
        public Node next;

        public Node (Thing t) {
            this.data = t;
            this.next = null;
        }
    }

    public void addThing (Thing t) {
        Node newThing = new Node(t);
        Node temp = head;

        if (head == null) {
            head = newThing;
        }
        else {
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newThing;
        }
    }

    // Print out each thing.
      // (SEEMS LIKE A NICE PRINTALL() METHOD CALL WOULD WORK HERE)
      // (SEEMS LIKE A toString() METHOD IN THE CLASS WOULD ALSO BE NICE)
      /*
      for( Node T = L; T != null; T = T.next )
        System.out.println(T.data.row + " " + T.data.col + " " + T.data.lab);

      System.out.println("done");
      System.out.flush();

      // Move each thing.
      // (SEEMS LIKE A NICE MOVEALL() METHOD CALL WOULD WORK HERE)
      for( Node T = L; T != null; T = T.next ) {
        maybeTurn(T.data);
        step(T.data);
      }
      */

    public void printAll() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data.row + " " + temp.data.col + " " + temp.data.lab);
            temp = temp.next;
        }
        System.out.println("done");
        System.out.flush();
    }

    public  void moveAll(Random rand) {
        Node temp = head;
        while (temp != null) {
            temp.data.maybeTurn(rand);
            temp.data.step();
            temp = temp.next;
        }
    }
}