package javaRecursion;

public class Towers {

     static int disk = 3;

     public static void main(String[] args) {
          doTower(disk, 'A', 'B', 'C');
     }

     public static void doTower(int disk, char from, char inter, char to) {
          if (disk == 1)//base
          {
               System.out.println("Disk 1 from " + from + " to " + to);
          } else {
               doTower(disk - 1, from, to, inter);
               System.out.println("Disk " + disk + " from " + from + " to " + to);
               doTower(disk - 1, inter, from, to);
          }
     }
}
