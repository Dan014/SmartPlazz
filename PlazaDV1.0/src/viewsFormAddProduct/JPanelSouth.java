package viewsFormAddProduct;

import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;

import controller.Control;

//import com.toedter.calendar.JTextFieldDateEditor;

public class JPanelSouth extends JPanel {

	JButton jButton;

	public JPanelSouth() {
		init();
	}

	public void init() {
		this.setBackground(Color.WHITE);
		jButton = new JButton("INGRESAR");
//		jButton.setActionCommand(controller.Commands.C_INGRES.name());
//		jButton.addActionListener(controllerApp);
		
		this.add(jButton);

	}

}
