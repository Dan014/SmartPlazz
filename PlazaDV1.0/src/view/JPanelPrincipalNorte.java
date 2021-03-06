package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;

import controller.Control;


public class JPanelPrincipalNorte extends JPanel {

	private JPanel jPanelNorteMenuSup, jPanelCentroContenedor, jPanelDerechaContenedor, jPanelWhiteCenter,
			jPanelWhiteMenu;
	private JButton jButtonLogin, jButtonCreate;
	
	private JPanelMenuPrincipal jPanelMenuPrincipal;
	private JPanelPrototipo jPanelPrototipo;

	ImageIcon imageIcon;
	Icon icon;

	public JPanelPrincipalNorte(Control controllerApp) {
		this.jPanelMenuPrincipal =new JPanelMenuPrincipal();
		this.jPanelPrototipo = new JPanelPrototipo("Fresa", 10, 21, "/images/fresa.jpg");
		this.jPanelNorteMenuSup = new JPanel();
		this.jPanelCentroContenedor = new JPanel();
		this.jPanelDerechaContenedor = new JPanel();
		this.jPanelWhiteCenter = new JPanel();
		this.jPanelWhiteMenu = new JPanel();
		
		jButtonCreate = new JButton("LOGIN");
		jButtonCreate.setActionCommand(controller.Commands.C_LOGIN.name());
		jButtonCreate.addActionListener(controllerApp);
		
		
		jButtonLogin = new JButton("CREAR");
		jButtonLogin.setActionCommand(controller.Commands.C_CREATE_PEOPLE.name());
		jButtonLogin.addActionListener(controllerApp);

		init();
	}

	private void init() {

		this.setLayout(new BorderLayout());
		this.setSize(Toolkit.getDefaultToolkit().getScreenSize());
		this.setPreferredSize(new Dimension(0, 450));
		this.setBackground(Color.BLUE);

		jPanelNorteMenuSup.setBackground(new Color(59, 232, 183));
		jPanelNorteMenuSup.setPreferredSize(new Dimension(0, 100));
		jPanelNorteMenuSup.add(jButtonCreate);
		jPanelNorteMenuSup.add(jButtonLogin);


		jPanelCentroContenedor.setBackground(Color.WHITE);
		jPanelCentroContenedor.setPreferredSize(new Dimension(700, 0));

//		jPanelWhiteCenter.setBackground(Color.WHITE);
//		jPanelWhiteCenter.setPreferredSize(new Dimension(600, 300));
		jPanelWhiteCenter.add(jPanelPrototipo);

//		jPanelWhiteMenu.setBackground(Color.WHITE);
//		jPanelWhiteMenu.setPreferredSize(new Dimension(350, 300));

		jPanelDerechaContenedor.setBackground(Color.WHITE);
		jPanelDerechaContenedor.setPreferredSize(new Dimension(500, 0));

		jPanelCentroContenedor.add(jPanelWhiteCenter, BorderLayout.CENTER);
		jPanelDerechaContenedor.add(jPanelMenuPrincipal, BorderLayout.CENTER);
		this.add(jPanelNorteMenuSup, BorderLayout.NORTH);
		this.add(jPanelCentroContenedor, BorderLayout.CENTER);
		this.add(jPanelDerechaContenedor, BorderLayout.EAST);
	}

}
