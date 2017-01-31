package javaArray.twoDimentionalArray;

public class ArrayToMethod {

     public static void main(String[] args) throws java.lang.Exception {
          int arr[][] = {{1, 2, 3, 4}, {5, 6, 7, 8}};
          
          System.out.println(m1(arr)[0]);
          System.out.println(m1(arr)[1]);
     }

     public static int[] m1(int[][] m) {
          int[] result = new int[2];
          result[0] = m.length;
          result[1] = m[0].length;
          return result;
     }
}
