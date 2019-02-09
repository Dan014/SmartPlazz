package views;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class JpanelNortePantallaPrincipal extends JPanel {
	JLabel jLabel = new JLabel("TITULO");

	public JpanelNortePantallaPrincipal() {
		init();
	}

	private void init() {
		this.setLayout(new FlowLayout());
		this.setBackground(new Color(42, 106, 125));
		this.add(jLabel);


	}

}
