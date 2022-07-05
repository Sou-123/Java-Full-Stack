import java.util.Scanner;

public class ExceptionOne {
	
	    public static void main(String args[]) {
	        Scanner sc = new Scanner(System.in);

	        System.out.println("Enter the first value: ");
	        int firstNumber = sc.nextInt();

	        System.out.println("Enter the second value: ");
	        int secondNumber = sc.nextInt();
	        int result;
	        try {
	            result = firstNumber / secondNumber;
	            System.out.println("The result is:" + result);
	        } catch (ArithmeticException e) {
	            System.out.println("Cannot divide any number by zero " + e);
	        }
	        if (secondNumber == 0) {
	            System.out.println("The arithmetic exception is handled");
	        }
	    }
	}


