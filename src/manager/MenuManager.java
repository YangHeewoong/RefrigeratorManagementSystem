package manager;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.InputMismatchException;
import java.util.Scanner;

import GUI.WindowFrame;
import log.EventLogger;

public class MenuManager {
	static EventLogger logger = new EventLogger("log.txt");
	
	public static void main(String[] args) {	
			
		Scanner input = new Scanner(System.in);
		RefrigeratorManager refrigeratormanager = getObject("refrigeratormanager.ser");
		if(refrigeratormanager == null) {
			refrigeratormanager = new RefrigeratorManager(input);
		}
			
		
		WindowFrame frame = new WindowFrame(refrigeratormanager);
		selectMenu(input, refrigeratormanager);
		putObject(refrigeratormanager, "refrigeratormanager.ser");
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
				logger.log("Add a food");
				break;
				
			case 2 :				
				refrigeratormanager.deleteFood();
				logger.log("Delete a food");
				break;
			
			case 3 :
				refrigeratormanager.editFood();
				logger.log("Edit a food");
				break;
				
			case 4 :
				refrigeratormanager.viewFood();
				logger.log("View a list of food");
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
	
	public static RefrigeratorManager getObject (String filename) {
		RefrigeratorManager refrigeratormanager = null;
		
		
		
		try {
			FileInputStream file = new FileInputStream(filename);
			ObjectInputStream in = new ObjectInputStream(file);
			
			refrigeratormanager = (RefrigeratorManager)in.readObject();
			
			in.close();
			file.close();	
			
		} catch (FileNotFoundException e) {
			return refrigeratormanager;
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}	
		return refrigeratormanager;		
	}
	
	public static void putObject (RefrigeratorManager refrigeratormanager, String filename) {
		try {
			FileOutputStream file = new FileOutputStream(filename);
			ObjectOutputStream out = new ObjectOutputStream(file);
			
			out.writeObject(refrigeratormanager);
			
			out.close();
			file.close();	
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}
}
