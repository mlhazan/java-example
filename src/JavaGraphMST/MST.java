package JavaGraphMST;

/**
 * @author Hasan
 * @version java version "1.8.0_92"
 * @os windows 10
 * @date Nov 12, 2016
 */
class StackX {

     private final int SIZE = 5;
     private int[] st;
     private int top;
// -------------------------------------------------------------

     public StackX() // constructor
     {
          st = new int[SIZE];    // make array
          top = -1;
     }
// -------------------------------------------------------------

     public void push(int j) // put item on stack
     {
          st[++top] = j;
     }
// -------------------------------------------------------------

     public int pop() // take item off stack
     {
          return st[top--];
     }
// -------------------------------------------------------------

     public int peek() // peek at top of stack
     {
          return st[top];
     }
// -------------------------------------------------------------

     public boolean isEmpty() // true if nothing on stack
     {
          return (top == -1);
     }
// -------------------------------------------------------------
}  // end class StackX
////////////////////////////////////////////////////////////////

class Vertex {

     public char label;        // label (e.g. 'A')
     public boolean wasVisited;
// -------------------------------------------------------------

     public Vertex(char lab) // constructor
     {
          label = lab;
          wasVisited = false;
     }
// -------------------------------------------------------------
}  // end class Vertex
////////////////////////////////////////////////////////////////

class Graph {

     private final int MAX_VERTS = 5;
     private final Vertex vertexList[]; // list of vertices
     private final int adjMat[][];      // adjacency matrix
     private int nVerts;          // current number of vertices
     private final StackX theStack;
// -------------------------------------------------------------

     public Graph() // constructor
     {
          vertexList = new Vertex[MAX_VERTS];
          // adjacency matrix
          adjMat = new int[MAX_VERTS][MAX_VERTS];
          nVerts = 0;
          theStack = new StackX();
     }  // end constructor
// -------------------------------------------------------------

     public void addVertex(char lab) {
          vertexList[nVerts++] = new Vertex(lab);
     }
// -------------------------------------------------------------

     public void addEdge(int start, int end) {
          adjMat[start][end] = 1;
          adjMat[end][start] = 1;
     }
// -------------------------------------------------------------

     public void displayVertex(int v) {
          System.out.print(vertexList[v].label);
     }
// -------------------------------------------------------------

     public void mst() // minimum spanning tree (depth first)
     {                                  // start at 0
          vertexList[0].wasVisited = true;   // mark it
          theStack.push(0);                  // push it

          while (!theStack.isEmpty()) // until stack empty
          {                               // get stack top
               int currentVertex = theStack.peek();
               // get next unvisited neighbor
               int v = getAdjUnvisitedVertex(currentVertex);
               if (v == -1) // if no more neighbors
               {
                    theStack.pop();              //    pop it away
               } else // got a neighbor
               {
                    vertexList[v].wasVisited = true;  // mark it
                    displayVertex(currentVertex);     // from currentV
                    theStack.push(v);                 // push it
                    // display edge                  
                    displayVertex(v);                 // to v
                    System.out.print(" ");
               }
          }  // end while(stack not empty)

     }  // end mst()
// -------------------------------------------------------------
     // returns an unvisited vertex adj to v

     public int getAdjUnvisitedVertex(int v) {
          for (int j = 0; j < nVerts; j++) {
               if (adjMat[v][j] == 1 && vertexList[j].wasVisited == false) {
                    return j;
               }
          }
          return -1;
     }  // end getAdjUnvisitedVert()
// -------------------------------------------------------------
}  // end class Graph
////////////////////////////////////////////////////////////////

class MSTApp {

     public static void main(String[] args) {
          Graph theGraph = new Graph();
          theGraph.addVertex('A');    // 0  (start for mst)
          theGraph.addVertex('B');    // 1
          theGraph.addVertex('C');    // 2
          theGraph.addVertex('D');    // 3
          theGraph.addVertex('E');    // 4

          theGraph.addEdge(0, 1);     // AB
          theGraph.addEdge(0, 2);     // AC
          theGraph.addEdge(0, 3);     // AD
          theGraph.addEdge(0, 4);     // AE
          theGraph.addEdge(1, 2);     // BC
          theGraph.addEdge(1, 3);     // BD
          theGraph.addEdge(1, 4);     // BE
          theGraph.addEdge(2, 3);     // CD
          theGraph.addEdge(2, 4);     // CE
          theGraph.addEdge(3, 4);     // DE

          System.out.print("Minimum spanning tree: ");
          theGraph.mst();             // minimum spanning tree
          System.out.println();
     }  // end main()
}  // end class MSTApp
////////////////////////////////////////////////////////////////

