
package JavaSorting;

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

class InsertionObject{
     private Person person [];
     private int nElems;
//------------------------------------------------------------------------------
     public InsertionObject(int max){
          person = new Person[max];
          nElems = 0;
     }
//------------------------------------------------------------------------------
      //insert a person
     public void insert(String last, String first, int age){
          person[nElems] = new Person(first, last, age);
          nElems++;
     }
//------------------------------------------------------------------------------     
     public void display(){
          for(int i = 0; i < nElems; i++)
               person[i].displayPerson();
     }
//------------------------------------------------------------------------------
     public void sort(){
          int in, out;
          for(out = 1; out < nElems; out++ ){
               Person temp =person[out];
               in = out;
               while (in > 0 && person[in - 1].getLastName().compareTo(temp.getLastName()) > 0){
                    person[in] =  person[in -1];
                    --in;
               }
               person[in] = temp;
          }       
     }

}//end of class ArrayObject 
//##############################################################################

class MainArrayObject{
     public static void main(String args[]){
          int maxSize = 10;
          InsertionObject person = new InsertionObject(maxSize);
          person.insert("Mathew", "John", 22);
          person.insert("Cohen", "Dave", 32);
          person.insert("Jordan", "Matt", 25);
          person.insert("Patt", "Synthia", 19);
          person.insert("Jones", "Alex", 34);
          
          person.display();
          System.out.println("-----------------------------------------------");
          person.sort();          
          person.display();
     }//end of main
}// end of MainArrayObject
//##############################################################################