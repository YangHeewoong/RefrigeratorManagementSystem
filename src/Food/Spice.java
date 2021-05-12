package Food;

import java.util.Scanner;

public class Spice extends Refrigerator {  //Spice의 용량(단위 :ml, L)추가
    
	protected String capacity;
	
	public Spice(FoodType type) {
		super(type);
	}
	
	public void getUserInput(Scanner input) {
		setFoodName(input);
		
		setFoodNumber(input);
		
		setCapacity(input);
		
		setFoodShelfLife(input);
		
		setFoodStorage(input);	
	}
	
	public void printinfo() {
		String ftype = getTypeFood();
		System.out.println("Type : " + ftype + "\n" +
				           "Food :" + this.Food+ "\n" + 
						   "number : " + this.number + "\n" +
				           "Capacity : " + this.Capacity + "\n" +
						   "Shelflife : " + this.Shelflife + "\n" +
			 	           "Storage : " + this.Storage + "\n");
	}
}
