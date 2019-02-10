package viewsFormAddProduct;

import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;

//import com.toedter.calendar.JTextFieldDateEditor;

public class JPanelSouth extends JPanel {

	JButton jButton;

	public JPanelSouth() {
		init();
	}

	public void init() {
		jButton = new JButton("Guardar");
		this.add(jButton);

	}

}
