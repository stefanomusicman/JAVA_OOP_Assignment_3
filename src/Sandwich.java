import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Sandwich extends Product implements ExpiryDate {
	private String mainIngredient;
	private String size;
	private int calories;
	private String expiryDate;
	
	public Sandwich(String name, double price, int calories, String mainIngredient, String size) throws InvalidCaloriesException {
		super(name, price);
		
		if(calories < 0 || calories > 300) {
			throw new InvalidCaloriesException("Calories must be between 0 and 300");
		}
		
		
		this.mainIngredient = mainIngredient;
		this.size = size;
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
	
	public String getMainIngredient() {
		return mainIngredient;
	}
	
	public String getSize() {
		return size;
	}
	
	public int getCalories() {
		return calories;
	}
	
	public String toString() {
		return String.format("Product Name: %s   ,   Price: %s  ,   Calories: %s,   Expiry Date: %s,   Main Ingredient: %s,   Size: %s", 
				getName(),getPrice(), getCalories(), getExpiryDate(), getMainIngredient(), getSize());
	}

}
