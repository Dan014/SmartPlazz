package views;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;


import controller.CommandAction;
import controller.ProyectoListener;

public class JpanelLeftPantallaPrincipal extends JPanel {
	JButton jButton;
	ImageIcon imageIcon;
	Icon icon;

	public JpanelLeftPantallaPrincipal() {
		init();
	}

	private void init() {
		this.setLayout(new GridLayout(5, 1));
		setPreferredSize(new Dimension(300, 0));
		this.add(myJButton(controller.CommandAction.boton1));
		this.add(myJButton(controller.CommandAction.boton2));
		this.add(myJButton(controller.CommandAction.boton3));
		this.add(myJButton(controller.CommandAction.boton4));
		this.add(myJButton(controller.CommandAction.boton5));

	}

	private JButton myJButton(CommandAction commandAction) {
	
		jButton = new JButton(commandAction.getCommandName());
		jButton.setBounds(0, 0, 200, 200);
		jButton.addActionListener(ProyectoListener.getInstance());
		jButton.setActionCommand(commandAction.getCommandName());
		jButton.setBackground(new Color(2, 41, 48));
		jButton.setForeground(new Color(255, 255, 255));// blanco
		imageIcon = new ImageIcon(getClass().getResource(commandAction.getRutaImage()));
		icon = new ImageIcon(imageIcon.getImage().getScaledInstance(50, 50, Image.SCALE_AREA_AVERAGING));
		jButton.setIcon(icon);
		jButton.setToolTipText(commandAction.getToolTip());
		this.add(jButton);
		return jButton;
	}

}
