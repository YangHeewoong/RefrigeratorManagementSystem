package listener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import GUI.FoodAdder;
import GUI.FoodViewer;
import GUI.WindowFrame;

public class FoodAdderCancelListener implements ActionListener {

	WindowFrame frame;
	
	public FoodAdderCancelListener(WindowFrame frame) {
		this.frame = frame;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
//		JButton b = (JButton) e.getSource();
//		FoodAdder adder = frame.getFoodadder();
//		frame.setupPanel(adder);
		
		frame.getContentPane().removeAll(); 
		frame.getContentPane().add(frame.getMenuselection());
		frame.revalidate();
		frame.repaint();
	}

}
