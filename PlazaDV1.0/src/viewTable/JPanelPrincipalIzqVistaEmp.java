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
import javax.swing.JLabel;
import javax.swing.JPanel;

public class JPanelPrincipalIzqVistaEmp extends JPanel {

	JPanel jPanelImage, jPanelinfo;
	JLabel jLabel;

	ImageIcon imageIcon;
	Icon icon;

	public JPanelPrincipalIzqVistaEmp() {

		jPanelImage = new JPanel();
		jPanelImage.setBackground(new Color(59, 232, 183));
		jPanelImage.setPreferredSize(new Dimension(400, 300));
		
		jLabel = new JLabel();
		imageIcon = new ImageIcon(getClass().getResource("/images/hombre.png"));
		icon = new ImageIcon(imageIcon.getImage().getScaledInstance(250, 250, Image.SCALE_AREA_AVERAGING));
		jLabel.setIcon(icon);
		jPanelImage.add(jLabel);
		
		jPanelinfo = new JPanel();
		jPanelinfo.setBackground(new Color(59, 232, 89));;
		jPanelinfo.setPreferredSize(new Dimension(400, 100));



		init();
	}

	private void init() {

		this.setLayout(new BorderLayout());
		this.setSize(Toolkit.getDefaultToolkit().getScreenSize());
		this.setBackground(new Color(59, 232, 183));
		this.setPreferredSize(new Dimension(400, 100));

		 this.add(jPanelImage, BorderLayout.NORTH);
		 this.add(jPanelinfo, BorderLayout.CENTER);
		
	}



}
