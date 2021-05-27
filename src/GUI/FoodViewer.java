package GUI;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class FoodViewer extends JFrame {
	
	public FoodViewer() {
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("Food Name");
		model.addColumn("Food Number");
		model.addColumn("Shelf life");
		model.addColumn("Storage Place");
		model.addColumn("Capacity");
		
		
		JTable table = new JTable(model);
		JScrollPane sp = new JScrollPane(table);
		
		this.add(sp);	
		this.setSize(300, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
}
