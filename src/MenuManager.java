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
				System.out.print("Type of Food : ");
				String Food_Type = input.next();
				
				System.out.print("Number of Food : ");
				int Number_of_Food = input.nextInt();
				
				System.out.print("Shelf life : ");
				String Shelf_life = input.next();
				
				System.out.print("Storage Place : "); //띄어쓰기 X, 띄어쓰기 할시 오류O
				String Storage_Place = input.next();
				break;
				
			case 2 :
				System.out.print("");
				
			case 3 :
				
			case 4 :
				System.out.print("Type of Food : ");
				String View_Food = input.next();
				break;
			case 5 :	
			
			}
													
		}
	}

}
