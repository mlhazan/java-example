package JavaLinkedList;

class Link5 {

     Link5 next;
     long dData;
//------------------------------------------------------------------------------

     public Link5(long dd) {
          dData = dd;
     }
//------------------------------------------------------------------------------

     public void LinkDisplay() {
          System.out.println(dData + " ");
     }
//------------------------------------------------------------------------------
}
//##############################################################################

class LinkedListQueue {

     Link5 first;
     Link5 last;
     LinkedList queue;
//------------------------------------------------------------------------------     

     public LinkedListQueue() {
          first = null;
          last = null;
     }
     // -------------------------------------------------------------------------

     public boolean isEmpty() // true if list is empty
     {
          return (first == null);
     }
// -----------------------------------------------------------------------------

     public void insertLast(float d) {

     }
//------------------------------------------------------------------------------
     public long deleteFast() {
          return 0;
     }

//------------------------------------------------------------------------------
     public void displayList() {

     }
//------------------------------------------------------------------------------
}
//##############################################################################

public class LinkedQueue {

     LinkedListQueue linkListQueue;

     public LinkedQueue() {
          linkListQueue = new LinkedListQueue();
     }
//------------------------------------------------------------------------------
     public void push(float dd) {
          linkListQueue.insertLast(dd);
     }
//------------------------------------------------------------------------------
     public long pop() {
          return linkListQueue.deleteFast();
     }
//------------------------------------------------------------------------------
     public boolean isEmpty() // true if stack is empty
     {
          return (linkListQueue.isEmpty());
     }
//------------------------------------------------------------------------------

     public void displayStack() {
          System.out.print("Stack (top-->bottom): ");
          linkListQueue.displayList();
     }
}
//##############################################################################

class LinkedQueueApp {

     public static void main(String args[]) {
          LinkedQueue linkedQueue = new LinkedQueue();
          linkedQueue.push(30);
          linkedQueue.push(20);
          linkedQueue.push(40);
          linkedQueue.push(50);
          linkedQueue.push(70);

          linkedQueue.pop();
          linkedQueue.pop();
          linkedQueue.pop();

     }

}
