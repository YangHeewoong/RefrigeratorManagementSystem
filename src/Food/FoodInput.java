package Food;

import java.util.Scanner;

public interface FoodInput {
	
	public String getFood();
	
	public void setFood(String food);
	
	public void setNumber(int number);
	
	public void setShelflife(String shelflife);
	
	public void setStorage(String storage);
	
	public void setCapacity(String capacity);
	
	public void getUserInput(Scanner input);
	
	public void printinfo();
}
