
interface FunctionInterfaceOne{
	
	int SimpleInterest( int principal, int rate,int time );
	
}
public class AssignmentOne {
	public static void main(String[] args) {
		FunctionInterfaceOne obj=( var p , var r, var t)-> (p*r*t)/100;
		int interest = obj.SimpleInterest(25000, 5, 3);
		 System.out.println(interest);
		
	}
}
    
