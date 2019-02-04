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

public class JPanelPrincipal extends JPanel {
	//cambie JPanelPrincipalCentroInfo  por solo el principal para hacerle los marcos y el norte
	private JPanelPrincipalCentro jPanelCenter;
	private JPanelPrincipalNorte jPanelPrincipalNorte;

	ImageIcon imageIcon;
	Icon icon;

	public JPanelPrincipal() {
		this.jPanelCenter = new JPanelPrincipalCentro();
		this.jPanelPrincipalNorte = new JPanelPrincipalNorte();

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

//	@Override
//	protected void paintComponent(Graphics g) {
//		imageIcon = new ImageIcon(getClass().getResource("/images/fondo.jpg"));
//		g.drawImage(imageIcon.getImage(), 0, 0, getWidth(), getHeight(), this);
//		setOpaque(false);
//		super.paintComponent(g);
//	}

}
