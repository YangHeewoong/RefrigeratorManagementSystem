import java.util.Scanner;

public class RefrigeratorManager {
	Refrigerator refrigerator;
	Scanner input;
	
	RefrigeratorManager(Scanner input) {
		this.input = input;
	}
	
	public void addFood() {	
		refrigerator = new Refrigerator();
		System.out.print("Type of Food : "); 
		refrigerator.Food = input.next();
		
		System.out.print("Number of Food : ");
		refrigerator.number = input.nextInt();
		
		System.out.print("Shelf life : ");
		refrigerator.Shelflife = input.next();
		
		System.out.print("Storage Place : "); 
		refrigerator.Storage = input.next();
		
		System.out.println("Food is sucessfully registered!");
	}
	
	public void deleteFood() {
		System.out.println("Input what you want to delete food type");
		
		System.out.print("Type of Food : ");
		String Delete_Food = input.next();
		if (refrigerator == null) {
			System.out.println("Food has not been registered");
			return;
		}
		if (refrigerator.Food.equals(Delete_Food)) {
			refrigerator.Food = null;
			System.out.println("Food has been removed from refrigerator");
		}
	}
	
	public void editFood() {
		System.out.println("Input what you want to Edit");
		
		System.out.print("Type of Food  : "); 
		String Edit_Food = input.next();
		if (refrigerator.Food.equals(Edit_Food)) {
			System.out.println("The food to be edited is " + Edit_Food);
		}
		
		System.out.print("Number of Food : ");
		int Edit_Number = input.nextInt();
		if (refrigerator.number == Edit_Number) {
			System.out.println("The number of food to be edited is " + Edit_Number);
		}
		
		System.out.print("Shelf life : ");
		String Edit_Shelflife = input.next();
		if(refrigerator.Shelflife.equals(Edit_Shelflife)) {
			System.out.println("Shelf life to be edited is " + Edit_Shelflife);
		}
		
		System.out.print("Storage Place : "); 
		String Edit_Storage = input.next();
		if(refrigerator.Storage.equals(Edit_Storage)) {
			System.out.println("Storage to be edited is " + Edit_Storage);
		}
	}
	
	public void viewFood() {
		System.out.println("Food : ");
		String Food = input.next();
		if (refrigerator.Food.equals(Food)) {
			refrigerator.printinfo();
		}
	}
}
