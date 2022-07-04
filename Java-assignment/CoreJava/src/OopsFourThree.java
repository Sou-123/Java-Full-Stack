
abstract class MyClass {
   public abstract void display();
   public abstract void setName(String name);
   public abstract void setAge(int age);
}
public abstract class OopsFourThree extends MyClass{
   public void display(){
      System.out.println("This is the subclass implementation of the displaymethod ");
   }
}