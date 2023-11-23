import java.util.ArrayList;
import java.util.Scanner;

public class Assignment_3 {

	public static void main(String[] args) {
		ArrayList<Product> products = new ArrayList<Product>();

		startMenu(products);
	}

	public static void startMenu(ArrayList<Product> productsList) {
		Scanner userInput = new Scanner(System.in);
		
		int menuSelect;
		
		do {
			System.out.println("1- Add a chocolate bar");	
			System.out.println("2- Add a sandwich");	
			System.out.println("3- Add gas");
			System.out.println("4- Add coffee");
			System.out.println("5- Display all chocolate bars");
			System.out.println("6- Compare two chocolate bars and display which one is healthier");
			System.out.println("7- Display all sandwiches");
			System.out.println("8- Compare two sandwiches and display which one is cheaper");
			System.out.println("9- Sell an edible item");
			System.out.println("10- Sell gas");
			System.out.println("11- Sell coffee");
			System.out.println("12- Display how much gas do we have in tanks");
			System.out.println("13- Exit");	


			while(true) {
				System.out.print("Please make a selction (1-13): ");
				String input = userInput.nextLine();

				if(input.trim().isEmpty()) {
					System.out.print("Invalid input! Field cannot be empty! ");
				} else {

					try {
						menuSelect = Integer.parseInt(input);
						if (menuSelect < 1 || menuSelect > 13) {
							System.out.println("Invalid selection! ");
							continue;
						}
						break;
					} catch(Exception e) {
						System.out.print("Invalid input! Must be a number! ");
						continue;
					}
				}
			}

			switch (menuSelect) {
			case 1:
				MenuOptions.optionOne(productsList, userInput);
				// this will prompt the user to press any key before returning to the main menu
				// it will allow them to see the confirmation message that the item had been added
				System.out.println("Press Enter to return to main menu...");
				userInput.nextLine();
				break;
			case 2:
				MenuOptions.optionTwo(productsList, userInput);
				System.out.println("Press Enter to return to main menu...");
				userInput.nextLine();
				break;
			case 3:
				MenuOptions.optionThree(productsList, userInput);
				System.out.println("Press Enter to return to main menu...");
				userInput.nextLine();
				break;
			case 4:
				MenuOptions.optionFour(productsList, userInput);
				System.out.println("Press Enter to return to main menu...");
				userInput.nextLine();
				break;
			case 5:
				MenuOptions.optionFive(productsList);
				System.out.println("Press Enter to return to main menu...");
				userInput.nextLine();
				break;
			case 6:
				MenuOptions.optionSix(productsList);
				System.out.println("Press Enter to return to main menu...");
				userInput.nextLine();
				break;
			case 7:
				MenuOptions.optionSeven(productsList);
				System.out.println("Press Enter to return to main menu...");
				userInput.nextLine();
				break;
			case 8:
				MenuOptions.optionEight(productsList);
				System.out.println("Press Enter to return to main menu...");
				userInput.nextLine();
				break;
			case 9:
				MenuOptions.optionNine(productsList, userInput);
				System.out.println("Press Enter to return to main menu...");
				userInput.nextLine();
				break;
			case 10:
				MenuOptions.optionTen(productsList, userInput);
				System.out.println("Press Enter to return to main menu...");
				userInput.nextLine();
				break;
			case 11:
				MenuOptions.optionEleven(productsList, userInput);
				System.out.println("Press Enter to return to main menu...");
				userInput.nextLine();
				break;
			case 12:
				MenuOptions.optionTwelve(productsList);
				System.out.println("Press Enter to return to main menu...");
				userInput.nextLine();
				break;
			}
		
		} while (menuSelect!=13);
		
		System.out.println("Exiting the program.");
		userInput.close();
	}
}
