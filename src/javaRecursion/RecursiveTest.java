package javaRecursion;
/**
 * 
 * @author Hasan
 * when recursive goes to base i = 1 
 * when it terminates upper stack i = 2
 * when it terminates upper stack i = 3 ..
 */
public class RecursiveTest {

     static int size = 10;

     public static void main(String[] args) {
          doRecursive(size);
     }

     private static void doRecursive(int i) {
          if (i == 1) {
               System.out.println("i = " + i);
               return;
          } else {
               doRecursive(i - 1);
          }
          if (i == 2) {
               System.out.println("i = " + i);
          } else {
               System.out.println("i = " + i);
          }
     }
}
