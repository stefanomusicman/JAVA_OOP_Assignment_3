import java.util.Scanner;

public class Assignment_3 {

	public static void main(String[] args) {
		startMenu();
	}

	public static void startMenu() {
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
			System.out.println("8- Compare two sandwiches");
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
				System.out.println("1-chocolate bar");
				break;
			case 2:

				break;
			case 3:

				break;
			case 4:

				break;
			case 5:

				break;
			case 6:

				break;
			case 7:

				break;
			case 8:

				break;
			case 9:

				break;
			case 10:

				break;
			case 11:

				break;
			case 12:

				break;
			}
		
		} while (menuSelect!=13);
		
		System.out.println("Exiting the program.");
		userInput.close();
	}
}
