package views;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;

public class JPanelNorthForm extends JPanel {
	private JLabel jLabel, jLabel2, jLabel3, jLabel4;

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public JPanelNorthForm() {

		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

		this.setBorder(BorderFactory.createEmptyBorder(20, 80, 0, 80));
		setBackground(Color.white);
		this.initComponents();
		setVisible(true);

	}

	private void initComponents() {

		jLabel = new JLabel("¿Desea saber más sobre nuestros productos y ofertas de ");
		jLabel.setAlignmentX(CENTER_ALIGNMENT);
		jLabel.setBorder(BorderFactory.createEmptyBorder(10, 10, 0, 10));
		// jLText.setPreferredSize( new Dimension(180, 40));
		this.add(jLabel);
		
	

	}
}
