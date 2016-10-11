package javaRecursion;

public class BinarySearch {

     static int arr[] = {9, 18, 27, 36, 45, 54, 63, 72, 81};
     static int nElement = arr.length;
     static int searchKey = 28;

     public static void main(String[] args) {
          int key = findkey(searchKey, 0, nElement - 1);
          
          if(key != nElement)
               System.out.println("Found");
          else  System.out.println("Not Found");
     }

     private static int findkey(int searchKey, int lowerBound, int upperBound) {
          int current = (lowerBound + upperBound) / 2;
          if (arr[current] == searchKey) {
               return current;
          } else if (lowerBound > upperBound) {
               return nElement;
          } else if (arr[current] < searchKey) {
               return findkey(searchKey, current + 1, upperBound);
          } else {
               return findkey(searchKey, lowerBound, current - 1);
          }
     }
}
