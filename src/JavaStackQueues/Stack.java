package JavaStackQueues;

public class Stack {

     private int maxSize;
     private long stackArray[];
     private int top;

     public Stack(int s) {
          maxSize = s;
          stackArray = new long[maxSize];
          top = -1; //no item yet
     }
//------------------------------------------------------------------------------     

     public void push(long j) {
          stackArray[++top] = j; //increment top, insert item
     }
//------------------------------------------------------------------------------

     public long pop() {
          return stackArray[top--];//access item, decrement top
     }
//------------------------------------------------------------------------------

     public long peek() {//just read the top of the stack
          return stackArray[top];
     }
//------------------------------------------------------------------------------
     public boolean isEmpty() {
          return top == -1;
     }
//------------------------------------------------------------------------------
     public boolean isFull() {
          return top == maxSize - 1;
     }
//------------------------------------------------------------------------------     
}
//##############################################################################

class StackApp {

     public static void main(String args[]) {
          Stack theStack = new Stack(10);
          theStack.push(20);
          theStack.push(40);
          theStack.push(60);
          theStack.push(80);
          while (!theStack.isEmpty()) {
               long value = theStack.pop();
               System.out.print(value);
               System.out.print(" ");
          }//end while
          System.out.println("");
     }
}
//##############################################################################
