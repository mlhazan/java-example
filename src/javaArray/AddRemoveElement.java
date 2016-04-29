package javaArray;

import java.util.Random;
import java.util.Scanner;

/*******************************************************************************
 * @author Hasan 
 * This code shows an oop way to add/remove element to array
 * Obviously to add element we must declare a new array greater than the older 
 * array.
 ******************************************************************************/
public class AddRemoveElement {

     private int a[];

     public AddRemoveElement(int index) {
          a = new int[index];
     }

     public void setElement(int index, int value) {
          a[index] = value;
     }

     public int getElement(int index) {
          return a[index];
     }
}//end of class RemoveEllement
//##############################################################################
class RemoveMain {

     public static void main(String args[]) {
          AddRemoveElement arr;
          int index = 10;
          arr = new AddRemoveElement(index);
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
               System.out.println("Search key not found. Do you like to add?");
               System.out.println("To insert the element type 1 or 2 to quit");
               int a = input.nextInt();
               i = index + 1;

               switch (a) {
                    case 1:
                         AddRemoveElement newArr = new AddRemoveElement(i);
                         for (int x = 0; x < index; ++x) {

                              newArr.setElement(x, arr.getElement(x));
                         }
                         newArr.setElement(index, searchKey);
                         

                         for (int n = 0; n < index+1; n++) {
                              System.out.print(newArr.getElement(n) + "  ");
                         }
                         System.out.println();

                         break;

                    default:
                         System.exit(0);
               }

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

                         for (int n = 0; n < index; n++) {
                              System.out.print(arr.getElement(n) + "  ");
                         }
                         System.out.println();
                         break;

                    default:
                         System.exit(0);
               }//end of switch
          }//end of else
     }//end of main
//------------------------------------------------------------------------------     
}
//##############################################################################
