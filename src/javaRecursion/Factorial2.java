package javaRecursion;

public class Factorial2 {

     public static void main(String[] args) {
          System.out.println("Factorial of 4 = "+factorial(4));
     }

     public static int factorial(int a) {
        return fact(a, 1);
     }
     public static int fact(int n, int result){
          if(n == 0)
               return result;
          else return fact(n-1, n* result);
     }
}
