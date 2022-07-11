
public class LambdaMain {
	
	public static void main(String args[]) {
	      LambdaMain tester = new LambdaMain();
			
	     
	      MathOperation addition = (int a, int b) -> a + b;
			
	     
	      MathOperation subtraction = (a, b) -> a - b;
			
	      
	      MathOperation multiplication = (int a, int b) -> { return a * b; };
			
	    
	      MathOperation division = (int a, int b) -> a / b;
			
	      System.out.println("20 + 2 = " + tester.operate(20, 2, addition));
	      System.out.println("20 - 2 = " + tester.operate(20, 2, subtraction));
	      System.out.println("20 x 2 = " + tester.operate(20, 2, multiplication));
	      System.out.println("20 / 2 = " + tester.operate(20, 2, division));
			
	      
	      Greeting greet1 = message ->
	      System.out.println("Hello " + message);
			
	     
	      Greeting greet2 = (message) ->
	      System.out.println("Hello " + message);
			
	      greet1.sayMessage("Soumya");
	      greet2.sayMessage("Manuel");
	   }
		@FunctionalInterface
	   interface MathOperation {
	      int operation(int a, int b);
	   }
		@FunctionalInterface
	   interface Greeting {
	      void sayMessage(String message);
	   }
		
	   private int operate(int a, int b, MathOperation mathOperation) {
	      return mathOperation.operation(a, b);
	   }
	}



