package Food;

import java.util.Scanner;

public class Spice extends Refrigerator {  //Spice의 용량(단위 :ml, L)추가
    
	protected String capacity;
	
	public Spice(FoodType type) {
		super(type);
	}
	
	public void getUserInput(Scanner input) {
		
		System.out.print("Spice Name : "); 
		String Food = input.next();
		this.setFood(Food);
		
		System.out.print("Number of Beverage : ");
		int number = input.nextInt();
		this.setNumber(number);
		
		System.out.print("Capacity : ");
		String Capacity = input.next();
		this.setCapacity(Capacity);
		
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
				           "Capacity : " + this.Capacity + "\n" +
						   "Shelflife : " + this.Shelflife + "\n" +
			 	           "Storage : " + this.Storage + "\n");
	}
}
