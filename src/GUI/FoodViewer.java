package GUI;

import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import Food.FoodInput;
import manager.RefrigeratorManager;

public class FoodViewer extends JPanel {
	
	WindowFrame frame;
	
	RefrigeratorManager refrigeratormanager;
	
	public FoodViewer(WindowFrame frame,RefrigeratorManager refrigeratormanager) {		
		this.frame = frame;
		this.refrigeratormanager = refrigeratormanager;
		
		System.out.println("***" + refrigeratormanager.size() + "***");
		
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("Food Name");
		model.addColumn("Food Number");
		model.addColumn("Shelf life");
		model.addColumn("Storage Place");
		model.addColumn("Capacity");
		
		for(int i=0; i < refrigeratormanager.size(); i++) {
			Vector row = new Vector();
			FoodInput fi = refrigeratormanager.get(i);
			row.add(fi.getFood());
			row.add(fi.getNumber());
			row.add(fi.getShelflife());
			row.add(fi.getStorage());
			row.add(fi.getCapacity());
			model.addRow(row);
		}
		
		
		JTable table = new JTable(model);
		JScrollPane sp = new JScrollPane(table);
		
		this.add(sp);	
	}
}
