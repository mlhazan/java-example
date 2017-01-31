package javaArray.twoDimentionalArray;

import java.util.Scanner;

public class RowTotal {

     public static void main(String[] args) {
          int arr[][] = new int[3][4];

          System.out.println("How many row   : " + arr.length);
          System.out.println("How may column : " + arr[0].length);
          int total = 0;
          int column = 0;
          Scanner input = new Scanner(System.in);
          for (int i = 0; i < arr.length; i++) {
               for (int j = 0; j < arr[i].length; j++) {
                    arr[i][j] = (int) (Math.random() * 9);
                    System.out.print(arr[i][j] + " ");
                    total += arr[i][j];
                    if (j == arr[i].length - 1) {
                         System.out.println("");
                    }
               }
          }

          
          for (int i = 0; i < arr.length; i++) {
               total = 0;
               for (int j = 0; j < arr[0].length; j++) {
                    total += arr[i][j];
                    if (j == arr[i].length - 1) {
                         System.out.println("");
                    }
               }
               System.out.println("Total = " + total);
          }
     }
}
