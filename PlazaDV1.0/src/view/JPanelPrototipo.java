package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class JPanelPrototipo extends JPanel {

	private JPanel jPanelCentroContenedor, jPanelDerechoContenedor,jPanelPrecios, jPanelTitle;
	private JLabel jLabel, jLabel2, jLabel3, jLabel4;

	private ImageIcon imageIcon;
	private Icon icon;

	public JPanelPrototipo(String name, int precio, int porcentaje, String url) {

		jPanelCentroContenedor = new JPanel();
		jPanelDerechoContenedor = new JPanel();
		jPanelPrecios = new JPanel();
		jPanelTitle = new JPanel();

		init(name, precio, porcentaje, url);
	}

	private void init(String name, int precio, int porcentaje, String url) {

		this.setLayout(new BorderLayout());
//		this.setSize(Toolkit.getDefaultToolkit().getScreenSize());
		this.setBackground(Color.GREEN);
		this.setPreferredSize(new Dimension(600, 300));

		jPanelCentroContenedor.setBackground(new Color(59, 232, 183));
		jPanelCentroContenedor.setPreferredSize(new Dimension(300, 300));
		jPanelCentroContenedor.add(jlabelImage(url, 200, 200, 0));

		jPanelDerechoContenedor.setBackground(Color.BLUE);
		jPanelDerechoContenedor.setLayout(new BorderLayout());
		jPanelDerechoContenedor.setPreferredSize(new Dimension(300, 300));
		
		jPanelTitle.setBackground(new Color(78, 255, 155));
		jPanelTitle.setPreferredSize(new Dimension(100, 100));
		
		jPanelPrecios.setBackground(new Color(78, 255, 155));
		jPanelPrecios.setPreferredSize(new Dimension(100, 100));

		jPanelDerechoContenedor.add(jPanelPrecios,BorderLayout.CENTER);
		jPanelDerechoContenedor.add(jPanelTitle,BorderLayout.NORTH);

		
		jLabel2 = new JLabel(name);
		jLabel2.setForeground(Color.WHITE);
		jLabel2.setFont(new Font("Arial", 1, 30));
		jLabel2.setBorder(BorderFactory.createEmptyBorder(30, 0, 0, 0));
		jPanelTitle.add(jLabel2);
		
		jLabel3 = new JLabel("$"+precio);
		jLabel3.setForeground(Color.WHITE);
		jLabel3.setFont(new Font("Arial", 1, 30));
		jLabel3.setBorder(BorderFactory.createEmptyBorder(50, 0, 0, 60));
		jPanelPrecios.add(jLabel3);
		
		jLabel4 = new JLabel(""+porcentaje+"%");
		jLabel4.setForeground(Color.WHITE);
		jLabel4.setFont(new Font("Arial", 1, 30));
		jLabel4.setBorder(BorderFactory.createEmptyBorder(50, 0, 0, 0));
		jPanelPrecios.add(jLabel4);



		this.add(jPanelCentroContenedor, BorderLayout.CENTER);
		this.add(jPanelDerechoContenedor, BorderLayout.EAST);

	}
	
	
	public JLabel jlabelImage(String url, int x, int y, int optional) {
		jLabel = new JLabel();
		jLabel.setBorder(BorderFactory.createEmptyBorder(25, optional, 0, 0));
		imageIcon = new ImageIcon(getClass().getResource(url));
		icon = new ImageIcon(imageIcon.getImage().getScaledInstance(x, y, Image.SCALE_AREA_AVERAGING));
		jLabel.setIcon(icon);
		this.add(jLabel);
		return jLabel;

	}

}
