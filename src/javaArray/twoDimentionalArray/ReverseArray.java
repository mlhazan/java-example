package javaArray.twoDimentionalArray;

public class ReverseArray {

     public static void main(String[] args) {
          int[][] array = {{1, 2}, {3, 4}, {5, 6}};

          for (int i = 0; i < array.length; i++) {
               for (int j = 0; j < array[i].length; j++) {
                  
                    System.out.print(array[i][j] + " ");
                    if (j == array[i].length - 1) {
                         System.out.println("");
                    }
               }
          }
          System.out.println("");
          for (int i = array.length - 1; i >= 0; i--) {
               for (int j = array[i].length - 1; j >= 0; j--) {
                    System.out.print(array[i][j] + " ");
                     if (j == 0) {
                         System.out.println("");
                    }
               }
               
          }
     }
}
