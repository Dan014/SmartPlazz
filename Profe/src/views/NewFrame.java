package views;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class NewFrame extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static final int WIDTH = 450;
	public static final int HEIGHT = 650;

	public NewFrame() {
		this.setTitle("Primera ventana");
		this.setSize(WIDTH, HEIGHT);
		this.setLocation(300, 0);
		this.getContentPane().setBackground(Color.white);
		setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
		initComponents();
		this.pack();
		this.setVisible(true);
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);

	}

	private void initComponents() {

		JPanelNorthForm jPanelNorth = new JPanelNorthForm();
		this.add(jPanelNorth);

		JPanelCenterForm jPanelCenter = new JPanelCenterForm();
		this.add(jPanelCenter);

		
	}

}
