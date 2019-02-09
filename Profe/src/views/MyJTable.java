package views;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.util.Vector;

import javax.swing.BoxLayout;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class MyJTable extends JPanel {

	private DefaultTableModel defaultTableModel;
	private JTable jTable;
	private JScrollPane jScrollPane;

	public MyJTable() {
		init();
		setVisible(true);
	}

	private void init() {
		this.setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
		String[] headers = { "Placa", "Modelo", "Marca", "Cilindraje", "Propietario", "Identificacion", "Fecha" };
		defaultTableModel = new DefaultTableModel();
		defaultTableModel.setColumnIdentifiers(headers);

		Font fontheader = new Font("Arial", Font.ITALIC, 14);

		jTable = new JTable();
		jTable.setModel(defaultTableModel);
		jTable.getTableHeader().setReorderingAllowed(false);
		jTable.getTableHeader().setBackground(Color.WHITE);
		jTable.getTableHeader().setFont(fontheader);
		jTable.setBackground(Color.WHITE);
		jTable.setFillsViewportHeight(true);
		jTable.setBorder(null);
	
		
		jScrollPane = new JScrollPane(jTable);
		jScrollPane.setForeground(Color.RED);
		jScrollPane.setBorder(null);
		jScrollPane.setAlignmentX(Component.LEFT_ALIGNMENT);
		this.add(jScrollPane, BorderLayout.CENTER);
		this.setBorder(null);

	}

	public void addElementtoTable(Object[] vector) {
		defaultTableModel.addRow(vector);
	}

}
