
public class StringSix {
	
	public static void main(String[] args) {

        StringBuffer stringOne = new StringBuffer("This method returns the reversed object on which it was called");
        System.out.println("Before reversing : "+stringOne);

        StringBuffer stringTwo=stringOne.reverse();
        System.out.println("After reversing : " + stringTwo);

    }
}


