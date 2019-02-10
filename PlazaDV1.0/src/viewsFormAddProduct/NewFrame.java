package viewsFormAddProduct;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontMetrics;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class NewFrame extends JFrame {


	private static final long serialVersionUID = 1L;
	public NewFrame() {
		this.setTitle("Primera ventana");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocation(300, 50);
		this.setIconImage(new ImageIcon(getClass().getResource("/images/iconWindow.png")).getImage());
		this.getContentPane().setBackground(Color.white);
		setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
		initComponents();
		this.pack();
		this.setVisible(true);
	}

	private void initComponents() {

		JPanelNorthForm jPanelNorth = new JPanelNorthForm();
		this.add(jPanelNorth);

		JPanelCenterForm jPanelCenter = new JPanelCenterForm();
		this.add(jPanelCenter);

		JPanelSouth jPanelSouth = new JPanelSouth();
		this.add(jPanelSouth);

	}

}
