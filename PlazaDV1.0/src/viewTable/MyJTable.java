package viewTable;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.util.ArrayList;

import javax.swing.BoxLayout;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import models.ProductPlazz;

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
		String[] headers = { "Tipo ", "Nombre", "Precio", "Cantidad", "Fecha"};
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
        
        public void fillTable(ArrayList<ProductPlazz> bookingList) {
        
	defaultTableModel.setRowCount(0);
	for (ProductPlazz reserve : bookingList) {
		defaultTableModel.addRow(new Object[] {reserve.getTypeprod(),reserve.getNameProductPlazz(),reserve.getPriceProd(), reserve.getKilosProd(), reserve.getDateSell().toString()});
	}
	repaint();
        revalidate();
    }
	
    public int getSelectedId() {
	return (int)defaultTableModel.getValueAt(jTable.getSelectedRow(), 0);
    }

	public void addElementtoTable(Object[] vector) {
		defaultTableModel.addRow(vector);
	}

}
