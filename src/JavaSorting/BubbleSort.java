
package JavaSorting;

import java.util.Random;
import javaArray.BinarySearch;

/**
 * *****************************************************************************
 *  The most easiest sorting algorithm is Bubble Sort Efficiency O(N^2)
 * ****************************************************************************
 */
public class BubbleSort {

     private int arr[];
     private int nElems;

     public BubbleSort(int size) {
          arr = new int[size];
          nElems = 0;
     }

//------------------------------------------------------------------------------
     public void insert(int value) {

          arr[nElems] = value;
          nElems++;
     }
//------------------------------------------------------------------------------

     public void display() {
          for (int i = 0; i < nElems; i++) {
               System.out.print(arr[i] + " ");
          }
          System.out.println();
     }
//------------------------------------------------------------------------------
     public void sort(){
          int i, j;
          for ( i = 0; i < nElems; i++){
               for (j = 1; j < nElems-i; j++ ){
                    if(arr[j] < arr[j-1])
                         swap(j-1, j);
               }
          }
     }
//------------------------------------------------------------------------------
     public void swap(int a, int b){
          int temp = arr[a];
          arr[a] = arr[b];
          arr[b] = temp;
     }
     
}//end of class
//##############################################################################
class BubbleMain{
     public static void main(String rgs[]){
          int maxSize = 11;
          Random random = new Random();
          BubbleSort arr = new BubbleSort(maxSize);
          for (int n = 0; n < 10; n++) {
               arr.insert(random.nextInt(10) + 1);
          }
          arr.display();
          arr.sort();
          arr.display();
     }
}