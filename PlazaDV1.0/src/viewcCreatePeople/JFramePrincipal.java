package viewcCreatePeople;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;

import models.Sellerplazz;

public class JFramePrincipal extends JFrame {
	CenterEmpleado centerEmpleado;
	JpanelNorte jpanelNorte;

	public JFramePrincipal() {
		this.centerEmpleado =  new CenterEmpleado();
		this.jpanelNorte =  new JpanelNorte();
		init();
	}

	private void init() {
		this.setResizable(false);
		setSize(800, 400);
		this.setLocationRelativeTo(null);

		this.add(jpanelNorte, BorderLayout.NORTH);
		this.add(centerEmpleado, BorderLayout.CENTER);

//		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		
	}
	
	public Sellerplazz createPeople() {
		return centerEmpleado.createPeople();

	}

}
