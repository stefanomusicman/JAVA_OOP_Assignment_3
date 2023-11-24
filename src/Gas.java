// Mickael Lavigeur-Leduc - 202234349
// Stefano Proietti - 2012831

public class Gas extends Product {
	
	public Gas(String name,double price) {
		super(name, price);	
	}
	
	static double totalLiters = 1000;
	
	public double getPrice(double usernum) {
		
		return Math.round((super.getPrice() * usernum)*100)/100;	
	}
	
	public String toString() {
		return String.format("Product Name: %s   ,  Price: %s   ,  Total Liters: %s  ", getName(),getPrice(), totalLiters);
	}
}
