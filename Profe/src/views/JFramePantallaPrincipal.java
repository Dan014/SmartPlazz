package views;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JTable;

import controller.ProyectoListener;



public class JFramePantallaPrincipal extends JFrame  {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JpanelNortePantallaPrincipal jpanelNorte;
	private JpanelLeftPantallaPrincipal jpanelLeft;
	private JMeuBarPantallaPrincipal jMeuBarPantallaPrincipal;
	private MyJTable myJTable;
	
	public JFramePantallaPrincipal() {
		super(Constant.APP_NAME);
		this.jpanelNorte =  new JpanelNortePantallaPrincipal();
		this.jpanelLeft =  new JpanelLeftPantallaPrincipal();
		this.myJTable = new MyJTable();
		this.jMeuBarPantallaPrincipal =  new JMeuBarPantallaPrincipal();
		init();

	}

	private void init() {

		this.setResizable(true);
		this.setSize(Toolkit.getDefaultToolkit().getScreenSize());
//		jpanelCenter.setBackground(Color.RED);
		
		
		
		this.setJMenuBar(jMeuBarPantallaPrincipal);
		this.add(jpanelNorte, BorderLayout.NORTH);
		this.add(myJTable, BorderLayout.CENTER);
		this.add(jpanelLeft, BorderLayout.WEST);
		this.setVisible(true);
	}

	public void addElementToTable(Object[] vectorElement) {
		myJTable.addElementtoTable(vectorElement);
	}

	
	public void createCostFrame(JPanelCenterForm jPanelCenterForm) {
		
	}
}
