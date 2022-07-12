
import java.util.ArrayList;

public class AssignmentTwo {

	//instance variable
		var x = 50; // we can not use var here 
	public static void main(String[] args) {
		
        var a = 200;
  
        var b = 1.800;
  
        var c = 'r';
  
        var d = "Kiran";
  
        var e = false;
        
        var f = 100;
          
        var<var> al = new ArrayList<>();
        
        al.add(10);
        al.add(20);
        al.add(30);
        
        // print the list
        System.out.println(al);
        
      var<Integer> a2 = new ArrayList<Integer>();
        
        // add elements 
      a2.add(10);
      a2.add(20);
      a2.add(30);
      
      // print the list
      System.out.println(a2);
        // print a to the console
        System.out.println(a);
        var variable;
        
        // This is also not valid
      var variable = null;
        
        var method1() { return ("Inside Method1"); }
        
        // method2 using var for a
        // parameter
        
       // var cannot be used for method parameters and return type.
        void method2(var a) { System.out.println(a); }
        Demo1 obj = new Demo1();
        
        // call method1
        var res = obj.method1();
  
        // call method2
        obj.method2();
  
        // type inference is used in var keyword in which it
        // automatically detects the datatype of a variable
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(p);
        System.out.println(q);

	}

}
