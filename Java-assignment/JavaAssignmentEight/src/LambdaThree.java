
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

public class LambdaThree {
    public static void main(String args[])
    {
              IntConsumer display = a -> System.out.println(a * 10);

           
           display.accept(3);
           display.accept(4); 
           display.accept(5);
        System.out.println(display.equals(30));
        }

    }

    /*PROGRAM TO USE CONSUMER AND INTERFACE AND INVOKING INTERFACE USING SOME API METHODS
----------------------------------------------------------------------------------------------
//// Consumer's accept() method
//
//import java.util.ArrayList;
//import java.util.LinkedList;
//import java.util.List;
//import java.util.function.Consumer;
//
//public class Main {
//	public static void main(String args[])
//	{
//		// Consumer to display a number
//		Consumer<Integer> display = a -> System.out.println(a);
//
//		// Implement display using accept()
//		display.accept(10);
//
//		// Consumer to multiply 2 to every integer of a list
//		Consumer<List<Integer> > modify = list ->
//		{
//			for (int i = 0; i < list.size(); i++)
//				list.set(i, 2 * list.get(i));
//		};
//
//		// Consumer to display a list of numbers
//		Consumer<List<Integer> >
//			dispList = list -> list.stream().forEach(a -> System.out.print(a + " "));

		List<Integer> list = new ArrayList<Integer>();
		list.add(2);
	list.add(1);
		list.add(3);

	Implement modify using accept()
		modify.accept(list);
		// Implement dispList using accept()
		dispList.accept(list);

------------------------------------------------------------------------------------------------
SUPPLIER PROGRAM
---------------
import java.util.function.Supplier;

public class Main {
	public static void main(String args[])
	{

		// This function returns a random value.
		Supplier<Double> randomValue = () -> Math.random();

		// Print the random value using get()
		System.out.println(randomValue.get());
	}
}
---------------------------------------------------------------------------------
// Java program to illustrate Simple Predicate

import java.util.function.Predicate;
public class PredicateInterfaceExample1 {
	public static void main(String[] args)
	{
		// Creating predicate
		Predicate<Integer> lesserthan = i -> (i < 18);

		// Calling Predicate method
		System.out.println(lesserthan.test(10));
	}
}
*/
