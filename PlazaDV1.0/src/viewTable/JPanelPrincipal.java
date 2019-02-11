package viewTable;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JPanel;

import controller.Control;

public class JPanelPrincipal extends JPanel {

	private JPanelPrincipalCentroVistaEmp jPanelPrincipalCentroVistaEmp;
	private JPanelPrincipalIzqVistaEmp jPanelPrincipalIzqVistaEmp;
	private MyJTable myJTable;
	ImageIcon imageIcon;
	Icon icon;

	public JPanelPrincipal(Control control) {
		this.jPanelPrincipalCentroVistaEmp = new JPanelPrincipalCentroVistaEmp();
		this.jPanelPrincipalIzqVistaEmp = new JPanelPrincipalIzqVistaEmp();
		this.myJTable = new MyJTable();
		init();
	}

	private void init() {

		this.setLayout(new BorderLayout());
		this.setSize(Toolkit.getDefaultToolkit().getScreenSize());
//		this.setBackground(Color.RED);
		
		jPanelPrincipalCentroVistaEmp.add(myJTable);
		this.add(jPanelPrincipalCentroVistaEmp, BorderLayout.CENTER);
		this.add(jPanelPrincipalIzqVistaEmp, BorderLayout.WEST);

	}

	public void addElementToTable(Object[] vectorElement) {
		myJTable.addElementtoTable(vectorElement);
	}

}
