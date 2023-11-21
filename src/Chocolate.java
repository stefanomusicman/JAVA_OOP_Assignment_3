import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Chocolate extends Product implements ExpiryDate {
	private int calories;
	private String expiryDate;
	
	public Chocolate(String name, double price, int calories) throws InvalidCaloriesException {
		super(name, price);
		
		if(calories < 0 || calories > 3000) {
			throw new InvalidCaloriesException("Calories must be between 0 and 3000");
		}
		
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

	@Override
	public String getExpiryDate() {
		return expiryDate;
	}
	
	public int getCalories() {
		return calories;
	}
	
	public String toString() {
		return String.format("Product Name: %s   ,   Price: %s  ,   Calories: %s,   Expiry Date: %s", getName(),getPrice(), getCalories(), getExpiryDate());
	}
}
