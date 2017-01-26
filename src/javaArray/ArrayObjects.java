
package javaArray;


/**
 * @author Hasan
 * @version java version "1.8.0_92"
 * @os windows 10
 * @date Nov 8, 2016
 */
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
     public void insertAt(int index, Node newNode){
          heapArray[index] = newNode;
          currentSize++;
     }
     //-------------------------------------------------------------------------
     public void displayArray(){
          for (Node heapArray1 : heapArray) {
               System.out.print(heapArray1.getKey() + " ");
          }
          System.out.println();
     }
     //-------------------------------------------------------------------------    
}//class Heap
////////////////////////////////////////////////////////////////////////////////

class HeapSortApp{
     public static void main(String[] args) throws IOException {
          int size, j;
          
          System.out.print("Enter number of items: ");
          size = getInt();
          Heap theHeap = new Heap(size);
          
          for(j = 0; j < size; j++){
               int random = (int)(java.lang.Math.random()*100);
               Node newNode = new Node(random);
               theHeap.insertAt(j, newNode);
          }
          System.out.print("Random Array: ");
          theHeap.displayArray();
                  
     }
     public static int getInt() throws IOException{
          InputStreamReader is = new InputStreamReader(System.in);
          BufferedReader br = new BufferedReader(is);
          String s = br.readLine();
          return Integer.parseInt(s);
     }
     //-------------------------------------------------------------------------
}
