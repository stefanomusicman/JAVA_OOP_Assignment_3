
public class Gas extends Product {
	private double liters;
	
	public Gas(double price,double liters) {
		super("Gas", price);
		this.liters = liters;	
	}
	
	static double totalLiters;
	
	public double getLiters() {
		return liters;
	}
	
	public double getPrice() {
		return super.getPrice() * getLiters();	
	}
	
	public String toString() {
		return String.format("Product Name: %s   ,  Price: %s   ,  Liters: %s  ", getName(),getPrice(),getLiters());
	}
}
