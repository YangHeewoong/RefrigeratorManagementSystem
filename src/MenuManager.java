import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuManager {

	public static void main(String[] args) {	
		Scanner input = new Scanner(System.in);
		RefrigeratorManager refrigeratormanager = new RefrigeratorManager(input);
		
		selectMenu(input, refrigeratormanager);
	}
	public static void selectMenu(Scanner input, RefrigeratorManager refrigeratormanager) {
		int num = 0;
		while (num != 5) {
			try {
			showMenu();
			num = input.nextInt();
			
			switch(num) 
			{
			case 1 :
				refrigeratormanager.addFood();
				break;
				
			case 2 :				
				refrigeratormanager.deleteFood();
				break;
			
			case 3 :
				refrigeratormanager.editFood();
				break;
				
			case 4 :
				refrigeratormanager.viewFood();
				break;
				
			default :
				continue;
				
				}									
			}
			catch(InputMismatchException e) {
				System.out.println("Error! Input integer between 1 and 5");
				if (input.hasNext()) {
					input.next();
				}
				num = -1;
			}
		}
	}
	
	public static void showMenu() {
		System.out.println("\n<Refrigerator Management System Menu>");
		System.out.println("1. Add Food");
		System.out.println("2. Delete Food");
		System.out.println("3. Edit Food");
		System.out.println("4. View Foods");
		System.out.println("5. Exit");
		System.out.println("Select one number between 1-5");		
	}
}
