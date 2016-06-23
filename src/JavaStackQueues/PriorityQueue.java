package JavaStackQueues;

public class PriorityQueue {
     private final int maxSize;
     private final long queArray[];
     private int nItems;
//------------------------------------------------------------------------------

     public PriorityQueue(int s) {
          maxSize = s;
          queArray = new long[maxSize];
          nItems = 0;
     }
//------------------------------------------------------------------------------
//40 30 60 50 45
     public void insert(long item) {
          int j;
          if (nItems == 0)
               queArray[nItems++] = item;
          else {
               for (j = nItems - 1; j >=0; j--){
                    if(item > queArray[j])
                         queArray [j+1] = queArray [j];
                    else 
                         break;
               }
               queArray [j+1] = item;
               nItems++;
          }
     }
//------------------------------------------------------------------------------

     public long remove() {
         
          return queArray [--nItems];
     }
//------------------------------------------------------------------------------

     public long peekMin() {
          return queArray[nItems-1];
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
 public void display() {
          for (int i = 0; i < nItems; i++) {
               System.out.print(queArray[i] + " ");
          }
          System.out.println();
     }
//------------------------------------------------------------------------------
}
//##############################################################################

class PriorityQueueApp {

     public static void main(String args[]) {
          PriorityQueue theQueue = new PriorityQueue(5);
          theQueue.insert(10);
          theQueue.insert(20);
          theQueue.insert(30);
          theQueue.insert(40);

          theQueue.remove();
          theQueue.remove();
          theQueue.remove();

          theQueue.insert(30);
          theQueue.insert(60);
          theQueue.insert(50);
          theQueue.insert(45);
          
          theQueue.display();
          while (!theQueue.isEmpty()) {
               System.out.print(theQueue.peekMin()+ " ");
               theQueue.remove();            
          }
          System.out.println();
     }
}