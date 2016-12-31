package javaRecursion;

public class Factorial {

     public static void main(String[] args) {
          System.out.println("Factorial of 4 = "+factorial(4));
     }

     public static int factorial(int a) {
          System.out.println(a);
          if (a == 1) {
               return 1;
          } else {
               int result = a * factorial(a - 1);
               System.out.println(a);
               return result;
          }
     }
}
