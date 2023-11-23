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
		int optionThreeSelect;
		String nameGas;
		double priceGas;
		
		//Action selection
		do {
			System.out.println("1- Add fuel to the tank");	
			System.out.println("2- Add gas to sell");
			System.out.println("3- Back");
			
			while(true) {
				System.out.print("Please make a selction (1-3): ");
				String input = scanner.nextLine();

				if(input.trim().isEmpty()) {
					System.out.print("Invalid input! Field cannot be empty! ");
				} else {

					try {
						optionThreeSelect = Integer.parseInt(input);
						if (optionThreeSelect < 1 || optionThreeSelect > 3) {
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
			
			switch (optionThreeSelect) {
			case 1:
				//Add to the total tank
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
				break;
			case 2:
				//Add type of gas to sell
				while(true) {
					System.out.print("Name of the gas: ");
					nameGas = scanner.nextLine();
					if(nameGas.trim().isEmpty()) {
						System.out.println("Field cannot be empty. ");
					} else {
						break;
					}
				}
				
				while(true) {
					System.out.print("Price of the gas: ");
					String input = scanner.nextLine();
					
					if(input.trim().isEmpty()) {
						System.out.println("Field cannot be empty. ");
						continue;
					}
					
					try {
						priceGas = Double.parseDouble(input);
						
						Gas gas = new Gas(nameGas,priceGas);
						productList.add(gas);
						System.out.println("Gas type has been successfully added!");
						break;
					} catch(Exception e) {
						System.out.println("Must be a number. ");
					}
				}
				
				break;
			}
			
		}while (optionThreeSelect!=3);
		
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
	
	public static void optionSeven(ArrayList<Product> productList) {
		//Show all sandwiches available 
		System.out.println("--------- List of Sandwiches in Stock ---------");
		for (Object item : productList) {
			if(item instanceof Sandwich) {
				System.out.println(item.toString());
			}
		}
	}
	
	public static void optionEight(ArrayList<Product> productList) {
		//Compare price sandwich
		System.out.println("-------- Comparison of 2 Sandwiches for lower price --------");
		Sandwich sandwichOne = null;
		Sandwich sandwichTwo = null;
		int sandwichCount = 0;
		int compareResult;
		
		for (Object item : productList) {
			if (item instanceof Sandwich) {
                Sandwich sandwich = (Sandwich) item;

                if (sandwichCount == 0) {
                    sandwichOne = sandwich;
                } else if (sandwichCount == 1) {
                    sandwichTwo = sandwich;
                    break;
                }
                sandwichCount++;
            }
		}
		
		if(sandwichOne == null || sandwichTwo == null) {
			System.out.println("Cannot make comparison, we do not have 2 types of sandwiches in stock.");
		} else {
			System.out.println("First sandwich: " + sandwichOne.toString());
			System.out.println("Second sandwich: " + sandwichTwo.toString());
			compareResult = sandwichOne.compareTo(sandwichTwo);
			if(compareResult == -1) {
				System.out.println("The first sandwich is cheaper");
			}
			else if(compareResult == 1){
				System.out.println("The second sandwich is cheaper");
			}
			else {
				System.out.println("Result: Both are equal.");
			}
			
		}
	}
	
	public static void optionNine(ArrayList<Product> productList, Scanner scanner) {
		//Make choice choco sandwich
		int choiceSelect;
		int userAmountProd;
		double totalPrice;
		int optionType;
		
		do {
			//Inside for reset
			int numberType = 1;
			int selectCount = 1;
			
			System.out.println("--------- Sell an edible item ---------");
			System.out.println("1- Chocolate Bar");	
			System.out.println("2- Sandwich");
			System.out.println("3- Back");
			
			while(true) {
				System.out.print("Please make a selction (1-3): ");
				String input = scanner.nextLine();

				if(input.trim().isEmpty()) {
					System.out.print("Invalid input! Field cannot be empty! ");
				} else {

					try {
						choiceSelect = Integer.parseInt(input);
						if (choiceSelect < 1 || choiceSelect > 3) {
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
			
			switch (choiceSelect) {
			case 1:
				System.out.println("-------- Sell Chocolate Bar --------");
				if(containsChocoObject(productList)) {
				System.out.println("Select a Chocolate Bar");
				
				//List of available blends
				for (Object item : productList) {
					if(item instanceof Chocolate) {
						System.out.println(numberType+"- "+item.toString());
						numberType ++;
					}
				}
				
				while(true) {
					System.out.print("Make a selection: ");
					String inputChoiceChoco = scanner.nextLine();

					if(inputChoiceChoco.trim().isEmpty()) {
						System.out.print("Invalid input! Field cannot be empty! ");
					} else {

						try {
							optionType = Integer.parseInt(inputChoiceChoco);
							if (optionType < 1 || optionType > numberType) {
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
				
				//Number of choco to sell
				System.out.print("Number of chocolate bar: ");
				while(true) {
					String inputChocoProd = scanner.nextLine();

					if(inputChocoProd.trim().isEmpty()) {
						System.out.print("Invalid input! Field cannot be empty! ");
					} else {

						try {
							userAmountProd = Integer.parseInt(inputChocoProd);
							if (userAmountProd < 1) {
								System.out.println("Must have at least one chocolate bar ");
								continue;
							}
							break;
						} catch(Exception e) {
							System.out.print("Invalid input! Must be a number! ");
							continue;
						}
					}
				}
				
				//Output of selected bar
				for (Object item : productList) {
					if(item instanceof Chocolate) {
						if(selectCount == optionType) {
							totalPrice = ((Chocolate) item).getPrice()*userAmountProd;
							System.out.println("For "+userAmountProd+" chocolate bar(s) of "+((Chocolate) item).getName()+" the price will be: "+totalPrice);
						}
						else {
							selectCount ++;
						}	
					}
				}
				}else {
						System.out.println("No Chocolate to sell");
					
				}
				break;
				
			case 2:
				System.out.println("-------- Sell Sandwich --------");
				if(containsSanwichObject(productList)) {
				System.out.println("Select a Sandwich");
				
				//List of available blends
				for (Object item : productList) {
					if(item instanceof Sandwich) {
						System.out.println(numberType+"- "+item.toString());
						numberType ++;
					}
				}
				
				while(true) {
					System.out.print("Make a selection: ");
					String inputChoiceSandwich = scanner.nextLine();

					if(inputChoiceSandwich.trim().isEmpty()) {
						System.out.print("Invalid input! Field cannot be empty! ");
					} else {

						try {
							optionType = Integer.parseInt(inputChoiceSandwich);
							if (optionType < 1 || optionType > numberType) {
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
				
				//Number of sandwich to sell
				System.out.print("Number of sandwiches: ");
				while(true) {
					String inputSandwichProd = scanner.nextLine();

					if(inputSandwichProd.trim().isEmpty()) {
						System.out.print("Invalid input! Field cannot be empty! ");
					} else {

						try {
							userAmountProd = Integer.parseInt(inputSandwichProd);
							if (userAmountProd < 1) {
								System.out.println("Must have at least one sandwich ");
								continue;
							}
							break;
						} catch(Exception e) {
							System.out.print("Invalid input! Must be a number! ");
							continue;
						}
					}
				}
				
				//Output of selected bar
				for (Object item : productList) {
					if(item instanceof Sandwich) {
						if(selectCount == optionType) {
							totalPrice = ((Sandwich) item).getPrice()*userAmountProd;
							System.out.println("For "+userAmountProd+" sandwich(es) of "+((Sandwich) item).getName()+" the price will be: "+totalPrice);
						}
						else {
							selectCount ++;
						}	
					}
				}
				}
				else {
					System.out.println("No Sandwich to sell");
				}
				break;
			}
				
			
		} while (choiceSelect!=3);
		
	}
	
	public static void optionTen(ArrayList<Product> productList, Scanner scanner) {
		//sell gas
		double userLiters;
		double totalPrice;
		int numberGasType = 1;
		int selectCount = 1;
		int optionType;
		
		System.out.println("-------- Sell Gas --------");
		if(containsGasObject(productList)) {
		System.out.print("Enter the amount of liters :");
		String input = scanner.nextLine();
		
		//User liters value input
		while(true) {
			if(input.trim().isEmpty()) {
				System.out.print("Invalid input! Field cannot be empty! ");
			} else {
				try {
					userLiters = Double.parseDouble(input);
					if (userLiters < 0 || userLiters > Gas.totalLiters) {
						System.out.println("Invalid number of liters ");
						continue;
					}
					break;
				} catch(Exception e) {
					System.out.print("Invalid input! Must be a number! ");
					continue;
				}
			}
		}
		
		//generate list of available gas to sell
			for (Object item : productList) {
				
				if(item instanceof Gas) {
					System.out.println(numberGasType+"- "+item.toString());
					numberGasType ++;
				}
				
			}
			
			while(true) {
				System.out.print("Make a selection: ");
				String inputType = scanner.nextLine();

				if(inputType.trim().isEmpty()) {
					System.out.print("Invalid input! Field cannot be empty! ");
				} else {

					try {
						optionType = Integer.parseInt(inputType);
						if (optionType < 1 || optionType > numberGasType) {
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
			
			//Output of selected gas
			for (Object item : productList) {
				if(item instanceof Gas) {
					if(selectCount == optionType) {
						totalPrice = ((Gas) item).getPrice(userLiters);
						System.out.println("For "+userLiters+" liters of "+((Gas) item).getName()+"the price will be: "+totalPrice+"$");
						Gas.totalLiters -= userLiters;
					}
					else {
						selectCount ++;
					}	
				}
			}
		}
		else {
			System.out.println("No Gas to sell");
		}
	}
	
	public static void optionEleven(ArrayList<Product> productList, Scanner scanner) {
		//sell coffee
		int userCups;
		double totalPrice;
		int numberBlends = 1;
		int selectCount = 1;
		int optionType;
		
		System.out.println("-------- Sell Coffee --------");
		if(containsCoffeeObject(productList)) {
		System.out.println("Select a blend");
		
		//List of available blends
		for (Object item : productList) {
			if(item instanceof Coffee) {
				System.out.println(numberBlends+"- "+item.toString());
				numberBlends ++;
			}
		}
		
		while(true) {
			System.out.print("Make a selection: ");
			String input = scanner.nextLine();

			if(input.trim().isEmpty()) {
				System.out.print("Invalid input! Field cannot be empty! ");
			} else {

				try {
					optionType = Integer.parseInt(input);
					if (optionType < 1 || optionType > numberBlends) {
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
		
		//Number of cup to sell
		System.out.print("Number of coffee: ");
		while(true) {
			String inputCup = scanner.nextLine();

			if(inputCup.trim().isEmpty()) {
				System.out.print("Invalid input! Field cannot be empty! ");
			} else {

				try {
					userCups = Integer.parseInt(inputCup);
					if (userCups < 1) {
						System.out.println("Must have at least one coffee ");
						continue;
					}
					break;
				} catch(Exception e) {
					System.out.print("Invalid input! Must be a number! ");
					continue;
				}
			}
		
		}
		
		//Output of selected blend
		for (Object item : productList) {
			if(item instanceof Coffee) {
				if(selectCount == optionType) {
					totalPrice = ((Coffee) item).getPrice()*userCups;
					System.out.println("For "+userCups+" Cup(s) of "+((Coffee) item).getBlend()+" the price will be: "+totalPrice);
				}
				else {
					selectCount ++;
				}	
			}
		}
		}
		else {
			System.out.println("No Coffee to sell");
		}
	}
	
	public static void optionTwelve(ArrayList<Product> productList) {
		//Simple display of total tank
		System.out.println("-------- Gas available in the tank --------");
		System.out.println("	" + Double.toString(Gas.totalLiters) +"  Liters");
		
	}
	
	public static void displayAllItems(ArrayList<Product> productList) {
		System.out.println("--------- List of items in Stocks---------");
		for (Object item : productList) {
				System.out.println(item.toString());
		}
	}
	
	public static boolean containsGasObject(ArrayList<Product> productList) {

        for (Object obj : productList) {

            if (obj instanceof Gas) {

                return true;           
                }        
            }        
        return false; 
    }
	
	public static boolean containsChocoObject(ArrayList<Product> productList) {

        for (Object obj : productList) {

            if (obj instanceof Chocolate) {

                return true;           
                }        
            }        
        return false; 
    }
	
	public static boolean containsSanwichObject(ArrayList<Product> productList) {

        for (Object obj : productList) {

            if (obj instanceof Sandwich) {

                return true;           
                }        
            }        
        return false; 
    }
	
	public static boolean containsCoffeeObject(ArrayList<Product> productList) {

        for (Object obj : productList) {

            if (obj instanceof Coffee) {

                return true;           
                }        
            }        
        return false; 
    }
	
	
}
