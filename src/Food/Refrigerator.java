package Food;

import java.util.Scanner;

public abstract class Refrigerator { //Refrigerator의 객체를 생성하지 않음
	
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
	
	
	public abstract void printinfo();
}
