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
	private JPanelPrototipo jPanelPrototipo;

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
		this.setPreferredSize(new Dimension(700, 200));

		
//		jButton.setBackground(Color.ORANGE);
//		jButton.setFont(new Font("Nunito Sans", 1, 20));
//		jButton.setForeground(Color.WHITE);
		jButton2 = new JButton("Productos en Descuento");
		jButton3 = new JButton("Productos Mas Costosos");
		jButton4 = new JButton("Productos en Promocion");
		jButton5 = new JButton("Productos en Descuento");
		jButton6 = new JButton("Productos Mas Costosos");
		jButton7 = new JButton("Productos en Promocion");
		jButton8 = new JButton("Productos en Descuento");
		jButton9 = new JButton("Productos Mas Costosos");
		jButton10 = new JButton("Productos en Promocion");
		
		



		this.add(jPanelPrototipo = new JPanelPrototipo("Mango", 2500, 10, "/images/mango.jpg"));
		this.add(jPanelPrototipo = new JPanelPrototipo("Papa", 2500, 10, "/images/papa.jpg"));
		this.add(jPanelPrototipo = new JPanelPrototipo("Banano", 2500, 10, "/images/banano.jpg"));
		this.add(jPanelPrototipo = new JPanelPrototipo("Cebolla Larga", 2500, 10, "/images/cebollaL.jpg"));
		this.add(jPanelPrototipo = new JPanelPrototipo("Coco", 2500, 10, "/images/coco.jpg"));
		this.add(jPanelPrototipo = new JPanelPrototipo("Manzana", 2500, 10, "/images/manzana.jpg"));
		this.add(jPanelPrototipo = new JPanelPrototipo("Piña", 2500, 10, "/images/piña.jpg"));
		this.add(jPanelPrototipo = new JPanelPrototipo("Remolacha", 2500, 10, "/images/remolacha.jpg"));
		this.add(jPanelPrototipo = new JPanelPrototipo("Sandia", 2500, 10, "/images/sandia.jpg"));
		this.add(jPanelPrototipo = new JPanelPrototipo("Zanahoria", 2500, 10, "/images/zanahoria.jpg"));

	}

}
