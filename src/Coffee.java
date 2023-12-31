// Mickael Lavigeur-Leduc - 202234349
// Stefano Proietti - 2012831

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Coffee extends Product implements ExpiryDate {
	private String blend;
	private String expiryDate;
	
	public Coffee(double price, String blend) {
		super("Coffee", price);
		this.blend = blend;
		this.expiryDate = createExpiryDate();
	}
	
	@Override
	public String createExpiryDate() {
		LocalDate currentDate = LocalDate.now();
		
		LocalDate expiryDate = currentDate.plusDays(30);
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM dd yyyy");
		
		return expiryDate.format(formatter);
	}

	@Override
	public String getExpiryDate() {
		return expiryDate;
	}
	
	public String getBlend() {
		return blend;
	}
	
	public String toString() {
		return String.format("Product Name: %s   ,   Price: %s  ,   Blend: %s,   Expiry Date: %s", getName(),getPrice(), getBlend(), getExpiryDate());
	}

	
}
