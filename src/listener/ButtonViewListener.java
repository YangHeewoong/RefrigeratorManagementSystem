package listener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import javax.swing.JButton;

import GUI.FoodViewer;
import GUI.WindowFrame;
import manager.RefrigeratorManager;

public class ButtonViewListener implements ActionListener {

	WindowFrame frame;

	public ButtonViewListener(WindowFrame frame) {
		this.frame = frame;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		FoodViewer foodviewer = frame.getFoodviewer();
		RefrigeratorManager refrigeratormanager = getObject("refrigeratermanager.ser");
		foodviewer.setRefrigeratormanager(refrigeratormanager);
		
		frame.getContentPane().removeAll(); 
		frame.getContentPane().add(foodviewer);
		frame.revalidate();
		frame.repaint();
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
}
