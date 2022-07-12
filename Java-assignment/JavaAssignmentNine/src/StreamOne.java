
public class StreamOne {
	
     private String name;
     private int calories;
     private String color;
     private int price;
     
	public StreamOne(String name, int callories, String color, int price) {
		super();
		this.name = name;
		this.calories = callories;
		this.color = color;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCallories() {
		return calories;
	}
	@Override
	public String toString() {
		return "Fruits [name=" + name + ", calories=" + calories + ", color=" + color + ", price=" + price + "]";
	}
	public void setCallories(int callories) {
		this.calories = callories;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
}