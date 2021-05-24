package Food;

import java.io.Serializable;
import java.util.Scanner;

import exception.FoodShelflifeException;

public abstract class Refrigerator implements FoodInput, Serializable { //Refrigerator의 객체를 생성하지 않음
	/**
	 * 
	 */
	private static final long serialVersionUID = 8172480738290471482L;
	
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

	public void setShelflife(String shelflife) throws FoodShelflifeException {
		if(!shelflife.contains("~")) {
			throw new FoodShelflifeException();
		}
		
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
	
	
	public abstract void printinfo();
	
	public void setFoodName(Scanner input) {
		System.out.print("Food Name : ");
		String Food = input.next();
		this.setFood(Food);
	}
	
	public void setFoodNumber(Scanner input) {
		System.out.print("Number of Food : ");
		int number = input.nextInt();
		this.setNumber(number);
	}
	public void setFoodShelfLife(Scanner input) {
		String shelflife = "";
		while (!shelflife.contains("~")) {
			System.out.print("Shelf life : ");
			shelflife = input.next();
			try {
				this.setShelflife(shelflife);
			} catch (FoodShelflifeException e) {
				System.out.println("Error! Input Shelflife that contains ~");
			}
			
		}
	}
	public void setFoodStorage(Scanner input) {
		System.out.print("Storage Place : ");
		String Storage = input.next();
		this.setStorage(Storage);
	}
	public void setCapacity(Scanner input) {
		System.out.print("Capacity : ");
		String Capacity = input.next();
		this.setCapacity(Capacity);
	}
	
	public String getTypeFood() {
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
		return ftype;
	
	} 
}
