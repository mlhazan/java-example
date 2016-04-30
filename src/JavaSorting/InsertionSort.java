
package JavaSorting;

import java.util.Random;
/*******************************************************************************
 * Best Case:
 * T(n) = (c1 + c3)(n - 1) = an + b = O(n)
 * Worst Case:
 * (c1 + c3)(n - 1){1 + 2 + 3 + . . + n-1} = (c1 + c3) (n - 1) + n(n - 1)/2)C2
 * =an^2 + bn + c = O(n^2)
 ******************************************************************************/
public class InsertionSort {

     private int arr[];
     private int nElems;

     public InsertionSort(int size) {
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
          int in, out;
          for(out = 1; out < nElems-1; out++ ){
               int temp = arr[out];
               in = out;
               while (in > 0 && arr[in - 1]>temp){
                    arr[in] =  arr[in -1];
                    --in;
               }
               arr[in] = temp;
          }
         
     }
//------------------------------------------------------------------------------     
}//end of class
//##############################################################################
class InsertionMain{
     public static void main(String rgs[]){
          int maxSize = 11;
          Random random = new Random();
          SelectionSort arr = new SelectionSort(maxSize);
          for (int n = 0; n < 10; n++) {
               arr.insert(random.nextInt(10) + 1);
         }
//          arr.insert(7);
//          arr.insert(1);
//          arr.insert(2);
//          arr.insert(1);
//          arr.insert(5);
//          arr.insert(6);
//          arr.insert(9);
//          arr.insert(4);
//          arr.insert(11);
          arr.display();
          arr.sort();
          arr.display();
     }
}