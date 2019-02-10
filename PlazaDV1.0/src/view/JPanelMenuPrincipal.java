package view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class JPanelMenuPrincipal extends JPanel {

	private static final long serialVersionUID = 1L;
	private JLabel jLabel;
	private JButton jButton, jButton2, jButton3, jButton4;
	private ImageIcon imageIcon;
	private ImageIcon icon;

	public JPanelMenuPrincipal() {

		init();
	}

	private void init() {
		this.setLayout(new GridLayout(4, 1, 0, 30));
		this.setPreferredSize(new Dimension(300, 300));

		jButton = new JButton("Productos Del Dia");
		jButton.setBackground(new Color(65, 255, 255));
		jButton.setFont(new Font("Nunito Sans", 1, 20));
		jButton.setForeground(Color.WHITE);

		jButton2 = new JButton("Productos en Descuento");
		jButton2.setBackground(new Color(59, 232, 183));
		jButton2.setFont(new Font("Nunito Sans", 1, 20));
		jButton2.setForeground(Color.WHITE);

		jButton3 = new JButton("Productos Mas Costosos");
		jButton3.setBackground(new Color(78, 255, 155));
		jButton3.setFont(new Font("Nunito Sans", 1, 20));
		jButton3.setForeground(Color.WHITE);

		jButton4 = new JButton("Productos en Promocion");
		jButton4.setBackground(new Color(59, 232, 85));
		jButton4.setFont(new Font("Nunito Sans", 1, 20));
		jButton4.setForeground(Color.WHITE);

		this.add(jButton);
		this.add(jButton2);
		this.add(jButton3);
		this.add(jButton4);
	}

}
