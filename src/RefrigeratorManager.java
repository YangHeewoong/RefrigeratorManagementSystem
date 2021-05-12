import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import Food.Beberage;
import Food.FoodInput;
import Food.FoodType;
import Food.Fruit;
import Food.Meat;
import Food.Refrigerator;
import Food.SeaFood;
import Food.Spice;
import Food.Vegetable;

public class RefrigeratorManager {
	ArrayList<FoodInput> refrigerators = new ArrayList<FoodInput>();
	Scanner input; 
	
	RefrigeratorManager(Scanner input) {
		this.input = input;
	}
	
	public void addFood() {	
		int type = 0;
		FoodInput foodinput;
		while (type<1 || type>6) {			
			try {
			System.out.print("\n 1. Fruit");
			System.out.print("\n 2. Vegetable");
			System.out.print("\n 3. Meat");
			System.out.print("\n 4. SeaFood");
			System.out.print("\n 5. Beberage");
			System.out.print("\n 6. Spice");			
			System.out.print("\n Select num for FoodType between 1~6 : ");
			type = input.nextInt();
				if (type == 1) {
					foodinput = new Fruit (FoodType.Fruit);
					foodinput.getUserInput(input);
					refrigerators.add(foodinput);
					break;
				}
				else if (type == 2) {
					foodinput = new Vegetable (FoodType.Vegetable);
					foodinput.getUserInput(input);
					refrigerators.add(foodinput);
					break;
				}
				else if (type == 3) {
					foodinput = new Meat(FoodType.Meat);
					foodinput.getUserInput(input);
					refrigerators.add(foodinput);
					break;
				}
				else if (type == 4) {
					foodinput = new SeaFood (FoodType.SeaFood);
					foodinput.getUserInput(input);
					refrigerators.add(foodinput);
					break;
				}
				else if (type == 5) {
					foodinput = new Beberage(FoodType.Beberage);
					foodinput.getUserInput(input);
					refrigerators.add(foodinput);
					break;
				}
				else if (type == 6) {
					foodinput = new Spice(FoodType.Spice);
					foodinput.getUserInput(input);
					refrigerators.add(foodinput); 
					break;
				}
				else {
					System.out.print("Select num for FoodType between 1~6 : ");
				}
			}
			catch(InputMismatchException e) {
				System.out.println("Error! Input integer between 1 and 6");
				if (input.hasNext()) {
					input.next();
				}
				type = -1;
		}
	}					
		System.out.println("Food is sucessfully registered!");
}
	
	public void deleteFood() {
		System.out.println("Input what you want to delete food type");
		
		System.out.print("Food Name : ");
		String Delete_Food = input.next();
		int index = findIndex(Delete_Food);
		
		for(int i = 0; i < refrigerators.size(); i++) {
			if (refrigerators.get(i).getFood().equals(Delete_Food)) {
				index = i;
				break;
			}
		}
		removefromRefrigerator(index, Delete_Food);
	}
	
	public int findIndex(String Delete_Food) {
		int index = -1;
		for(int i = 0; i < refrigerators.size(); i++) {
			if (refrigerators.get(i).getFood().equals(Delete_Food)) {
				index = i;
				break;
			}
		}
		return index;
	}
	
	public void removefromRefrigerator(int index, String Delete_Food) {
		if(index >=0) {
			refrigerators.remove(index);
			System.out.println(Delete_Food + "is sucessfully deleted!");
		}
		
		else {
			System.out.println("Food has not been registered");		
		}
	}
	
	public void editFood() {
		System.out.println("Input what you want to Edit");
		String Edit_Food = input.next();	
		for(int i = 0; i < refrigerators.size(); i++) {
			FoodInput foodinput = refrigerators.get(i);
			if(foodinput.getFood().equals(Edit_Food)) {
				int num = 0;
				while(num != 5) {					
					showEditMenu();
					num = input.nextInt();
					switch(num) {
					case 1:
						foodinput.setFoodName(input);
						break;
					case 2:
						foodinput.setFoodNumber(input);
						break;
					case 3:
						foodinput.setFoodShelfLife(input);
						break;
					case 4:
						foodinput.setFoodStorage(input);
						break;
					default:
						continue;
						
					}					
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

	
	public void showEditMenu() {
		System.out.println("\n<Refrigerator Information Edit Menu>");
		System.out.println("1. Edit Food name");
		System.out.println("2. Edit Number of Food");
		System.out.println("3. Edit Food Shelf life");
		System.out.println("4. Edit Food Storage");
		System.out.println("5. Exit");
		System.out.println("Select one number between 1-5");
	}
}
