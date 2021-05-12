package Food;

import java.util.Scanner;

public class Meat extends Refrigerator { //Meat 갯수 대신 무게(단위 :g) 저장
	
	public Meat(FoodType type) {
		super(type);
	}
	
	public void getUserInput(Scanner input) {
		setFoodName(input);
				
		System.out.print("Weight of Food(g) : ");
		int number = input.nextInt();
		this.setNumber(number);
			
		setFoodShelfLife(input);
		
		setFoodStorage(input);		
				
	}	
	
	public void printinfo() {
		String ftype = getTypeFood();
		System.out.println("Type : " + ftype + "\n" +
				           "Food :" + this.Food+ "\n" + 
						   "Weight(g) : " + this.number + "\n" +  // In Meat class, Using weight instead of number
				           "Shelflife : " + this.Shelflife + "\n" +
			 	           "Storage : " + this.Storage + "\n");
		
	}
	

}
