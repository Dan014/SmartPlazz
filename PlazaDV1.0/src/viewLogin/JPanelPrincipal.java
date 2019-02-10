package viewLogin;

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
import javax.swing.JTextField;

public class JPanelPrincipal extends JPanel {

	private JPanel jPanelNorth, jPanelWest, jPanelEast, jPanelSout, jPanelCenter, jPanelCenterImage, jPanelCenterCampos;
	private JLabel jLabel;
	private JButton jButton;
	private JTextField jTextFieldName;

	ImageIcon imageIcon;
	Icon icon;

	public JPanelPrincipal() {
		jPanelCenter = new JPanel();
		jPanelCenter.setLayout(new BorderLayout());
		jPanelCenter.setBackground(new Color(59, 232, 183));
		jPanelCenter.setPreferredSize(new Dimension(400, 400));

		jPanelCenterImage = new JPanel();
		jPanelCenterImage.setBackground(new Color(59, 255, 255));
		jPanelCenterImage.setPreferredSize(new Dimension(100, 350));

		jPanelCenterCampos = new JPanel();
		jPanelCenterCampos.setBackground(new Color(59, 255, 255));
		jPanelCenterCampos.setPreferredSize(new Dimension(100, 100));

		jPanelNorth = new JPanel();
		jPanelNorth.setBackground(new Color(59, 232, 183));
		jPanelNorth.setPreferredSize(new Dimension(100, 100));

		jPanelWest = new JPanel();
		jPanelWest.setBackground(new Color(59, 232, 183));
		jPanelWest.setPreferredSize(new Dimension(400, 0));

		jPanelEast = new JPanel();
		jPanelEast.setBackground(new Color(59, 232, 183));
		jPanelEast.setPreferredSize(new Dimension(400, 0));

		jPanelSout = new JPanel();
		jPanelSout.setBackground(new Color(59, 232, 183));
		jPanelSout.setPreferredSize(new Dimension(100, 100));

		init();
	}

	private void init() {

		this.setLayout(new BorderLayout());
		this.setSize(Toolkit.getDefaultToolkit().getScreenSize());
		this.setBackground(Color.RED);

		jLabel = new JLabel();
		imageIcon = new ImageIcon(getClass().getResource("/images/user.png"));
		icon = new ImageIcon(imageIcon.getImage().getScaledInstance(300, 300, Image.SCALE_AREA_AVERAGING));
		jLabel.setIcon(icon);
		jPanelCenterImage.add(jLabel);

		jPanelCenterCampos.add(createJTextField("User", new Color(244, 244, 244), 400, 60));
		jPanelCenterCampos.add(createEspacio());
		jPanelCenterCampos.add(createJTextField("Contraseña", new Color(244, 244, 244), 400, 60));

		jPanelCenter.add(jPanelCenterCampos, BorderLayout.CENTER);
		jPanelCenter.add(jPanelCenterImage, BorderLayout.NORTH);
		jButton = new JButton("Crear usuario");
		jPanelSout.add(jButton);

		this.add(jPanelCenter, BorderLayout.CENTER);
		this.add(jPanelNorth, BorderLayout.NORTH);
		this.add(jPanelWest, BorderLayout.WEST);
		this.add(jPanelEast, BorderLayout.EAST);
		this.add(jPanelSout, BorderLayout.SOUTH);

	}

	public JTextField createJTextField(String name, Color color, int largo, int ancho) {
		jTextFieldName = new JTextField(name);
		jTextFieldName.setBackground(color);
		jTextFieldName.setPreferredSize(new Dimension(largo, ancho));
		this.add(jTextFieldName);
		return jTextFieldName;

	}

	public JLabel createEspacio() {
		jLabel = new JLabel();
		jLabel.setPreferredSize(new Dimension(0, 20));
		this.add(jLabel);
		return jLabel;

	}
}
