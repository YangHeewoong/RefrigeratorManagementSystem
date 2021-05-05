package Food;

import java.util.Scanner;

public class SeaFood extends Refrigerator implements FoodInput {

	public SeaFood (FoodType type) {
		super(type);
	}
	
	public void getUserInput(Scanner input) {
		System.out.print("Food Name : "); 
		String Food = input.next();
		this.setFood(Food);
		
		System.out.print("Number of Food : ");
		int number = input.nextInt();
		this.setNumber(number);
		
		System.out.print("Shelf life : ");
		String Shelflife = input.next();
		this.setShelflife(Shelflife);
		
		System.out.print("Storage Place : "); 
		String Storage = input.next();
		this.setStorage(Storage);
		
	}
	
	public void printinfo() {
		String ftype = "none";
		switch (this.type) {
		case Fruit :
			ftype = "Fruit";
			break;
		case Vegetable :
			ftype = "Vegetable";
			break;
		case Meat :
			ftype = "Meat";
			break;
		case SeaFood :
			ftype = "SeaFood";
			break;
		case Beberage:
			ftype = "Beberage";
			break;
		case Spice:
			ftype = "Spice";
			break;
		default :
		}
		
		System.out.println("Type : " + ftype + "\n" +
				           "Food :" + this.Food+ "\n" + 
						   "number : " + this.number + "\n" +
				           "Shelflife : " + this.Shelflife + "\n" +
			 	           "Storage : " + this.Storage + "\n");
		
	}	

}
