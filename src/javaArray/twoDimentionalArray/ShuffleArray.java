package javaArray.twoDimentionalArray;

import java.util.Random;
import java.util.Scanner;

public class ShuffleArray {

     public static void main(String[] args) {
          int arr[][] = new int[3][4];

          Scanner input = new Scanner(System.in);
          for (int i = 0; i < arr.length; i++) {
               for (int j = 0; j < arr[i].length; j++) {
                    arr[i][j] = (int) (Math.random() * 9);
                    System.out.print(arr[i][j] + " ");
                    if (j == arr[i].length - 1) {
                         System.out.println("");
                    }
               }
          }
          System.out.println("");

          shuffle(arr);
          for (int i = 0; i < arr.length; i++) {
               for (int j = 0; j < arr[i].length; j++) {

                    System.out.print(arr[i][j] + " ");
                    if (j == arr[i].length - 1) {
                         System.out.println("");
                    }
               }
          }
     }

     public static void shuffle(int[][] a) {
          Random random = new Random();

          for (int i = 0; i < a.length; i++) {
               for (int j = 0; j < a[i].length; j++) {
                    int m = random.nextInt(i + 1);
                    int n = random.nextInt(j + 1);

                    int temp = a[i][j];
                    a[i][j] = a[m][n];
                    a[m][n] = temp;
               }
          }
     }

}
