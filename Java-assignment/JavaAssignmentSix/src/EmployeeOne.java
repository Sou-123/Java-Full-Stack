import java.util.HashSet;

public class EmployeeOne {

	public static void main(String[] args) {
		
		  HashSet<Employee> employees = new HashSet<>();

		    employees.add(new Employee(1,"Meena","Accounts",7000));
	        employees.add(new Employee(2,"Disha","Finance",3000));
	        employees.add(new Employee(3,"Nisha","HR",12000));
	        employees.add(new Employee(4,"Nihaal","Business",54000));
	        employees.add(new Employee(5,"Prateek","Finance",14000));
	        employees.add(new Employee(6,"Anitha","Accounts",16600));
	        
	        for(Employee e : employees){
	            System.out.println(e.displayDetails());
	        }
	        }


}