
import java.util.*;

class Product{
String name;
Double price;

public Product(String name,Double price){
super();
this.name=name;
this.price=price;

	}
}
public class LambdaTwo{
public static void main(String[] args){
List<Product>list=new ArrayList<Product>();


list.add(new Product("Dell",4500.0));
list.add(new Product("Apple",89000.0));
System.out.println("");


for(Product p:list){ 
	if(p.price > 10000)
	System.out.println("The products which are greater than 10k are considered "+p.name);
	else	{
		System.out.println("The products which are lesser than 10k are not considered ,add more item worth of rupees "+ (10000.0- p.price) );
	}
		}
	} 
}