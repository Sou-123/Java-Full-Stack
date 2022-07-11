
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Product{
String name;
float price;

public Product(String name,float price){
super();
this.name=name;
this.price=price;

}
}
public class LambdaTwoMain{
public static void main(String[] args){
List<Product>list=new ArrayList<Product>();

//adding products 
list.add(new Product("Lenovo",15000f));
list.add(new Product("Apple",20000f));
System.out.println("");

//implementing lambda expression:

for(Product p:list){
	System.out.println("products greater than 10k are"+p.price<10000);

}


} 
}