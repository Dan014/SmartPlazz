package viewsFormAddProduct;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Toolkit;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import controller.Control;

public class JPanelPrincipal extends JPanel {


	private static final long serialVersionUID = 1L;
	public JPanelPrincipal() {
		this.setSize(700, 600);
		this.setBackground(Color.white);
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		initComponents();
	}

	private void initComponents() {
		

		this.setSize(Toolkit.getDefaultToolkit().getScreenSize());
		
		JPanelNorthForm jPanelNorth = new JPanelNorthForm();
		this.add(jPanelNorth);
//
		JPanelCenterForm jPanelCenter = new JPanelCenterForm();
		this.add(jPanelCenter);

		JPanelSouth jPanelSouth = new JPanelSouth();
		this.add(jPanelSouth);

	}

}
