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

	private JPanelPrototipo jPanelPrototipo;

	ImageIcon imageIcon;
	Icon icon;

	public JPanelPrincipalCentroInfo() {
		init();
	}

	private void init() {
		this.setLayout(new GridLayout(5, 2, 50, 30));
		this.setPreferredSize(new Dimension(700, 200));

		this.add(jPanelPrototipo = new JPanelPrototipo("Mango", 2500, 10, "/images/mango.jpg"));
		this.add(jPanelPrototipo = new JPanelPrototipo("Papa", 700, 11, "/images/papa.jpg"));
		this.add(jPanelPrototipo = new JPanelPrototipo("Banano", 1200, 12, "/images/banano.jpg"));
		this.add(jPanelPrototipo = new JPanelPrototipo("Cebolla Larga", 1300, 4, "/images/cebollaL.jpg"));
		this.add(jPanelPrototipo = new JPanelPrototipo("Coco", 3000, 5, "/images/coco.jpg"));
		this.add(jPanelPrototipo = new JPanelPrototipo("Manzana", 1700, 15, "/images/manzana.jpg"));
		this.add(jPanelPrototipo = new JPanelPrototipo("Pina", 2500, 2, "/images/piña.jpg"));
		this.add(jPanelPrototipo = new JPanelPrototipo("Remolacha", 1400, 6, "/images/remolacha.jpg"));
		this.add(jPanelPrototipo = new JPanelPrototipo("Sandia", 3200, 12, "/images/sandia.jpg"));
		this.add(jPanelPrototipo = new JPanelPrototipo("Zanahoria", 1200, 7, "/images/zanahoria.jpg"));

	}

}
