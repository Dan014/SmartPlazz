package viewcCreatePeople;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CenterEmpleado extends JPanel {
	ImageIcon imageIcon;
	Icon icon;
	JButton jButton;
	JLabel jLabel, jLabel2, jLabel3, jLabel4, jLabel5, jLabel6, jLabel7, jLabel8, jLabel9, foto;
	JTextField name, cedula, direccion, telefono, apellido, cargo, edad, codigo;
	JComboBox categoria;

	public CenterEmpleado() {

		init();

	}

	private void init() {

		this.setLayout(null);

		jLabel = new JLabel("NOMBRE");
		jLabel.setBounds(20, 10, 200, 25);
		jLabel.setFont(new Font("Andale Mono", 3, 15));
		jLabel.setForeground(new Color(23, 4, 255));
		jLabel.setBackground(Color.BLUE);
		add(jLabel);

		name = new JTextField();
		name.setBounds(20, 40, 200, 25);
		name.setBackground(new java.awt.Color(224, 224, 224));
		name.setFont(new java.awt.Font("Andale Mono", 1, 14));
		name.setForeground(new java.awt.Color(255, 0, 0));
		add(name);

		jLabel2 = new JLabel("C.C");
		jLabel2.setBounds(20, 85, 200, 25);
		jLabel2.setFont(new Font("Andale Mono", 3, 15));
		jLabel2.setForeground(new Color(23, 4, 255));
		jLabel2.setBackground(Color.BLUE);
		add(jLabel2);

		cedula = new JTextField();
		cedula.setBounds(20, 115, 200, 25);
		cedula.setBackground(new java.awt.Color(224, 224, 224));
		cedula.setFont(new java.awt.Font("Andale Mono", 1, 14));
		cedula.setForeground(new java.awt.Color(255, 0, 0));
		add(cedula);

		jLabel3 = new JLabel("DIRECCION");
		jLabel3.setBounds(20, 150, 200, 25);
		jLabel3.setFont(new Font("Andale Mono", 3, 15));
		jLabel3.setForeground(new Color(23, 4, 255));
		jLabel3.setBackground(Color.BLUE);
		add(jLabel3);

		direccion = new JTextField();
		direccion.setBounds(20, 175, 200, 25);
		direccion.setBackground(new java.awt.Color(224, 224, 224));
		direccion.setFont(new java.awt.Font("Andale Mono", 1, 14));
		direccion.setForeground(new java.awt.Color(255, 0, 0));
		add(direccion);

		jLabel4 = new JLabel("TELEFONO");
		jLabel4.setBounds(20, 210, 200, 25);
		jLabel4.setFont(new Font("Andale Mono", 3, 15));
		jLabel4.setForeground(new Color(23, 4, 255));
		jLabel4.setBackground(Color.BLUE);
		add(jLabel4);
		
		
		telefono = new JTextField();
		telefono.setBounds(20, 245, 200, 25);
		telefono.setBackground(new java.awt.Color(224, 224, 224));
		telefono.setFont(new java.awt.Font("Andale Mono", 1, 14));
		telefono.setForeground(new java.awt.Color(255, 0, 0));
		add(telefono);

	

		jLabel5 = new JLabel("APELLIDO");
		jLabel5.setBounds(250, 10, 200, 25);
		jLabel5.setFont(new Font("Andale Mono", 3, 15));
		jLabel5.setForeground(new Color(23, 4, 255));
		jLabel5.setBackground(Color.BLUE);
		add(jLabel5);

		apellido = new JTextField();
		apellido.setBounds(250, 40, 200, 25);
		apellido.setBackground(new java.awt.Color(224, 224, 224));
		apellido.setFont(new java.awt.Font("Andale Mono", 1, 14));
		apellido.setForeground(new java.awt.Color(255, 0, 0));
		add(apellido);
		
		
		jLabel6 = new JLabel("PUESTO DE VENTA");
		jLabel6.setBounds(250, 85, 200, 25);
		jLabel6.setFont(new Font("Andale Mono", 3, 15));
		jLabel6.setForeground(new Color(23, 4, 255));
		jLabel6.setBackground(Color.BLUE);
		add(jLabel6);

		cargo = new JTextField();
		cargo.setBounds(250, 115, 200, 25);
		cargo.setBackground(new java.awt.Color(224, 224, 224));
		cargo.setFont(new java.awt.Font("Andale Mono", 1, 14));
		cargo.setForeground(new java.awt.Color(255, 0, 0));
		add(cargo);
		
		
		jLabel7 = new JLabel("EDAD");
		jLabel7.setBounds(250, 150, 150, 25);
		jLabel7.setFont(new Font("Andale Mono", 3, 15));
		jLabel7.setForeground(new Color(23, 4, 255));
		jLabel7.setBackground(Color.BLUE);
		add(jLabel7);

		edad = new JTextField();
		edad.setBounds(250, 175, 200, 25);
		edad.setBackground(new java.awt.Color(224, 224, 224));
		edad.setFont(new java.awt.Font("Andale Mono", 1, 14));
		edad.setForeground(new java.awt.Color(255, 0, 0));
		add(edad);
		
		
		jLabel8 = new JLabel("CODIGO");
		jLabel8.setBounds(250, 210, 200, 25);
		jLabel8.setFont(new Font("Andale Mono", 3, 15));
		jLabel8.setForeground(new Color(23, 4, 255));
		jLabel8.setBackground(Color.BLUE);
		add(jLabel8);

		codigo = new JTextField();
		codigo.setBounds(250, 245, 200, 25);
		codigo.setBackground(new java.awt.Color(224, 224, 224));
		codigo.setFont(new java.awt.Font("Andale Mono", 1, 14));
		codigo.setForeground(new java.awt.Color(255, 0, 0));
		add(codigo);
		
		
		
//		jLabel = new JLabel();
//		imageIcon = new ImageIcon(getClass().getResource("/images/user.png"));
//		icon = new ImageIcon(imageIcon.getImage().getScaledInstance(300, 300, Image.SCALE_AREA_AVERAGING));
//		jLabel.setIcon(icon);
//		jPanelCenterImage.add(jLabel);
		
		foto = new JLabel();
		imageIcon = new ImageIcon(getClass().getResource("/images/hombre.png"));
		foto.setBounds(500, 30, 250, 250);
		icon = new ImageIcon(imageIcon.getImage().getScaledInstance(200, 200, Image.SCALE_AREA_AVERAGING));
		foto.setIcon(icon);

		this.add(foto);	
		
		


	}

}
