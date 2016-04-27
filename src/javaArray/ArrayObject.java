
package javaArray;

import java.util.Scanner;

class Person{
     private String firstName;
     private String lastName;
     private int age;
//------------------------------------------------------------------------------
     public Person(String firstName, String lastName, int age) {
          this.firstName = firstName;
          this.lastName = lastName;
          this.age = age;
     }
//------------------------------------------------------------------------------
     public void displayPerson(){
          System.out.print(" Last Name: "+ lastName);
          System.out.print(" , First Name: "+ firstName);
          System.out.print(" , Age: "+ age);
          System.out.println();
     }
//------------------------------------------------------------------------------     
     public String getLastName(){
          return lastName;
     }
//------------------------------------------------------------------------------     
}//end of Person class
//##############################################################################

class ArrayObject{
     private Person person [];
     private int nElems;
//------------------------------------------------------------------------------
     public ArrayObject(int max){
          person = new Person[max];
          nElems = 0;
     }
//------------------------------------------------------------------------------
     public Person find(String searchName){
          int j;
          for(j = 0; j < nElems; j++){
               if(person[j].getLastName().equals(searchName))
                    break; //break when last name found
          }
          if(j==nElems)
               return null;
          else return person[j];
     }// end of find
//------------------------------------------------------------------------------
     //insert a person
     public void insert(String last, String first, int age){
          person[nElems] = new Person(first, last, age);
          nElems++;
     }
//------------------------------------------------------------------------------
     //delete a person
     public boolean delete(String searchName){
          int j;
          for(j = 0; j < nElems; j++){
               if(person[j].getLastName().equals(searchName))
                    break; //break when last name found
          }
          if(j==nElems)
               return false;
          else{
               for(int k=j; k <nElems; k++){
                    person[k] = person[k+1];
               }
               nElems--;
               return true;
          }
     }// end of delete
//------------------------------------------------------------------------------     
     public void display(){
          for(int i = 0; i < nElems; i++)
               person[i].displayPerson();
     }
//------------------------------------------------------------------------------     
}//end of class ArrayObject 
//##############################################################################

class MainArrayObject{
     public static void main(String args[]){
          int maxSize = 100;
          ArrayObject person = new ArrayObject(maxSize);
          person.insert("Mathew", "John", 22);
          person.insert("Cohen", "Dave", 32);
          person.insert("Jordan", "Matt", 25);
          person.insert("Patt", "Synthia", 19);
          person.insert("Jones", "Alex", 34);
          
          person.display();
          Scanner input = new Scanner(System.in);
          System.out.println("Search a last name: ");
          String searchName = input.next();
          
          Person found = person.find(searchName);
          if(found != null){
               System.out.println("Found ");
               found.displayPerson();
          }
          else 
               System.out.println("Not Found "+ searchName);
          
          System.out.println("Delete a Person: ");
          searchName = input.next();
          person.delete(searchName);
          person.display();
     }//end of main
}// end of MainArrayObject
//##############################################################################