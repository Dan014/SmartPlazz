package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import javax.swing.BoxLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import general.HandlerLanguage;

public class JTableAuto extends JPanel {

	private static final long serialVersionUID = 1L;
	private DefaultTableModel dtmElements;
	private JTable jtElements;
	private JScrollPane jsTable;

	public JTableAuto() {
		initComponents();
		setVisible(true);
	}

	private void initComponents() {
		this.setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
		this.setBackground(Color.decode("#30373D"));

		dtmElements = new DefaultTableModel();
		changeLanguageColunmJtable();

		Font fontHeader = new Font("Franklin Gothic Demi", Font.ITALIC, 14);

		jtElements = new JTable();
		jtElements.setModel(dtmElements);
		jtElements.getTableHeader().setReorderingAllowed(false);
		jtElements.getTableHeader().setBackground(Color.decode("#282E33"));
		jtElements.getTableHeader().setForeground(Color.white);
		jtElements.getTableHeader().setFont(fontHeader);
		jtElements.setBackground(Color.white);
		jtElements.setFillsViewportHeight(true);
		jtElements.setBorder(null);

		jsTable = new JScrollPane(jtElements);
		jsTable.setForeground(Color.white);
		jsTable.setBorder(null);
		jsTable.setAlignmentX(Component.LEFT_ALIGNMENT);
		this.add(jsTable, BorderLayout.PAGE_END);
		this.setBorder(null);
	}

	public void changeLanguageColunmJtable() {
		String[] headers = { HandlerLanguage.languageProperties.getProperty(ConstantsUI.T_DATE),
				HandlerLanguage.languageProperties.getProperty(ConstantsUI.T_KILOS),
				HandlerLanguage.languageProperties.getProperty(ConstantsUI.T_PRICE),
				HandlerLanguage.languageProperties.getProperty(ConstantsUI.T_NAMEPRODUCTPLAZZ),
				HandlerLanguage.languageProperties.getProperty(ConstantsUI.T_TYPEPRODUCT),
				HandlerLanguage.languageProperties.getProperty(ConstantsUI.T_DATE),};
		dtmElements.setColumnIdentifiers(headers);
		repaint();
	}

	public void addElementToTable(Object[] vector) {
		dtmElements.addRow(vector);
	}

	public void deleteElementToTable() {
		int fsel;
		int resp;
		try {
			fsel = jtElements.getSelectedRow();
			if (fsel == -1) {
				JOptionPane.showMessageDialog(null, "Debe seleccionar una casilla");
			} else {
				resp = JOptionPane.showConfirmDialog(null, "ESTA SEGURO DE QUE DESEA SALIR");
				if (resp == JOptionPane.YES_OPTION) {
					dtmElements.removeRow(jtElements.getSelectedRow());
				}

			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
