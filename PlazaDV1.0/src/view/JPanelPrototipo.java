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

	private JPanel jPanelCentroContenedor, jPanelDerechoContenedor;
	private JLabel jLabel, jLabel2, jLabel3, jLabel4;

	ImageIcon imageIcon;
	Icon icon;

	public JPanelPrototipo() {

		jPanelCentroContenedor = new JPanel();
		jPanelDerechoContenedor = new JPanel();

		init();
	}

	private void init() {

		this.setLayout(new BorderLayout());
		this.setSize(Toolkit.getDefaultToolkit().getScreenSize());
		this.setBackground(Color.GREEN);
		this.setPreferredSize(new Dimension(600, 300));

		jPanelCentroContenedor.setBackground(Color.YELLOW);
		jPanelCentroContenedor.setPreferredSize(new Dimension(300, 300));
		jPanelCentroContenedor.add(jlabelImage("/images/fresa.jpg", 200, 200, 0));

		jPanelDerechoContenedor.setBackground(Color.BLUE);
		jPanelDerechoContenedor.setPreferredSize(new Dimension(300, 300));
		jLabel2 = new JLabel("Fresa");
		jLabel2.setForeground(Color.WHITE);
		jLabel2.setFont(new Font("Arial", 1, 30));
		jLabel2.setBorder(BorderFactory.createEmptyBorder(25, 0, 0, 0));
		jPanelDerechoContenedor.add(jLabel2);


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
