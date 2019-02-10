package viewTable;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JPanel;


public class JPanelPrincipalCentroVistaEmp extends JPanel {

	JPanel jPanelNorth;
	JButton jButton, jButton2, jButton3;
	ImageIcon imageIcon;
	Icon icon;

	public JPanelPrincipalCentroVistaEmp() {

		jPanelNorth = new JPanel();
		jPanelNorth.setBackground(new Color(59, 232, 183));
		jPanelNorth.setPreferredSize(new Dimension(100, 100));
		
		

		init();
	}

	private void init() {

		this.setLayout(new BorderLayout());
		this.setSize(Toolkit.getDefaultToolkit().getScreenSize());
		this.setBackground(Color.BLUE);
		this.setPreferredSize(new Dimension(800, 100));
		
		jPanelNorth.add(create("Ingresar Producto","/images/dieta.png"));
		jPanelNorth.add(create("Eliminar Producto","/images/basura.png"));
		jPanelNorth.add(create("Buscar Producto","/images/busqueda.png"));



		 this.add(jPanelNorth, BorderLayout.NORTH);
		
	}
	
	public JButton create(String name,String url) {
		jButton = new JButton(name);
		jButton.setBounds(0, 0, 200, 200);
//		jButton.setActionCommand(Commands.C_SHOW_NEW_COST.name());
//		jButton.addActionListener(controllerApp);
		jButton.setBackground(new Color(59, 232, 89));
		jButton.setForeground(new Color(255, 255, 255));// blanco
		imageIcon = new ImageIcon(getClass().getResource(url));
		icon = new ImageIcon(imageIcon.getImage().getScaledInstance(50, 50, Image.SCALE_AREA_AVERAGING));
		jButton.setIcon(icon);
		// jButton.setToolTipText(commandAction.getToolTip());
		this.add(jButton);
		return jButton;
		
	}

}
