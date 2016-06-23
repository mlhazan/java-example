package JavaLinkedList;

class Link2 {

     public int iData;
     public double dData;
     public Link2 next;
//------------------------------------------------------------------------------

     public Link2(int id, double dd) {
          iData = id;
          dData = dd;
     }
//------------------------------------------------------------------------------

     public void displayLink() {
          System.out.print("[" + iData + ", " + dData + "] ");
     }
//------------------------------------------------------------------------------
}
//##############################################################################

class LinkList2 {

     private Link2 first;
//------------------------------------------------------------------------------

     public LinkList2() {
          first = null;
     }
//------------------------------------------------------------------------------

     public void insertFirst(int id, double dd) {
          Link2 newLink = new Link2(id, dd);
          newLink.next = first;
          first = newLink;
     }
//------------------------------------------------------------------------------

     public Link2 find(int key) {
          Link2 current = first;
          while (current.iData != key) {
               if (current.next == null) {
                    return null;
               } else {
                    current = current.next;
               }
          }
          return current;
     }
//------------------------------------------------------------------------------

     public Link2 delete(int key) // delete link with given key
     { // (assumes non-empty list)
          Link2 current = first; // search for link
          Link2 previous = first;
          while (current.iData != key) {
               if (current.next == null) {
                    return null; // didn’t find it
               } else {
                    previous = current; // go to next link   
               }
               current = current.next;
          } // found it
          if (current == first) // if first link,
          {
               first = first.next; // change first
          } else // otherwise,
          {
               previous.next = current.next; // bypass it
          }
          return current;
     }
// -----------------------------------------------------------------------------

// -------------------------------------------------------------
     public void displayList() // display the list
     {
          System.out.print("List(first-- > last): ");
          Link2 current = first; // start at beginning of list
          while (current != null) // until end of list,
          {
               current.displayLink(); // print data
               current = current.next; // move to next link
          }
          System.out.println();
     }
// -------------------------------------------------------------
} // end class LinkList
////////////////////////////////////////////////////////////////

class LinkList2App {

     public static void main(String[] args) {
          LinkList2 theList = new LinkList2(); // make list
          theList.insertFirst(22, 2.99); // insert 4 items
          theList.insertFirst(44, 4.99);
          theList.insertFirst(66, 6.99);
          theList.insertFirst(88, 8.99);
          theList.displayList(); // display list
          Link2 f = theList.find(44); // find item
          if (f != null) {
               System.out.println("Found link with key " + f.iData);
          } else {
               System.out.println("Can’t find link");
          }
          Link2 d = theList.delete(66); // delete item
          if (d != null) {
               System.out.println("Deleted link with key " + d.iData);
          } else {
               System.out.println("Can't delete link");
          }
          theList.displayList(); // display list
     } // end main()
} // end class LinkList2App
////////////////////////////////////////////////////////////////
