package JavaStackQueues;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

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

     private String input;
     private String output;

     public Reverser(String in) {
          input = in;
     }

     public String doRev() {
          int stackSize = input.length();
          Stackx theStack = new Stackx(stackSize);
          for (int j = 0; j < input.length(); j++) {
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

     public static void main(String args[]) throws IOException {
          String input;
          String output;

          while (true) {
               System.out.println("Enter a word:");
               System.out.flush();
               input = getString();
               if (input.equals("")){
                    break;
               }
               
               Reverser theReverser = new Reverser(input);
               output = theReverser.doRev();
               System.out.println(output);
          }
     }
//------------------------------------------------------------------------------

     private static String getString() throws IOException {
          InputStreamReader irs = new InputStreamReader(System.in);
          BufferedReader br = new BufferedReader(irs); 
          String s = br.readLine();
          return s;
     }
}
//##############################################################################
