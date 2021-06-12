package Food;

import java.util.Scanner;

import exception.FoodShelflifeException;

public interface FoodInput {
	
	public String getFood();
	
	public void setFood(String food);
	
	public int getNumber();
	
	public void setNumber(int number);
	
	public String getShelflife();
	
	public void setShelflife(String shelflife) throws FoodShelflifeException; 
	
	public String getStorage();
	
	public void setStorage(String storage);
	
	public String getCapacity();
	
	public void setCapacity(String capacity);
	
	public void getUserInput(Scanner input);
	
	public void printinfo();
	
	public void setFoodName(Scanner input);
	
	public void setFoodNumber(Scanner input);
	
	public void setFoodShelfLife(Scanner input);
	
	public void setFoodStorage(Scanner input);
	
	public void setCapacity(Scanner input);
}
