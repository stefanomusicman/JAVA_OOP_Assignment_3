
public class Gas extends Product {
	
	public Gas(String name,double price) {
		super(name, price);	
	}
	
	static double totalLiters = 1000;
	
	public double getPrice(double usernum) {
		return super.getPrice() * usernum;	
	}
	
	public String toString() {
		return String.format("Product Name: %s   ,  Price: %s   ,  Total Liters: %s  ", getName(),getPrice(), totalLiters);
	}
}
