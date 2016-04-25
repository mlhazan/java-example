package javaArray;

import java.util.Random;
import java.util.Scanner;

/**
 * @author Hasan This code shows an oop way to remove element from an array
 */
public class RemoveElement {

          private int a[];

          public RemoveElement(int index) {
                    a = new int[index];
          }

          public void setElement(int index, int value) {
                    a[index] = value;
          }

          public int getElement(int index) {
                    return a[index];
          }
}//end of class RemoveEllement

class RemoveMain {

          public static void main(String args[]) {
                    RemoveElement arr;
                    int index = 10;
                    arr = new RemoveElement(index);
                    Random random = new Random();
                    for (int n = 0; n < index; n++) {
                              arr.setElement(n, random.nextInt(100) + 1);
                    }

                    for (int n = 0; n < index; n++) {
                              System.out.print(arr.getElement(n) + "  ");
                    }
                    System.out.println();

                    Scanner input = new Scanner(System.in);
                    System.out.println("Search a key: ");
                    int searchKey = input.nextInt();
                    int i;
                    for (i = 0; i < index; i++) {
                              if (arr.getElement(i) == searchKey) {
                                        break;
                              }
                    }

                    if (i == index) {
                              System.out.println("Search key not found");
                    } else {
                              System.out.println("Search key found at index " + i);
                              System.out.println("To remove the elemnt type 1 or 2 to quit");
                              int a = input.nextInt();
                              switch (a) {
                                        case 1:
                                                  for (int j = i; j < index - 1; j++) {
                                                            arr.setElement(j, arr.getElement(j + 1));

                                                  }
                                                  index--;
                                                  break;

                                        default:
                                                  System.exit(0);
                              }
                    }//end of for loop
                    for (int n = 0; n < index; n++) {
                              System.out.print(arr.getElement(n) + "  ");
                    }
                    System.out.println();
          }

}
