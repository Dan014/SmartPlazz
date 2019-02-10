package viewsFormAddProduct;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.util.ArrayList;
import java.util.Locale;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;

import com.toedter.calendar.JDateChooser;

public class JPanelCenterForm extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField jTextFieldName;
	private JComboBox jComboBoxArea;
	private JDateChooser jChooserCostDate;
	private JLabel jLabel, jLabelCheck;
	private JButton jBLogin;

	public JPanelCenterForm() {

		this.setBorder(BorderFactory.createEmptyBorder(0, 130, 0, 130));
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		this.initComponents();
	}

	private void initComponents() {
		this.setBackground(Color.WHITE);

		jComboBoxArea = new JComboBox<String>();
		jComboBoxArea.setBackground(Color.WHITE);
		jComboBoxArea.setBorder(BorderFactory.createCompoundBorder(new EmptyBorder(0, 0, 0, 0), new EtchedBorder()));
		jComboBoxArea.setPreferredSize(new Dimension(200, 60));
		jComboBoxArea.setBackground(new java.awt.Color(244, 244, 244));
		add(jComboBoxArea);

		jComboBoxArea.addItem("");
		jComboBoxArea.addItem("FRUTAS");
		jComboBoxArea.addItem("VEGETALES");
		jComboBoxArea.addItem("LACTEOS");
		jComboBoxArea.addItem("Otro");
		createEspacio();

		createJTextField("Nombre del Producto", new Color(244, 244, 244), 200, 60);
		createEspacio();

		createJTextField("Precio por Kilo", new Color(244, 244, 244), 200, 60);
		createEspacio();

		createJTextField("Cantidad Disponible", new Color(244, 244, 244), 200, 60);
		createEspacio();

		jChooserCostDate = new JDateChooser();
		add(jChooserCostDate);
		createEspacio();
		createEspacio();

	}

	public JLabel createEspacio() {
		jLabel = new JLabel();
		jLabel.setPreferredSize(new Dimension(0, 20));
		this.add(jLabel);
		return jLabel;

	}

	public JTextField createJTextField(String name, Color color, int largo, int ancho) {
		jTextFieldName = new JTextField(name);
		jTextFieldName.setBackground(color);
		jTextFieldName.setPreferredSize(new Dimension(largo, ancho));
		this.add(jTextFieldName);
		return jTextFieldName;

	}

}
