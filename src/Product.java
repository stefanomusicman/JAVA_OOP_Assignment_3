// Mickael Lavigeur-Leduc - 202234349
// Stefano Proietti - 2012831

public class Product {
	private String name;
	private double price;
	
	public Product(String name,double price) {
		
		this.name = name;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	
	public double getPrice() {
		return price;
	}
	
	public String toString() {
		return String.format("Product Name: %s   ,   Price: %s  ", getName(),getPrice());
	}
}
