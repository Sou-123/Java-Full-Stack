
import java.util.*;

public class CollectionTwo {

	public static void main(String[] args) {
		
		HashMap p=new HashMap();
		
		p.put("HP",1);
		p.put("Dell",2);
		p.put("Lenovo",3);
		p.put("Hp",4);
		p.put("Acer",5);
		p.put("Samsung",6);
		p.put("HP",7);
		p.put("Acer",8);
		p.put("Lenovo",9);
		p.put("Dell",10);
		p.put("Apple",11);

		System.out.println(p);

		
		Set s=p.keySet();
		System.out.println("The keys are:"+s);
		
		CollectionTwo c=(CollectionTwo) p.values();
		System.out.println("The values are:"+c);
		
		Set s2=p.entrySet();
		System.out.println("The key value pair:"+s2);
	
	}
	
		
		
	
}