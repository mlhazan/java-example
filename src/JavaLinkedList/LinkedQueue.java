package JavaLinkedList;

class Link5 {

     Link5 next;
     long dData;
//------------------------------------------------------------------------------

     public Link5(long dd) {
          dData = dd;
     }
//------------------------------------------------------------------------------

     public void displayLink() {
          System.out.print(dData + " ");
     }
//------------------------------------------------------------------------------
}
//##############################################################################

class LinkedListQueue {

     Link5 first;
     Link5 last;
     Link5 newLink;
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

     public void insertLast(long d) {
          newLink = new Link5(d);
          if (isEmpty()) {
               first = newLink;
          } else {
               last.next = newLink;
          }
          last = newLink;

     }
//------------------------------------------------------------------------------

     public long deleteFast() {
          { // (assumes non-empty list)
               long temp = first.dData;
               if (first.next == null) // if only one item
               {
                    last = null; // null <-- last
               }
               first = first.next; // first --> old next
               return temp;
          }
     }

//------------------------------------------------------------------------------
     public void displayList() {
          Link5 current = first; // start at beginning of list
          while (current != null) // until end of list,
          {
               current.displayLink(); // print data
               current = current.next; // move to next link
          }
          System.out.println();

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

     public void push(long dd) {
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

          linkedQueue.displayStack();
          linkedQueue.pop();
          linkedQueue.pop();
          //linkedQueue.pop();
          
          linkedQueue.displayStack();
     }
}
