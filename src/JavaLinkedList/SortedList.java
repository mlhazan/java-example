package JavaLinkedList;

class Link6 {

     public long dData; // data item
     public Link6 next; // next link in list
// -------------------------------------------------------------

     public Link6(long dd) // constructor
     {
          dData = dd;
     }
// -------------------------------------------------------------

     public void displayLink() // display this link
     {
          System.out.print(dData + " ");
     }

} // end class Link
////////////////////////////////////////////////////////////////

class SortedList {

     private Link6 first; // ref to first item on list
// -------------------------------------------------------------

     public SortedList() // constructor
     {
          first = null;
     }
// -------------------------------------------------------------

     public boolean isEmpty() // true if no links
     {
          return (first == null);
     }
// -------------------------------------------------------------

     public void insert(long key) // insert, in order
     {
          Link6 newLink = new Link6(key); // make new link
          Link6 previous = null; // start at first
          Link6 current = first;
          // until end of list
          while (current != null && key > current.dData) { // or key > current,
               previous = current;
               current = current.next; // go to next item
          }
          if (previous == null) {// at beginning of list
               first = newLink; // first --> newLink
          }
          else { // not at beginning
               first.next = newLink; // old prev --> newLink
          }
          newLink.next = current; // newLink --> old current
     } // end insert()
// -------------------------------------------------------------

     public Link6 remove() // return & delete first link
     { // (assumes non-empty list)
          Link6 temp = first; // save first
          first = first.next; // delete first
          return temp; // return value
     }
// -------------------------------------------------------------

     public void displayList() {
          System.out.print("List (first-->last): ");
          Link6 current = first; // start at beginning of list

          while (current != null) // until end of list,
          {
               current.displayLink(); // print data
               current = current.next; // move to next link
          }
          System.out.println("");
     }
} // end class SortedList
////////////////////////////////////////////////////////////////

class SortedListApp {

     public static void main(String[] args) { // create new list
          SortedList theSortedList = new SortedList();
          theSortedList.insert(40); // insert 2 items
          theSortedList.insert(20);
          theSortedList.displayList(); // display list
          theSortedList.insert(10); // insert 3 more items
          theSortedList.insert(30);
          theSortedList.insert(50);
          theSortedList.displayList(); // display list
          theSortedList.remove(); // remove an item
          theSortedList.displayList(); // display list
     } // end main()
} // end class SortedListApp
////////////////////////////////////////////////////////////////
