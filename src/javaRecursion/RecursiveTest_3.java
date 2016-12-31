
package javaRecursion;

public class RecursiveTest_3 {
 static int test=0;
     public static void main(String[] args) {
          int arr[] = {2, 3, 1, 1, 2};
         
          int n = arr.length;
          System.out.printf("Total is %d ", result(arr, 0, n - 1));
          System.out.println(test);
     }
     public static int result(int arr[], int l, int h) {
          // Base case: when source and destination are same
          if (h == l) {
               return 0;
          }

          if (arr[l] == 0) {
               return Integer.MAX_VALUE;
          }

          int min = 0;
          for (int i = l + 1; i <= h; i++) {
               int total = result(arr, i, h);            
                    min = total + 1;   
                    test++;
          }
          return min;
     }
}