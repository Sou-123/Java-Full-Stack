
abstract class Display {
   private abstract void display();
}
 
public class OopsFour extends Display {
    void display() {
         System.out.println("In the display method");
    }
   public static void main(String args[]) {
     System.out.println("In the main class");
   }
}
