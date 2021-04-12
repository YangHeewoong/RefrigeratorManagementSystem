package Food;

import java.util.Scanner;

public class Meat extends Refrigerator {
	
	public void getUserInput(Scanner input) {
		System.out.print("Food Name : "); 
		String Food = input.next();
		this.setFood(Food);
		
		System.out.print("Weight of Food(g): ");
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
