package Food;

import java.util.Scanner;

public class SeaFood extends Refrigerator {

	public SeaFood (FoodType type) {
		super(type);
	}
	
	public void getUserInput(Scanner input) {		
		setFoodName(input);
		
		setFoodNumber(input);
		
		setFoodShelfLife(input);
		
		setFoodStorage(input);
	}
	
	public void printinfo() {
		String ftype = getTypeFood();
		System.out.println("Type : " + ftype + "\n" +
				           "Food :" + this.Food+ "\n" + 
						   "number : " + this.number + "\n" +
				           "Shelflife : " + this.Shelflife + "\n" +
			 	           "Storage : " + this.Storage + "\n");
		
	}	

}
