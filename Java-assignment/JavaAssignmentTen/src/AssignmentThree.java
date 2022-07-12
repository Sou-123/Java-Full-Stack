import java.util.ArrayList;
import java.util.Arrays;

public class AssignmentThree {

	   public static void main(String[] args)
	    {

	        String str = "A quick brown fox jumps over the lazy dog ";

	       
	        String[] strSplit = str.split(" ");

	      
	        ArrayList<String> strList = new ArrayList<String>(
	            Arrays.asList(strSplit));
	        String[] strar= strList.toArray(size ->new String[size]);
	        
	      
	        System.out.println(Arrays.toString(strar));

	    }
	}