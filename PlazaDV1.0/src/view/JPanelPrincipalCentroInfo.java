package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JPanel;

public class JPanelPrincipalCentroInfo extends JPanel {
	private JButton jButton, jButton2, jButton3, jButton4, jButton5, jButton6, jButton7, jButton8, jButton9, jButton10;
	private JPanel jPanelDerecha, jPanelIzquierda;

	ImageIcon imageIcon;
	Icon icon;

	public JPanelPrincipalCentroInfo() {
		this.jPanelDerecha = new JPanel();
		this.jPanelIzquierda = new JPanel();

		// this.jPanelCenter = new JPanelPrincipalCentro();
	
		init();
	}

	private void init() {
		this.setLayout(new GridLayout(5, 2, 50, 30));
		this.setPreferredSize(new Dimension(500, 700));

		jButton = new JButton("Productos Del Dia");
		jButton.setBackground(Color.ORANGE);
		jButton.setFont(new Font("Nunito Sans", 1, 20));
		jButton.setForeground(Color.WHITE);
		jButton2 = new JButton("Productos en Descuento");
		jButton3 = new JButton("Productos Mas Costosos");
		jButton4 = new JButton("Productos en Promocion");
		jButton5 = new JButton("Productos en Descuento");
		jButton6 = new JButton("Productos Mas Costosos");
		jButton7 = new JButton("Productos en Promocion");
		jButton8 = new JButton("Productos en Descuento");
		jButton9 = new JButton("Productos Mas Costosos");
		jButton10 = new JButton("Productos en Promocion");
		
		



		this.add(jButton);
		this.add(jButton2);
		this.add(jButton3);
		this.add(jButton4);
		this.add(jButton5);
		this.add(jButton6);
		this.add(jButton7);
		this.add(jButton8);
		this.add(jButton9);
		this.add(jButton10);
	}

}
