import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Edible extends Product implements ExpiryDate {
	private int calories;
	private String expiryDate;
	
	public Edible(String name, double price, int calories) {
		super(name, price);
		
		this.calories = calories;
		this.expiryDate = createExpiryDate();
	}
	
	@Override
	public String createExpiryDate() {
		LocalDate currentDate = LocalDate.now();
		
		LocalDate expiryDate = currentDate.plusDays(30);
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM dd yyyy");
		
		return expiryDate.format(formatter);
	}
	
	public int getCalories() {
		return calories;
	}
	
	public String getExpiryDate() {
		return expiryDate;
	}
	
	public String toString() {
		return String.format("Product Name: %s   ,   Price: %s  ,   Calories: %s,   Expiry Date: %s", getName(),getPrice(), getCalories(), getExpiryDate());
	}
	
}
