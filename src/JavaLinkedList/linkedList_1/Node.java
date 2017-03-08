package JavaLinkedList.linkedList_1;

public class Node {

     Node a;
     Node b;
     int i;
     

     public Node() {
     }

     public Node(int i, Node a, Node b) {
          this.i = i;
          this.a = a;
          this.b = b;
     }

     public static void main(String[] args) {
          Node previous = null, next = null;
          Node first=null;

          for (int i = 1; i < 3; i++) {
               previous = first;
               first = new Node(i, previous, next);
               next = first;
               System.out.println(next.i);
          }

          System.out.println("");
          System.out.println("");
     }
}
