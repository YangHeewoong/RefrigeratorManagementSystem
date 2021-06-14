package listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import javax.swing.JTextField;

import Food.FoodInput;
import Food.FoodType;
import Food.Fruit;
import exception.FoodShelflifeException;
import manager.RefrigeratorManager;

public class FoodAdderListener implements ActionListener {

	JTextField fieldName;
	JTextField fieldNumber;
	JTextField fieldShelflife;
	JTextField fieldStorage;
	JTextField fieldCapacity;
	
	RefrigeratorManager refrigeratormanager;
	
	public FoodAdderListener(
			JTextField fieldName,
			JTextField fieldNumber,
			JTextField fieldShelflife,
			JTextField fieldStorage,
			JTextField fieldCapacity, 
			RefrigeratorManager refrigeratormanager) {

		this.fieldName = fieldName;
		this.fieldNumber = fieldNumber;
		this.fieldShelflife = fieldShelflife;
		this.fieldStorage = fieldStorage;
		this.fieldCapacity = fieldCapacity;
		this.refrigeratormanager = refrigeratormanager;
	}

	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		FoodInput food = new Fruit(FoodType.Fruit);

		try {
			food.setFood(fieldName.getText());
			food.setNumber(Integer.parseInt(fieldNumber.getText()));		
			food.setShelflife(fieldShelflife.getText());
			food.setStorage(fieldStorage.getText());
			food.setCapacity(fieldCapacity.getText());
	
			refrigeratormanager.addFood(food);		
			putObject(refrigeratormanager, "refrigeratormanager.ser");	
			food.printinfo();
			
		} catch (FoodShelflifeException e1) {
			e1.printStackTrace();
		}
		
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

