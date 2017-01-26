package javaRecursion;
/**
 * 
 * @author Hasan
 * when recursive goes to base i = 1 
 * when it terminates upper stack i = 2
 * when it terminates upper stack i = 3 ..
 */
public class RecursiveTest {

     static int size = 5;

     public static void main(String[] args) {
          doRecursive(size);
     }

     private static void doRecursive(int i) {
          if (i == 1) {
               System.out.println("i = " + i);
               
          } else {
               doRecursive(i - 1);
               System.out.println("i = " + i);
          }
         
     }
}
