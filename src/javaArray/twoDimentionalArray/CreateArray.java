package javaArray.twoDimentionalArray;

import java.util.Arrays;
import java.util.Scanner;

public class CreateArray {

     public static void main(String[] args) {
          int arr[][] = new int[3][4];

          System.out.println("How many row   : " + arr.length);
          System.out.println("How may column : " + arr[0].length);

          Scanner input = new Scanner(System.in);
          for (int i = 0; i < arr.length; i++) {
               for (int j = 0; j < arr[i].length; j++) {
                    arr[i][j] = (int) (Math.random() * 9);
                    System.out.print(arr[i][j] + " ");                  
               }
               System.out.println();
          }
     }
}
