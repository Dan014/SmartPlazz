package views;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSpinner;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.text.DefaultFormatter;

import com.toedter.calendar.JDateChooser;

import controller.ProyectoListener;
import models.dao.AutoManager;
import models.entities.Auto;
import utilities.Utilities;

public class JPanelCenterForm extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField jTextField, jTextField2, jTextField3, jTextField4, jTextField5, jTextField6, jTextField7;
	private JLabel jLabel;
	private JDateChooser jChooserCostDate;
	private JButton jBCreate, jBCancelCreate;
	private JSpinner jSpValue, jSpinner, jSpinner2;


	public JPanelCenterForm() {

		this.setBackground(Color.WHITE);
		this.setBorder(BorderFactory.createEmptyBorder(0, 80, 0, 80));
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		this.initComponents();
	}

	private void initComponents() {

		jTextField = new JTextField();
		jTextField.setBorder(BorderFactory.createTitledBorder("DATE:"));
		add(jTextField);

		jSpValue = new JSpinner(new SpinnerNumberModel(100, 0, Integer.MAX_VALUE, 5));
		((DefaultFormatter) ((JSpinner.NumberEditor)jSpValue.getEditor()).getTextField().getFormatter()).setAllowsInvalid(false);
		jSpValue.setBorder(BorderFactory.createTitledBorder("Valor:"));
		jSpValue.setBackground(Color.WHITE);
		add(jSpValue);


		jTextField3 = new JTextField();
		jTextField3.setBorder(BorderFactory.createTitledBorder("DATE:"));
		add(jTextField3);

		jTextField4 = new JTextField();
		jTextField4.setBorder(BorderFactory.createTitledBorder("DATE:"));
		add(jTextField4);

		jSpinner = new JSpinner(new SpinnerNumberModel(100, 0, Integer.MAX_VALUE, 5));
		((DefaultFormatter) ((JSpinner.NumberEditor)jSpinner.getEditor()).getTextField().getFormatter()).setAllowsInvalid(false);
		jSpinner.setBorder(BorderFactory.createTitledBorder("Valor:"));
		jSpinner.setBackground(Color.WHITE);
		add(jSpinner);
		
		
		jTextField6 = new JTextField();
		jTextField6.setBorder(BorderFactory.createTitledBorder("Notas:"));
		add(jTextField6);

		jSpinner2 = new JSpinner(new SpinnerNumberModel(100, 0, Integer.MAX_VALUE, 5));
		((DefaultFormatter) ((JSpinner.NumberEditor)jSpinner2.getEditor()).getTextField().getFormatter()).setAllowsInvalid(false);
		jSpinner2.setBorder(BorderFactory.createTitledBorder("Valor:"));
		jSpinner2.setBackground(Color.WHITE);
		add(jSpinner2);
		
		
		jChooserCostDate = new JDateChooser();
		add(jChooserCostDate);
		
		jBCreate = new JButton("Crear");
		jBCreate.setBackground(Color.decode("#337ab7"));
		jBCreate.setForeground(Color.WHITE);
		jBCreate.addActionListener(ProyectoListener.getInstance());
		jBCreate.setActionCommand("Boton1");
		add(jBCreate);

	}

	public JLabel createEspacio() {
		jLabel = new JLabel();
		jLabel.setPreferredSize(new Dimension(0, 20));
		this.add(jLabel);
		return jLabel;

	}

	// public JTextField createJTextField( Object name2, String name, Color color,
	// int largo, int ancho) {
	// name2 = new JTextField(name);
	// ((JComponent) name2).setBackground(color);
	// ((JComponent) name2).setPreferredSize(new Dimension(largo, ancho));
	// this.add((Component) name2);
	// return jTextFieldName;
	//
	// }

	public Auto createCost() {
		setVisible(false);
		return AutoManager.createAuto(Utilities.parseDateToCalendar( jChooserCostDate.getDate() ), jTextField.getText(), (int) jSpValue.getValue(), jTextField3.getText(), jTextField4.getText(),(int)  jSpinner.getValue(), jTextField6.getText(), (int) jSpinner2.getValue());

	}
}
