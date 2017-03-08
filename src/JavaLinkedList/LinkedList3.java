package JavaLinkedList;

public class LinkedList3 {

     int item;
     LinkedList3 next;
     public LinkedList3(){
          
     }
     public LinkedList3(int item, LinkedList3 next){
          this.item = item;
          this.next = next;
          
     }
     public LinkedList3(int item){
          this(item, null);
     }

     public static void main(String arg[]) {

          LinkedList3 l1 = new LinkedList3();
          LinkedList3 l2 = new LinkedList3();
          LinkedList3 l3 = new LinkedList3();
          
          l1.item = 1;
          l2.item = 2;
          l3.item = 3;
          
          l1.next = l2;
          l1.next = l3;
          
          System.out.println(l1.item); 
          System.out.println(l1.next.item);
          System.out.println("");
          System.out.println("");
  
          LinkedList3 l4 = new LinkedList3(6,new LinkedList3(7, new LinkedList3(8)));
          System.out.println(l4.next.next.item); 
          
          System.out.println("");
          System.out.println("");
     }
}
