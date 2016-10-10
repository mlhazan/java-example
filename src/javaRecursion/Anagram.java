package javaRecursion;

public class Anagram {

     static int size, count;
     static char arrChar[] = new char[4];

     public static void main(String[] args) {
          String input = "cats";
          size = input.length();
          count = 0;
          for (int i = 0; i < size; i++) {
               arrChar[i] = input.charAt(i);
          }
          doAnagram(size);
     }

     private static void doAnagram(int newSize) {
          if (newSize == 1) {
               return;
          }
          for (int i = 0; i < newSize; i++) {
               doAnagram(newSize - 1);
               if (newSize == 2) {
                    displayWord();
               }
               rotate(newSize);
          }
     }

     private static void displayWord() {
          for (int i = 0; i < size; i++) {
               System.out.print(arrChar[i]);
          }
          System.out.print(" ");
     }

     private static void rotate(int newSize) {
          int j;
          int position = size - newSize;
          char temp = arrChar[position];
          for (j = position + 1; j < size; j++) {
               arrChar[j - 1] = arrChar[j];
          }

          arrChar[j - 1] = temp;
     }
}
