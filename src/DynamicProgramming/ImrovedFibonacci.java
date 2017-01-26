package DynamicProgramming;

import java.util.Scanner;

public class ImrovedFibonacci {

     public static void main(String[] args) {
          Scanner in = new Scanner(System.in);
          System.out.println("Enter any index of Fibonacci number : ");
          int i = in.nextInt();
          System.out.println("Fibonacci number at index " + i + " is : " + fib(i));

     }

     public static int fib(int i) {
          int f0 = 0;
          int f1 = 1;
          int f2 = 1;
          switch (i) {
               case 0:
                    return f0;
               case 1:
                    return f1;
               case 2:
                    return f2;
               default:
                    break;
          }

          for (int a = 3; a<= i; a++) {
               f0 = f1;
               f1 = f2;
               f2 = f0 + f1;
          }
          return f2;
     }
}
