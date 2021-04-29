package Food;

import java.util.Scanner;

public class Refrigerator {
	
	protected FoodType type = FoodType.Fruit;
	protected String Food;
	protected int number;
	protected String Shelflife;
	protected String Storage;
	protected String Capacity;
	
	public Refrigerator() {
	}
	
	public Refrigerator(FoodType type) {
		this.type = type;
	}
	
	public Refrigerator(String Food) {
		this.Food = Food;
	}
	
	public Refrigerator(FoodType type, String Food, int number, String Shelflife, String Storage) {
		this.type = type;
		this.Food = Food;
		this.number = number;
		this.Shelflife = Shelflife;
		this.Storage = Storage;
	}
	
	public Refrigerator(FoodType type, String Food, int number, String Shelflife, String Storage, String Capacity) {
		this.type = type;
		this.Food = Food;
		this.number = number;
		this.Shelflife = Shelflife;
		this.Storage = Storage;
		this.Capacity = Capacity;
	}
	
	public FoodType getType() {
		return type;
	}

	public void setType(FoodType type) {
		this.type = type;
	}

	public String getFood() {
		return Food;
	}

	public void setFood(String food) {
		Food = food;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getShelflife() {
		return Shelflife;
	}

	public void setShelflife(String shelflife) {
		Shelflife = shelflife;
	}

	public String getStorage() {
		return Storage;
	}

	public void setStorage(String storage) {
		Storage = storage;
	}
	
	public String getCapacity() {
		return Capacity;
	}
	
	public void setCapacity(String capacity) {
		Capacity = capacity; 
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
