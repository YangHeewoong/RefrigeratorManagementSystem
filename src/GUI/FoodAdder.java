package GUI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

public class FoodAdder extends JPanel {

	WindowFrame frame;
	
	public FoodAdder(WindowFrame frame) {
		this.frame = frame;
		
		JPanel panel = new JPanel(new SpringLayout());
		panel.setLayout(new SpringLayout()); 
		
		JLabel labelName = new JLabel("Food Name : ", JLabel.TRAILING);
		JTextField fieldName = new JTextField(10);
		labelName.setLabelFor(fieldName);
		panel.add(labelName);
		panel.add(fieldName);
		
		JLabel labelNumber = new JLabel("Food Number : ", JLabel.TRAILING);
		JTextField fieldNumber = new JTextField(10);
		labelNumber.setLabelFor(fieldNumber);
		panel.add(labelNumber);
		panel.add(fieldNumber);
		
		JLabel labelShelflife = new JLabel("Shelf life : ", JLabel.TRAILING);
		JTextField fieldShelflife = new JTextField(10);
		labelShelflife.setLabelFor(fieldShelflife);
		panel.add(labelShelflife);
		panel.add(fieldShelflife);
		
		JLabel labelStorage = new JLabel("Storage Place : ", JLabel.TRAILING);
		JTextField fieldStorage = new JTextField(10);
		labelStorage.setLabelFor(fieldStorage);
		panel.add(labelStorage);
		panel.add(fieldStorage);
		
		JLabel labelCapacity = new JLabel("Capacity : ", JLabel.TRAILING);
		JTextField fieldCapacity = new JTextField(10);
		labelCapacity.setLabelFor(fieldCapacity);
		panel.add(labelCapacity);
		panel.add(fieldCapacity);
		
		panel.add(new JButton("save"));
		panel.add(new JButton("cancel"));
		
		SpringUtilities.makeCompactGrid(panel, 6, 2, 6, 6, 6, 6);

		this.add(panel);
		this.setVisible(true);
	}
}
