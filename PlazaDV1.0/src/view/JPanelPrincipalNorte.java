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

public class JPanelPrincipalNorte extends JPanel {

	private JPanel jPanelNorteMenuSup, jPanelCentroContenedor, jPanelDerechaContenedor, jPanelWhiteCenter,
			jPanelWhiteMenu;
	
	private JPanelMenuPrincipal jPanelMenuPrincipal;
	private JPanelPrototipo jPanelPrototipo;

	ImageIcon imageIcon;
	Icon icon;

	public JPanelPrincipalNorte() {
		this.jPanelMenuPrincipal =new JPanelMenuPrincipal();
		this.jPanelPrototipo = new JPanelPrototipo();
		this.jPanelNorteMenuSup = new JPanel();
		this.jPanelCentroContenedor = new JPanel();
		this.jPanelDerechaContenedor = new JPanel();
		this.jPanelWhiteCenter = new JPanel();
		this.jPanelWhiteMenu = new JPanel();

		init();
	}

	private void init() {

		this.setLayout(new BorderLayout());
		this.setSize(Toolkit.getDefaultToolkit().getScreenSize());
		this.setPreferredSize(new Dimension(0, 450));
		this.setBackground(Color.BLUE);

		jPanelNorteMenuSup.setBackground(new Color(59, 232, 183));
		jPanelNorteMenuSup.setPreferredSize(new Dimension(0, 100));

		jPanelCentroContenedor.setBackground(new Color(59, 232, 85));
		jPanelCentroContenedor.setPreferredSize(new Dimension(700, 0));

//		jPanelWhiteCenter.setBackground(Color.WHITE);
//		jPanelWhiteCenter.setPreferredSize(new Dimension(600, 300));
		jPanelWhiteCenter.add(jPanelPrototipo);

//		jPanelWhiteMenu.setBackground(Color.WHITE);
//		jPanelWhiteMenu.setPreferredSize(new Dimension(350, 300));

		jPanelDerechaContenedor.setBackground(new Color(59, 232, 85));
		jPanelDerechaContenedor.setPreferredSize(new Dimension(500, 0));

		jPanelCentroContenedor.add(jPanelWhiteCenter, BorderLayout.CENTER);
		jPanelDerechaContenedor.add(jPanelMenuPrincipal, BorderLayout.CENTER);
		this.add(jPanelNorteMenuSup, BorderLayout.NORTH);
		this.add(jPanelCentroContenedor, BorderLayout.CENTER);
		this.add(jPanelDerechaContenedor, BorderLayout.EAST);
	}

}
