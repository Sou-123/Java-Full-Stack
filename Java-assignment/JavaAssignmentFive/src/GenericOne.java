import java.util.HashSet;

public class GenericOne {
	
	private int id;
    private String name;
    private double salary;
    private String department;

    public GenericOne(int id, String name, double salary, String department) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salarylary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }


    public String displayDetails(){
        return "GenericEmployee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary='" + salary + '\'' +
                ", department='" + department + '\'' +
                '}';
    }
}

class Main{
    public static void main(String[] args) {
        HashSet<GenericOne> employees = new HashSet<>();

        employees.add(new GenericOne(1,"Disha",3000,"Accounts"));
        employees.add(new GenericOne(2,"Sameeer",4000,"IT"));
        employees.add(new GenericOne(3,"Reeja",5000,"Business"));
        employees.add(new GenericOne(4,"Lekshmi",5000,"HR"));
        employees.add(new GenericOne(5,"Amarjeet",9000,"IT"));
        employees.add(new GenericOne(6,"Linda",4400,"Accounts"));

        for(GenericOne e : employees){
            System.out.println(e.displayDetails());
        }
    }
}


