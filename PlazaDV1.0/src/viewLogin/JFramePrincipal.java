package viewLogin;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;

import controller.Commands;
import controller.Control;

public class JFramePrincipal extends JFrame implements ActionListener{
	private JPanelPrincipal jPanelPrincipal;
	private JScrollPane jScrollPane;

	Icon icon;

	public JFramePrincipal(Control control) {
		this.jPanelPrincipal = new JPanelPrincipal(control);
		this.jScrollPane = new JScrollPane();
//		setIconImage(new ImageIcon(getClass().getResource("/images/WSO.png")).getImage());
		init();
	}

	private void init() {
		this.setResizable(true);
		this.setLayout(new BorderLayout());
		this.setSize(Toolkit.getDefaultToolkit().getScreenSize());
		this.setLocationRelativeTo(null);
		
		jScrollPane.setViewportView(jPanelPrincipal);
		this.add(jScrollPane, BorderLayout.CENTER);

		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == Commands.C_INGRES) {
//			viewTable.JFramePrincipal ventanalicencia = new viewTable.JFramePrincipal();
//			ventanalicencia.setBounds(0, 0, 600, 360);
//			ventanalicencia.setVisible(true);
//			ventanalicencia.setResizable(false);
//			ventanalicencia.setLocationRelativeTo(null);
//			this.setVisible(false);
		}		
	}
	

	

}
