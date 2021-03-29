import java.util.Scanner;

public class MenuManager {

	public static void main(String[] args) {
		int num = 0;
		Scanner input = new Scanner(System.in);
		
		
			while (num != 6) {
			System.out.println("Refrigerator Management System Menu");
			System.out.println("1. Add Food");
			System.out.println("2. Delete Food");
			System.out.println("3. Edit Food");
			System.out.println("4. View Food");
			System.out.println("5. Show a menu");
			System.out.println("6. Exit");
			System.out.println("Select one number between 1-6");
			
			num = input.nextInt();
			
			switch(num) 
			{
			case 1 :
				addFood();
				break;
				
			case 2 :				
				deleteFood();
				break;
			
			case 3 :
				editFood();
				break;
				
			case 4 :
				
			case 5 :	
			
			}
													
		}
	}
	public static void addFood() {
		Scanner input = new Scanner(System.in);
		System.out.print("Type of Food : "); 
		String Food = input.next();
		
		System.out.print("Number of Food : ");
		int Number = input.nextInt();
		
		System.out.print("Shelf life : ");
		String Shelflife = input.next();
		
		System.out.print("Storage Place : "); 
		String Storage = input.next();
	}
	public static void deleteFood() {
		System.out.println("Input what you want to delete food type");
		Scanner input = new Scanner(System.in);
		
		System.out.print("Type of Food : ");
		String Delete_Food = input.next();
	}
	public static void editFood() {
		System.out.println("Input what you want to Edit");
		Scanner input = new Scanner(System.in);
		
		System.out.print("Type of Food  : "); 
		String Edit_Food = input.next();
		
		System.out.print("Number of Food : ");
		int Edit_Number = input.nextInt();
		
		System.out.print("Shelf life : ");
		String Edit_Shelflife = input.next();
		
		System.out.print("Storage Place : "); 
		String Edit_Storage = input.next();
	}

}
