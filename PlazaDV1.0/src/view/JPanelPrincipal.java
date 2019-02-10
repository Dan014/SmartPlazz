package view;

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
	//cambie JPanelPrincipalCentroInfo  por solo el principal para hacerle los marcos y el norte
	private JPanelPrincipalCentro jPanelCenter;
	private JPanelPrincipalNorte jPanelPrincipalNorte;

	ImageIcon imageIcon;
	Icon icon;

	public JPanelPrincipal(Control control) {
		this.jPanelCenter = new JPanelPrincipalCentro();
		this.jPanelPrincipalNorte = new JPanelPrincipalNorte(control);

		init();
	}


	private void init() {

		this.setLayout(new BorderLayout());
		this.setSize(Toolkit.getDefaultToolkit().getScreenSize());
		this.setBackground(Color.RED);

		this.add(jPanelPrincipalNorte, BorderLayout.NORTH);
		this.add(jPanelCenter, BorderLayout.CENTER);
//		this.add(jPanelSouth, BorderLayout.SOUTH);
//		this.add(jPanelEasth, BorderLayout.EAST);
	}



}
