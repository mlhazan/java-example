
package JavaSorting;

import java.util.Random;
/**
 * *****************************************************************************
 *  Selection Sort Efficiency O(N^2)
 * ****************************************************************************
 */
public class SelectionSort {

     private int arr[];
     private int nElems;

     public SelectionSort(int size) {
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
          int i, j, min;
          
          for ( i = 0; i < nElems; i++){
               min = i;
               for (j = i+1; j < nElems; j++ ){
                    if(arr[j] < arr[min]){
                         min = j;          
                    }        
               }
                if(min!=i)
                    swap(i, min);
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
class SelectionMain{
     public static void main(String rgs[]){
          int maxSize = 11;
          Random random = new Random();
          SelectionSort arr = new SelectionSort(maxSize);
          for (int n = 0; n < 10; n++) {
               arr.insert(random.nextInt(10) + 1);
         }
          arr.display();
          arr.sort();
          arr.display();
     }
}