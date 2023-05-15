public class TwoSwap {
 
 public static void main(String[] args) {
     
   int a, b, temp;
   a = 15;
   b = 27;
   System.out.println("Before swapping : a, b = "+a+", "+ + b);
   temp = a;
   a = b;
   b = temp;   
  System.out.println("After swapping : a, b = "+a+", "+ + b);
 }
 }

=======================
  public class TwoSwap {
  public static void main(String[] args) {
     // int, double, float
   int a, b;
   a = 15;
   b = 27;
   System.out.println("Before swapping : a, b = "+a+", "+ + b);
   a = a + b;
   b = a - b;
   a = a - b;
   System.out.println("After swapping : a, b = "+a+", "+ + b);
 }
 
}
======================
  import java.util.Scanner;
public class Main {
 public static void main(String[] args) {
   int x, y, z;
   Scanner in = new Scanner(System.in);

   System.out.println("Input the first number: ");
   x = in.nextInt();
   System.out.println("Input the second number: ");
   y = in.nextInt();

   z = x;
   x = y;
   y = z;

   System.out.println(" Swapped values are3:" + x + " and " + y);
  }
}
