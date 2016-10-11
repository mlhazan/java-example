package javaRecursion;
public class RecursiveTest_2 {

     static int size = 3;
     public static void main(String[] args) {
          doRecursive(size);
     }
     private static void doRecursive(int i) {
          if (i == 1) {
               System.out.println("i = " + i);
               return;
          } 
          for (int j = 0; j < i; j++) {
               doRecursive(i - 1);
             System.out.println("i = " + i);
          }
     }
}
