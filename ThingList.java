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
}