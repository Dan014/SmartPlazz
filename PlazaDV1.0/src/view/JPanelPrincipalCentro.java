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

public class JPanelPrincipalCentro extends JPanel {

	private JPanel jPanelCenter, jPanelDerecha, jPanelIzquierda, jPanelNorte;
	private JPanelPrincipalCentroInfo jPanelPrincipalCentroInfo;
	ImageIcon imageIcon;
	Icon icon;

	public JPanelPrincipalCentro() {
		this.jPanelPrincipalCentroInfo = new JPanelPrincipalCentroInfo();
		this.jPanelCenter = new JPanel();
		this.jPanelDerecha = new JPanel();
		this.jPanelIzquierda = new JPanel();
		this.jPanelNorte = new JPanel();

		init();
	}

	private void init() {

		this.setLayout(new BorderLayout());
		this.setSize(Toolkit.getDefaultToolkit().getScreenSize());
		this.setPreferredSize(new Dimension(700,900));

		jPanelCenter.setBackground(Color.CYAN);

		jPanelDerecha.setBackground(Color.BLUE);
		jPanelDerecha.setPreferredSize(new Dimension(100, 100));

		jPanelIzquierda.setBackground(Color.GREEN);
		jPanelIzquierda.setPreferredSize(new Dimension(100, 100));

		jPanelNorte.setBackground(Color.LIGHT_GRAY);
		jPanelNorte.setPreferredSize(new Dimension(100, 100));

		this.add(jPanelNorte, BorderLayout.NORTH);
		this.add(jPanelPrincipalCentroInfo, BorderLayout.CENTER);
		this.add(jPanelDerecha, BorderLayout.WEST);
		this.add(jPanelIzquierda, BorderLayout.EAST);
	}

}
