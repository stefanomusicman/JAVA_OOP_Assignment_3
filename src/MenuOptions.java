import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class MenuOptions {	
	public static void optionOne(ArrayList<Product> productList, Scanner scanner) {
		String chocolate;
		double price;
		int calories;
		
		while(true) {
			System.out.print("What is the name of the chocolate bar: ");
			chocolate = scanner.nextLine();
			
			if(chocolate.trim().isEmpty()) {
				System.out.println("Field cannot be empty.");
			} else {
				break;
			}
		}
		
		while(true) {
			System.out.print("Price of the chocolate bar: ");
			String input = scanner.nextLine();
			
			try {
				price = Double.parseDouble(input);
				break;
			} catch(Exception e) {
				System.out.println("Must be a number");
			}
			
		}
		
		while(true) {
			System.out.print("Enter the amount of calories: ");
			String input = scanner.nextLine();
			
			if(input.trim().isEmpty()) {
				System.out.println("Field cannot be empty.");
				continue;
			}
			
			try {
				calories = Integer.parseInt(input);
				
				Chocolate chocolateBar = new Chocolate(chocolate, price, calories);
				productList.add(chocolateBar);
				System.out.println("Chocolate Bar has been added!");
				break;
			} catch(Exception e) {
				System.out.println(e);
			}
		}
	}
	
	public static void optionTwo(ArrayList<Product> productList, Scanner scanner) {
		String name;
		String mainIngredient;
		String size;
		double price;
		int calories;
		
		while(true) {
			System.out.print("Name of the sandwich: ");
			name = scanner.nextLine();
			
			if(name.trim().isEmpty()) {
				System.out.println("Field cannot be empty. ");
			} else {
				break;
			}
			
		}
		
		while(true) {
			System.out.print("What is the main ingredient of your sandwich: ");
			mainIngredient = scanner.nextLine();

			if(mainIngredient.trim().isEmpty()) {
				System.out.print("Invalid input! Field cannot be empty! ");
			} else if(!mainIngredient.equals("chicken") && !mainIngredient.equals("meat") && !mainIngredient.equals("veggie")) {
				System.out.print("Please choose a valid ingredient (chicken, meat or veggie) ");
				continue;
			} else {
				break;
			}
		}
		
		while(true) {
			System.out.print("Price of the sandwich: ");
			String input = scanner.nextLine();
			
			try {
				price = Double.parseDouble(input);
				break;
			} catch(Exception e) {
				System.out.println("Must be a number");
			}
			
		}
		
		while(true) {
			System.out.print("What is the size of your sandwich(small, medium, large): ");
			size = scanner.nextLine();

			if(size.trim().isEmpty()) {
				System.out.print("Invalid input! Field cannot be empty! ");
			} else if(!size.equals("small") && !size.equals("medium") && !size.equals("large")) {
				System.out.print("Please choose a valid size, either medium or large. ");
				continue;
			} else {
				break;
			}
		}
		
		while(true) {
			System.out.print("Enter the amount of calories: ");
			String input = scanner.nextLine();
			
			if(input.trim().isEmpty()) {
				System.out.println("Field cannot be empty.");
				continue;
			}
			
			try {
				calories = Integer.parseInt(input);
				
				Sandwich sandwich = new Sandwich(name, price, calories, mainIngredient, size);
				productList.add(sandwich);
				System.out.println("Sandwich has been successfully added!");
				break;
			} catch(Exception e) {
				System.out.println(e);
			}
		}
	}
	
	public static void optionThree(ArrayList<Product> productList, Scanner scanner) {
		double amountOfLiters;
		
		while(true) {
			System.out.print("How many Liters would you like to add: ");
			String input = scanner.nextLine();
			
			if(input.trim().isEmpty()) {
				System.out.println("Field cannot be empty. ");
				continue;
			}
			
			try {
				amountOfLiters = Double.parseDouble(input);
				break;
			} catch(Exception e) {
				System.out.println("Must be a number ");
			}
		}
		
		Gas.totalLiters += amountOfLiters;
		System.out.println("Gas has been successfully added!");
	}
	
	public static void optionFour(ArrayList<Product> productList, Scanner scanner) {
		String blend;
		double price;
		
		while(true) {
			System.out.print("Blend of the coffee: ");
			blend = scanner.nextLine();
			
			if(blend.trim().isEmpty()) {
				System.out.println("Field cannot be empty. ");
			} else {
				break;
			}
		}
		
		while(true) {
			System.out.print("Price of the coffee: ");
			String input = scanner.nextLine();
			
			if(input.trim().isEmpty()) {
				System.out.println("Field cannot be empty. ");
				continue;
			}
			
			try {
				price = Double.parseDouble(input);
				
				Coffee coffee = new Coffee(price, blend);
				productList.add(coffee);
				System.out.println("Coffee has been successfully added!");
				break;
			} catch(Exception e) {
				System.out.println("Must be a number. ");
			}
		}
	}
	
	public static void optionFive(ArrayList<Product> productList) {
		System.out.println("--------- List of Chocolate Bars in Stock ---------");
		for (Object item : productList) {
			if(item instanceof Chocolate) {
				System.out.println(item.toString());
			}
		}
	}
	
	public static void optionSix(ArrayList<Product> productList) {
		System.out.println("-------- Comparison of 2 Chocolate Bars --------");
		Chocolate chocolateOne = null;
		Chocolate chocolateTwo = null;
		int chocolateCount = 0;
		int compareResult;
		
		for (Object item : productList) {
			if (item instanceof Chocolate) {
                Chocolate chocolate = (Chocolate) item;

                if (chocolateCount == 0) {
                    chocolateOne = chocolate;
                } else if (chocolateCount == 1) {
                    chocolateTwo = chocolate;
                    break;
                }
                chocolateCount++;
            }
		}
		
		if(chocolateOne == null || chocolateTwo == null) {
			System.out.println("Cannot make comparison, we do not have 2 types of Chocolate Bars in stock. Sorry :(");
		} else {
			System.out.println("First Chocolate Bar: " + chocolateOne.toString());
			System.out.println("Second Chocolate Bar: " + chocolateTwo.toString());
			compareResult = chocolateOne.compareTo(chocolateTwo);
			if(compareResult == -1) {
				System.out.println("Result: The healthier chocolate bar is the first Option: " + chocolateOne.getName());
			} else if(compareResult == 1) {
				System.out.println("Result: The healthier chocolate bar is the second Option: " + chocolateTwo.getName());
			} else {
				System.out.println("Result: Both are equal.");
			}
		}
	}
}
