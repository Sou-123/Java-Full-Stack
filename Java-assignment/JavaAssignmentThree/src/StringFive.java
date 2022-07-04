
public class StringFive {
	
	public static void main(String[] args) {

        StringBuffer stringOne = new StringBuffer("it is used to _ at the specified index position");

        System.out.println("string buffer before inserting = " + stringOne);
        stringOne.replace(14,  15,"insert text");


        System.out.println("After replacing using string buffer= " + stringOne);

    }
}


