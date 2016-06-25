package JavaLinkedList;

class Link4 {

     public long dData; // data item
     public Link4 next; // next link in list

// -------------------------------------------------------------
     public Link4(long dd) // constructor
     {
          dData = dd;
     }
// -------------------------------------------------------------

     public void displayLink() // display ourself
     {
          System.out.print(dData + " ");
     }
} // end class Link
////////////////////////////////////////////////////////////////

class LinkListStack {

     private Link4 first; // ref to first item on list
// -------------------------------------------------------------

     public LinkListStack() // constructor
     {
          first = null;
     } // no items on list yet
// -------------------------------------------------------------

     public boolean isEmpty() // true if list is empty
     {
          return (first == null);
     }
// -------------------------------------------------------------

     public void insertFirst(long dd) // insert at start of list
     { // make new link
          Link4 newLink4 = new Link4(dd);
          newLink4.next = first; // newLink4 --> old first
          first = newLink4; // first --> newLink4
     }
// -------------------------------------------------------------

     public long deleteFirst() // delete first item
     { // (assumes list not empty)
          Link4 temp = first; // save reference to link
          first = first.next; // delete it: first-->old next
          return temp.dData; // return deleted link
     }
// -------------------------------------------------------------

     public void displayList() {
          Link4 current = first; // start at beginning of list
          while (current != null) // until end of list,
          {
               current.displayLink(); // print data
               current = current.next; // move to next link
          }
          System.out.println("");
     }
// -------------------------------------------------------------
} // end class Link4List
////////////////////////////////////////////////////////////////

public class LinkStack {

     private LinkListStack theList;
//--------------------------------------------------------------

     public LinkStack() // constructor
     {
          theList = new LinkListStack();
     }
//--------------------------------------------------------------

     public void push(long j) // put item on top of stack
     {
          theList.insertFirst(j);
     }
//--------------------------------------------------------------

     public long pop() // take item from top of stack
     {
          return theList.deleteFirst();
     }
//--------------------------------------------------------------

     public boolean isEmpty() // true if stack is empty
     {
          return (theList.isEmpty());
     }
//--------------------------------------------------------------

     public void displayStack() {
          System.out.print("Stack (top-->bottom): ");
          theList.displayList();
     }
//--------------------------------------------------------------
} // end class Link4Stack
////////////////////////////////////////////////////////////////

class LinkStackApp {

     public static void main(String[] args) {
          LinkStack theStack = new LinkStack(); // make stack
          theStack.push(20); // push items
          theStack.push(40);
          theStack.displayStack(); // display stack
          theStack.push(60); // push items
          theStack.push(80);
          theStack.displayStack(); // display stack
          theStack.pop(); // pop items
          theStack.pop();
          theStack.displayStack(); // display stack
     } // end main()
} // end class LinkStackApp
////////////////////////////////////////////////////////////////
