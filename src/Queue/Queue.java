package Queue;

public class Queue {

     private final int maxSize;
     private final long queArray[];
     private int front;
     private int rear;
     private int nItems;
//------------------------------------------------------------------------------

     public Queue(int s) {
          maxSize = s;
          queArray = new long[maxSize];
          front = 0; //empty front
          rear = -1; //empty rear
          nItems = 0;
     }
//------------------------------------------------------------------------------

     public void insert(long j) {
          if (rear == maxSize - 1) { //wrap around
               rear = -1;
          }
          queArray[++rear] = j;
          nItems++;
     }
//------------------------------------------------------------------------------

     public long remove() {
          long temp = queArray[front++];
          if (front == maxSize) { //wrap around
               front = 0;
          }
          nItems--;
          return temp;
     }
//------------------------------------------------------------------------------

     public long peekFront() {
          return queArray[front];
     }
//------------------------------------------------------------------------------

     public boolean isEmpty() {
          return nItems == 0;
     }
//------------------------------------------------------------------------------

     public boolean isFull() {
          return nItems == maxSize;
     }
//------------------------------------------------------------------------------

     public int size() {
          return nItems;
     }
//------------------------------------------------------------------------------
}
//##############################################################################

class QueueApp {

     public static void main(String args[]) {
          Queue theQueue = new Queue(5);
          theQueue.insert(10);
          theQueue.insert(20);
          theQueue.insert(30);
          theQueue.insert(40);

          theQueue.remove();
          theQueue.remove();
          theQueue.remove();

          theQueue.insert(50);
          theQueue.insert(60);
          theQueue.insert(70);
          theQueue.insert(80);

          while (!theQueue.isEmpty()) {
               System.out.print(theQueue.peekFront() + " ");
               theQueue.remove();            
          }
          System.out.println();
     }
}
