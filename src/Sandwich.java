
public class Sandwich extends Edible {
	private String mainIngredient;
	private String size;
	
	public Sandwich(String name, double price, int calories, String mainIngredient, String size) {
		super(name, price, calories);
		this.mainIngredient = mainIngredient;
		this.size = size;
	}
	
	public String getMainIngredient() {
		return mainIngredient;
	}
	
	public String getSize() {
		return size;
	}
	
	public String toString() {
		return String.format("Product Name: %s   ,   Price: %s  ,   Calories: %s,   Expiry Date: %s,   Main Ingredient: %s,   Size: %s", 
				getName(),getPrice(), getCalories(), getExpiryDate(), getMainIngredient(), getSize());
	}
}
