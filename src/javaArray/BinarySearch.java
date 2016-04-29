package javaArray;

import java.util.Random;
import java.util.Scanner;

/*******************************************************************************
 * @author Hasan
 ******************************************************************************/
public class BinarySearch {
     private int arr [];
     private int nElems;
     
     public BinarySearch(int size){
          arr = new int[size];
          nElems = 0;
     }
     public int size (){
          return nElems;
     }
     
     /**************************************************************************
      * @param searchKey
      * @return the index of searchKey
      *************************************************************************/
     public int find(int searchKey){
          int lowerBound = 0;
          int upperBound = nElems - 1;
          
          int current;
          while(true){
               current = (lowerBound + upperBound)/2;
               if(arr[current] == searchKey)
                    return current; //found
               else if (lowerBound > upperBound)
                    return nElems;  //not Found
               else{
                    if (arr[current] < searchKey)
                         lowerBound = current + 1;// searchKey is in upper half
                    else upperBound = current - 1;// searchKey is in lower half
               }
          }
     } //end of find
//------------------------------------------------------------------------------
     public void insert (int value){
          int j;
          for ( j = 0; j < nElems; j++){
               if (arr[j] > value)
                    break;               
          }
          for (int k = nElems; k > j; k--){
               arr[k] = arr[k-1];
          }
          arr[j] = value;
          nElems++;
     }
//------------------------------------------------------------------------------
     public boolean delete( int value){
          int j = find(value);
          if (j== nElems)
               return false;
          else{
               for (int k=j; k < nElems; k++){
                    arr[k] = arr[k+1];
               }
               nElems--;              
          return true;
          }
     }
//------------------------------------------------------------------------------
     public void display(){
          for (int i = 0; i < nElems; i++){
               System.out.print(arr[i]+ " ");
          }
          System.out.println();
     }
}//end of class
//##############################################################################
class Main{
     public static void main(String rgs[]){
          int maxSize = 100;
          Random random = new Random();
          BinarySearch arr = new BinarySearch(maxSize);
          for (int n = 0; n < 10; n++) {
               arr.insert(random.nextInt(100) + 1);
          }
          arr.display();
          Scanner input = new Scanner(System.in);
          System.out.println("Search a key: ");
          int searchKey = input.nextInt();
          
          if(arr.find(searchKey) != arr.size()){
               System.out.println("Found "+ searchKey);
          }
          else System.out.println("Not Found "+ searchKey);
          
          System.out.println("Max size "+ maxSize);        
          System.out.println("Array size "+ arr.size());
          System.out.println();
          
          System.out.println("Delete a key: ");
          int a = input.nextInt();
          arr.delete(a);
          
          arr.display();
          System.out.println("Max size "+ maxSize);        
          System.out.println("Array size "+ arr.size());
          System.out.println();
     }
}
//##############################################################################