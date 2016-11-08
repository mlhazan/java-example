package JavaHeapSort;

/**
 * @author Hasan
 * @version java version "1.8.0_92"
 * @os windows 10
 * @date Nov 8, 2016
 */
//debug written on ipad
import java.io.*;

class Node {

     private int iData;

     public Node(int key) {
          iData = key;
     }

     public int getKey() {
          return iData;
     }
}
////////////////////////////////////////////////////////////////////////////////

class Heap {

     private final Node heapArray[];
     private int currentSize;
     private final int maxSize;

     public Heap(int max) {
          maxSize = max;
          currentSize = 0;
          heapArray = new Node[maxSize];
     }

     //-------------------------------------------------------------------------
     public void insertAt(int index, Node newNode) {
          heapArray[index] = newNode;

     }

     public void incrementSize() {
          currentSize++;
     }

     //-------------------------------------------------------------------------
     public void displayArray() {
          for (Node heapArray1 : heapArray) {
               System.out.print(heapArray1.getKey() + " ");
          }
          System.out.println();
     }

     //-------------------------------------------------------------------------
     public void trickleDown(int index) {
          int largerChild;
          Node top = heapArray[index];       // save root
          while (index < currentSize / 2) // while node has at
          {                               //    least one child,
               int leftChild = 2 * index + 1;
               int rightChild = leftChild + 1;
               // find larger child
               if (rightChild < currentSize
                       && // (rightChild exists?)*/
                       heapArray[leftChild].getKey()
                       < heapArray[rightChild].getKey()) {
                    largerChild = rightChild;
               } else {
                    largerChild = leftChild;
               }
               // top >= largerChild?
               if (top.getKey() >= heapArray[largerChild].getKey()) {
                    break;
               }
               // shift child up
               heapArray[index] = heapArray[largerChild];
               index = largerChild;            // go down
          }  // end while
          heapArray[index] = top;            // root to index
     }  // end trickleDown()
// -----------------------------------------------------------------------------

     public Node remove() // delete item with max key
     {                           // (assumes non-empty list)
          Node root = heapArray[0];
          heapArray[0] = heapArray[--currentSize];
          trickleDown(0);
          return root;
     }  // end remove()
// -------------------------------------------------------------

}//class Heap
////////////////////////////////////////////////////////////////////////////////

class HeapSortApp {

     public static void main(String[] args) throws IOException {
          int size, j;

          System.out.print("Enter number of items: ");
          size = getInt();
          Heap theHeap = new Heap(size);

          for (j = 0; j < size; j++) {
               int random = j*20;//(int) (java.lang.Math.random() * 100);
               Node newNode = new Node(random);
               theHeap.insertAt(j, newNode);
               theHeap.incrementSize();
          }
          System.out.print("Random Array: ");
          theHeap.displayArray();

          for (j = size / 2 - 1; j >= 0; j--) {
               theHeap.trickleDown(j);
          }

          System.out.print("Heap : ");
          theHeap.displayArray();

          for (j = size - 1; j >= 0; j--) {
               Node biggestNode = theHeap.remove();
               theHeap.insertAt(j, biggestNode);

          }
          System.out.println();
          System.out.print("Sorted Array: ");
          theHeap.displayArray();
     }

     public static int getInt() throws IOException {
          InputStreamReader is = new InputStreamReader(System.in);
          BufferedReader br = new BufferedReader(is);
          String s = br.readLine();
          return Integer.parseInt(s);
     }
     //-------------------------------------------------------------------------
}
