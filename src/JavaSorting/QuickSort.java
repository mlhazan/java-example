package JavaSorting;

class QuickSort {

     private final int[] theArray; // ref to array theArray
     private int nElems; // number of data items
//------------------------------------------------------------------------------

     public QuickSort(int max) // constructor
     {
          theArray = new int[max]; // create the array
          nElems = 0; // no items yet
     }
//------------------------------------------------------------------------------

     public void insert(int value) // put element into array
     {
          theArray[nElems] = value; // insert it
          nElems++; // increment size
     }
//------------------------------------------------------------------------------

     public void display() // displays array contents
     {
          System.out.print("A = ");
          for (int j = 0; j < nElems; j++) // for each element,
          {
               System.out.print(theArray[j] + " "); // display it
          }
          System.out.println();
     }
//------------------------------------------------------------------------------

     public void quickSort() {
          recQuickSort(0, nElems - 1);
     }
//------------------------------------------------------------------------------

     public void recQuickSort(int left, int right) {
          if (right - left <= 0) // if size <= 1,
          {
               return; // already sorted
          } else // size is 2 or larger
          {
               int pivot = theArray[right]; // rightmost item
// partition range
               int partition = partitionIt(left, right, pivot);
               recQuickSort(left, partition - 1); // sort left side
               recQuickSort(partition + 1, right); // sort right side
          }
     } // end recQuickSort()
//------------------------------------------------------------------------------

     public int partitionIt(int left, int right, int pivot) {
          int leftPtr = left - 1; // left (after ++)
          int rightPtr = right; // right-1 (after --)
          while (true) {
               // find bigger item
               while (theArray[++leftPtr] < pivot); // (nop) 
               //find smaller item
               while (rightPtr > 0 && theArray[--rightPtr] > pivot); // (nop)
               if (leftPtr >= rightPtr) // if pointers cross,
               {
                    break; // partition done
               } else // not crossed, so
               {
                    swap(leftPtr, rightPtr); // swap elements
               }
          } // end while(true)
          swap(leftPtr, right); // restore pivot
          return leftPtr; // return pivot location
     } // end partitionIt()
//------------------------------------------------------------------------------

     public void swap(int dex1, int dex2) // swap two elements
     {
          int temp = theArray[dex1]; // A into temp
          theArray[dex1] = theArray[dex2]; // B into A
          theArray[dex2] = temp; // temp into B

          System.out.print("A = ");
          for (int j = 0; j < nElems; j++) // for each element,
          {
               System.out.print(theArray[j] + " "); // display it
          }
          System.out.println();
     } // end swap(
//------------------------------------------------------------------------------
} // end class QuickSort
////////////////////////////////////////////////////////////////////////////////

class QuickSort1App {

     public static void main(String[] args) {
          int maxSize = 10; // array size
          QuickSort arr;
          arr = new QuickSort(maxSize); // create array
//          for (int j = 0; j < maxSize; j++) // fill array with
//          { // random numbers
//               int n = (int) (java.lang.Math.random() * 99);
//               arr.insert(n);
//          }
          arr.insert(42);
          arr.insert(89);
          arr.insert(63);
          arr.insert(12);
          arr.insert(94);
          arr.insert(27);
          arr.insert(78);
          arr.insert(3);
          arr.insert(50);
          arr.insert(36);
          arr.display(); // display items
          arr.quickSort(); // quicksort them
          arr.display(); // display them again
     } // end main()
} // end class QuickSort1App
