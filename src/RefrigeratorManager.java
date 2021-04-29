import java.util.ArrayList;
import java.util.Scanner;

import Food.Beberage;
import Food.FoodType;
import Food.Meat;
import Food.Refrigerator;
import Food.Spice;

public class RefrigeratorManager {
	ArrayList<Refrigerator> refrigerators = new ArrayList<Refrigerator>();
	Scanner input; 
	
	RefrigeratorManager(Scanner input) {
		this.input = input;
	}
	
	public void addFood() {	
		int type = 0;
		Refrigerator refrigerator;
		while (type !=1 && type !=2 && type !=3 && type !=4 && type !=5 && type !=6) {			
			System.out.print("\n 1. Fruit");
			System.out.print("\n 2. Vegetable");
			System.out.print("\n 3. Meat");
			System.out.print("\n 4. SeaFood");
			System.out.print("\n 5. Beberage");
			System.out.print("\n 6. Spice");			
			System.out.print("\n Select num for FoodType between 1~6 : ");
			type = input.nextInt();
			if (type == 1) {
				refrigerator = new Refrigerator(FoodType.Fruit);
				refrigerator.getUserInput(input);
				refrigerators.add(refrigerator);
				break;
			}
			else if (type == 2) {
				refrigerator = new Refrigerator(FoodType.Vegetable);
				refrigerator.getUserInput(input);
				refrigerators.add(refrigerator);
				break;
			}
			else if (type == 3) {
				refrigerator = new Meat(FoodType.Meat);
				refrigerator.getUserInput(input);
				refrigerators.add(refrigerator);
				break;
			}
			else if (type == 4) {
				refrigerator = new Refrigerator(FoodType.SeaFood);
				refrigerator.getUserInput(input);
				refrigerators.add(refrigerator);
				break;
			}
			else if (type == 5) {
				refrigerator = new Beberage(FoodType.Beberage);
				refrigerator.getUserInput(input);
				refrigerators.add(refrigerator);
				break;
			}
			else if (type == 6) {
				refrigerator = new Spice(FoodType.Spice);
				refrigerator.getUserInput(input);
				refrigerators.add(refrigerator); 
				break;
			}
			else {
				System.out.print("Select num for FoodType between 1~6 : ");
			}
		}	
				
		System.out.println("Food is sucessfully registered!");
	}
	
	public void deleteFood() {
		System.out.println("Input what you want to delete food type");
		
		System.out.print("Type of Food : ");
		String Delete_Food = input.next();
		int index = -1;
		
		for(int i = 0; i < refrigerators.size(); i++) {
			if (refrigerators.get(i).getFood().equals(Delete_Food)) {
				index = i;
				break;
			}
		}
		if(index >=0) {
			refrigerators.remove(index);
			System.out.println(Delete_Food + "is sucessfully deleted!");
		}
		
		else {
			System.out.println("Food has not been registered");
			return;
		}
	}
	
	public void editFood() {
		System.out.println("Input what you want to Edit");
		String Edit_Food = input.next();	
		for(int i = 0; i < refrigerators.size(); i++) {
			Refrigerator refrigerator = refrigerators.get(i);
			if(refrigerator.getFood().equals(Edit_Food)) {
				int num = 0;
				while( num != 5) {
					System.out.println("\n<Refrigerator Information Edit Menu>");
					System.out.println("1. Edit Food name");
					System.out.println("2. Edit Number of Food");
					System.out.println("3. Edit Food Shelf life");
					System.out.println("4. Edit Food Storage");
					System.out.println("5. Exit");
					System.out.println("Select one number between 1-5");
					num = input.nextInt();
					if (num == 1) {
						System.out.println("Type of Food : ");
						String Food = input.next();
						refrigerator.setFood(Food);
					}
					else if (num == 2) {
						System.out.println("Number of Food : ");
						int number = input.nextInt();
						refrigerator.setNumber(number);
					}
					else if (num == 3) {
						System.out.println("Shelf life : ");
						String shelflife = input.next();
						refrigerator.setShelflife(shelflife);
					}
					else if (num == 4) {
						System.out.println("Storage Place : ");
						String Storage = input.next();
						refrigerator.setStorage(Storage);
					}
					else {
						continue;
					}	//if
				}	//while
				break;
			}	//if
		}	//for
	}	
	
	public void viewFood() {
		System.out.println("Registered Number of Food : " + refrigerators.size());
		for(int i = 0; i < refrigerators.size(); i++) {
			refrigerators.get(i).printinfo();
		}
	}
}
