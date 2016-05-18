package JavaStackQueues;

import java.util.Scanner;

class Bracket {

     private final int maxSize;
     private final char stackArray[];
     private int top;

     public Bracket(int s) {
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


class BracketCheck {

     private final String input;
     private String output;

     public BracketCheck(String in) {
          input = in;
     }

     public void check() {
          int stackSize = input.length();
          Bracket theStack = new Bracket(stackSize);
          for (int j = 0; j < stackSize; j++) {
               char ch = input.charAt(j);
               switch (ch) {
                    case '{':
                    case '[':
                    case '(':
                         theStack.push(ch);
                         break;
                    case '}':
                    case ']':
                    case ')':
                         if (!theStack.isEmpty()) {
                              char chx = (char) theStack.pop();
                              if ((ch == '}' && chx != '{')
                                      || (ch == ']' && chx != '[')
                                      || (ch == ')' && chx != '(')) {
                                   System.err.println("Error:" + ch + "at" + j);
                              }
                         }
//                         else {
//                              System.err.println("Error:" + ch + "at" + j);
//                         }
                         break;
                    default:
                         break;
               }//end switch

          }//end for

          if (!theStack.isEmpty()) {
               System.err.println("Error: Missing right delimeter");
          }

//------------------------------------------------------------------------------     
     }
//##############################################################################
}

class BracketApp {

     public static void main(String args[]) {
          String input;
          String output;
          Scanner br = new Scanner(System.in);
          System.out.println("Enter a Equation with delimeters:");
          while (true) {

               input = br.next();
               if (input.equals("")) {
                    break;
               }

               BracketCheck theChecker = new BracketCheck(input);
               theChecker.check();

          }
     }
//------------------------------------------------------------------------------
}

//##############################################################################
