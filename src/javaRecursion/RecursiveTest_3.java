
package javaRecursion;

public class RecursiveTest_3 {
 static int test=0;
     public static void main(String[] args) {
            
          int n = 4;
          System.out.printf("Total is %d ", result(0, n-1));        
     }
     public static int result(int l, int h) {
          // Base case: when source and destination are same
          if (h == l) {
           
               System.out.println("");
               return 0;
          }

            for (int i = l + 1; i <= h; i++) {
               int total = result( i, h);            
               System.out.println("I am from i = "+i + " and l = "+l +" test = "+test);
               test++;
          }
          return test;
     }
}