
 abstract class ClassOne {
	
	public void printSomething()
	{
		System.out.println("Hello in abstract class");
	}
}
public class OopsFourTwo {

	public static void main(String[] args)
	{
		// instance of abstract
		// class "ClassOne"
		ClassOne obj = new ClassOne(); //abstract class can't be instantiated so it throws error
	}
}



