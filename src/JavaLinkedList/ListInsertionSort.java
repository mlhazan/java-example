package JavaLinkedList;

class Link7 {

     public long dData; // data item
     public Link7 next; // next link in list
// -------------------------------------------------------------

     public Link7(long dd) // constructor
     {
          dData = dd;
     }
// -------------------------------------------------------------
} // end class Link7
////////////////////////////////////////////////////////////////

class SortedList2 {

     private Link7 first; // ref to first item on list
// -------------------------------------------------------------

     public SortedList2() // constructor (no args)
     {
          first = null;
     } // initialize list
// -------------------------------------------------------------

     public SortedList2(Link7[] linkArr) // constructor (array
     { // as argument)
          first = null; // initialize list
          for (int j = 0; j < linkArr.length; j++) // copy array
          {
               insert(linkArr[j]); // to list
          }
     }
// -------------------------------------------------------------

     public void insert(Link7 k) // insert (in order)
     {
          Link7 previous = null; // start at first
          Link7 current = first;
// until end of list,
          while (current != null && k.dData > current.dData) { // or key > current,
               previous = current;
               current = current.next; // go to next item
          }
          if (previous == null) // at beginning of list
          {
               first = k; // first --> k                **
          } else // not at beginning
          {
               previous.next = k; // old prev --> k
          }
          k.next = current; // k --> old current        **
     } // end insert()
// -------------------------------------------------------------

     public Link7 remove() // return & delete first link
     { // (assumes non-empty list)
          Link7 temp = first; // save first
          first = first.next; // delete first
          return temp; // return value
     }
// -------------------------------------------------------------
} // end class SortedList

////////////////////////////////////////////////////////////////
class ListInsertionSortApp {

     public static void main(String[] args) {
          int size = 10;
// create array of links
          Link7[] linkArray = new Link7[size];
          for (int j = 0; j < size; j++) // fill array with links
          { // random number
               int n = (int) (java.lang.Math.random() * 99);
               Link7 newLink7 = new Link7(n); // make link
               linkArray[j] = newLink7; // put in array
          }
// display array contents
          System.out.print("Unsorted array: ");
          for (int j = 0; j < size; j++) {
               System.out.print(linkArray[j].dData + " ");
          }
          System.out.println("");
// create new list
// initialized with array
          SortedList2 theSortedList = new SortedList2(linkArray);
          for (int j = 0; j < size; j++) // links from list to array
          {
               linkArray[j] = theSortedList.remove();
          }
// display array contents
          System.out.print("Sorted Array: ");
          for (int j = 0; j < size; j++) {
               System.out.print(linkArray[j].dData + " ");
          }
          System.out.println("");
     } // end main()
} // end class ListInsertionSortApp
////////////////////////////////////////////////////////////////
