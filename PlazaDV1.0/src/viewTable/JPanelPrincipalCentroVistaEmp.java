package viewTable;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JPanel;

import controller.Commands;

public class JPanelPrincipalCentroVistaEmp extends JPanel implements ActionListener {

	JPanel jPanelNorth;
	JButton jButton, jButton2, jButton3, find;
	ImageIcon imageIcon;
	Icon icon;
        JDialogAddCost jDialogAddCost;
	public JPanelPrincipalCentroVistaEmp(ActionListener action) {

		jPanelNorth = new JPanel();
		jPanelNorth.setBackground(new Color(59, 232, 183));
		jPanelNorth.setPreferredSize(new Dimension(100, 100));

		init(action);
	}

	private void init(ActionListener action) {

		this.setLayout(new BorderLayout());
		this.setSize(Toolkit.getDefaultToolkit().getScreenSize());
		this.setBackground(Color.BLUE);
		this.setPreferredSize(new Dimension(800, 100));

                jDialogAddCost = new JDialogAddCost(action);
                
//		jPanelNorth.add(create("Ingresar Producto", "/images/dieta.png", Commands.C_ADDPRODUCT.name()));
//		jPanelNorth.add(create("Eliminar Producto", "/images/basura.png", Commands.C_AVERAGE.name()));
//		jPanelNorth.add(create("Buscar Producto", "/images/busqueda.png", Commands.C_AVERAGE.name()));

		
		jButton = new JButton("Ingresar");
		jButton.setBounds(0, 0, 200, 100);
		jButton.setActionCommand(Commands.C_ADDPRODUCT.name());
		jButton.addActionListener(this);
		jButton.setBackground(new Color(59, 232, 89));
		jButton.setForeground(new Color(255, 255, 255));// blanco
		imageIcon = new ImageIcon(getClass().getResource("/images/dieta.png"));
		icon = new ImageIcon(imageIcon.getImage().getScaledInstance(50, 50, Image.SCALE_AREA_AVERAGING));
		jButton.setIcon(icon);
		jPanelNorth.add(jButton);
		
		
		jButton2 = new JButton("Eliminar");
		jButton2.setBounds(0, 0, 200, 100);
		jButton2.setActionCommand(Commands.C_ADDPRODUCT.name());
		jButton2.addActionListener(this);
		jButton2.setBackground(new Color(59, 232, 89));
		jButton2.setForeground(new Color(255, 255, 255));// blanco
		imageIcon = new ImageIcon(getClass().getResource("/images/basura.png"));
		icon = new ImageIcon(imageIcon.getImage().getScaledInstance(50, 50, Image.SCALE_AREA_AVERAGING));
		jButton2.setIcon(icon);
		jPanelNorth.add(jButton2);
		
		
		jButton3 = new JButton("Buscar");
		jButton3.setBounds(0, 0, 200, 100);
		jButton3.setActionCommand(Commands.C_ADDPRODUCT.name());
		jButton3.addActionListener(this);
		jButton3.setBackground(new Color(59, 232, 89));
		jButton3.setForeground(new Color(255, 255, 255));// blanco
		imageIcon = new ImageIcon(getClass().getResource("/images/busqueda.png"));
		icon = new ImageIcon(imageIcon.getImage().getScaledInstance(50, 50, Image.SCALE_AREA_AVERAGING));
		jButton3.setIcon(icon);
		jPanelNorth.add(jButton3);
		
		
		this.add(jPanelNorth, BorderLayout.NORTH);

	}

//	public JButton create(String name, String url, String comando) {
//		jButton = new JButton(name);
//		jButton.setBounds(0, 0, 200, 200);
//		jButton.setActionCommand(comando);
//		jButton.addActionListener(this);
//		jButton.setBackground(new Color(59, 232, 89));
//		jButton.setForeground(new Color(255, 255, 255));// blanco
//		imageIcon = new ImageIcon(getClass().getResource(url));
//		icon = new ImageIcon(imageIcon.getImage().getScaledInstance(50, 50, Image.SCALE_AREA_AVERAGING));
//		jButton.setIcon(icon);
//		// jButton.setToolTipText(commandAction.getToolTip());
//		this.add(jButton);
//		return jButton;
//
//	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == jButton) {
			System.out.println("fgdf");
			
			jDialogAddCost.setVisible(true);
			jDialogAddCost.setResizable(false);
			jDialogAddCost.setLocationRelativeTo(null);
		}				
	}

    public JDialogAddCost getjDialogAddCost() {
        return jDialogAddCost;
    }


}
