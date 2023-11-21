import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class MenuOptions {	
	public static void optionOne(ArrayList<Product> productList, Scanner scanner) {
		String chocolate;
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
			System.out.print("Enter the amount of calories: ");
			String input = scanner.nextLine();
			
			if(input.trim().isEmpty()) {
				System.out.println("Field cannot be empty.");
				continue;
			}
			
			try {
				calories = Integer.parseInt(input);
				
				Chocolate chocolateBar = new Chocolate("Chocolate Bar", 2.50, calories);
				productList.add(chocolateBar);
				System.out.println("Chocolate Bar has been added!");
				break;
			} catch(Exception e) {
				System.out.println(e);
			}
		}
	}
	
	public static void optionTwo(ArrayList<Product> productList, Scanner scanner) {
		String mainIngredient;
		String size;
		double price;
		int calories;
		
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
		
		
		
//		Sandwich sandwich = new Sandwich("Sandwich", price, calories, mainIngredient, size);
//		productList.add(sandwich);
//		System.out.println("The Sandwich has been added.");
	}
}
