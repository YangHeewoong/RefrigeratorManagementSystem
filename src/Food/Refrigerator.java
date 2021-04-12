package Food;

import java.util.Scanner;

public class Refrigerator {
	
	protected FoodType type = FoodType.Fruit;
	protected String Food;
	protected int number;
	protected String Shelflife;
	protected String Storage;
	
	public Refrigerator() {
	}
	
	public Refrigerator(String Food) {
		this.Food = Food;
	}
	
	public Refrigerator(String Food, int number, String Shelflife, String Storage) {
		this.Food = Food;
		this.number = number;
		this.Shelflife = Shelflife;
		this.Storage = Storage;
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
	
	public void printinfo() {
		System.out.println("\nFood :" + this.Food+ "\n" + 
						   "number : " + this.number + "\n" +
				           "Shelflife : " + this.Shelflife + "\n" +
			 	           "Storage : " + this.Storage);
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
	
}
