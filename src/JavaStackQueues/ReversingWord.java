package JavaStackQueues;

import java.util.Scanner;

class Stackx {

     private final int maxSize;
     private final char stackArray[];
     private int top;

     public Stackx(int s) {
          maxSize = s;
          stackArray = new char[maxSize];
          top = -1; //no item yet
     }
//------------------------------------------------------------------------------     

     public void push(char j) {
          stackArray[++top] = j; //increment top, insert item
     }
//------------------------------------------------------------------------------

     public long pop() {
          return stackArray[top--];//access item, decrement top
     }
//------------------------------------------------------------------------------

     public char peek() {//just read the top of the stack
          return stackArray[top];
     }
//------------------------------------------------------------------------------

     public boolean isEmpty() {
          return top == -1;
     }
//------------------------------------------------------------------------------     
}
//##############################################################################

class Reverser {

     private final String input;
     private String output;

     public Reverser(String in) {
          input = in;
     }

     public String doRev() {
          int stackSize = input.length();
          Stackx theStack = new Stackx(stackSize);
          for (int j = 0; j < stackSize; j++) {
               char ch = input.charAt(j);
               theStack.push(ch);
          }
          output = "";
          while (!theStack.isEmpty()) {
               char ch = (char) theStack.pop();
               output = output + ch;
          }
          return output;
     }
//------------------------------------------------------------------------------     
}
//##############################################################################

class ReverseApp {

     public static void main(String args[]) {
          String input;
          String output;
 Scanner br = new Scanner(System.in);
          while (true) {
               System.out.println("Enter a word:");

               input = br.next();
               if (input.equals("")) {
                    break;
               }

               Reverser theReverser = new Reverser(input);
               output = theReverser.doRev();
               System.out.println(output);
          }
     }
//------------------------------------------------------------------------------
}
//##############################################################################
