package JavaObject;

public class A {

    private static final A a = new A();

     private A() {
          System.out.println("private constructor");
     }

//     public static A getA() {
//          System.out.println("factory method ");
//          return a;
//     }

     public static void msg() {
          System.out.println("hello user");
     }

     public static void main(String[] args) {
          A aa;
          aa = new A();
//         System.out.println("");
        // A.getA();
        System.out.println("");
         A.msg();
     }
}
