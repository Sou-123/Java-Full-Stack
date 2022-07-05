
public class StringFour {
	
	public static void main(String[] args) {

        StringBuilder stringOne=new StringBuilder("String Buffer");
        System.out.println(" Before appending the string will be:--- " +stringOne);

        stringOne.append(" is a peer class of String");
        stringOne.append(" that provides much of");
        stringOne.append(" the functionality of strings");
        System.out.println(" After appending the string will be:--" +stringOne);
    }
}


