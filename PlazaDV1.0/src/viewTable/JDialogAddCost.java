package viewTable;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.text.DefaultFormatter;
import com.toedter.calendar.JDateChooser;

import controller.Control;



public class JDialogAddCost extends JDialog{

	private static final long serialVersionUID = 1L;
	
	
	
	private JTextField jTextFieldName;
	private JComboBox jComboBoxArea;
	private JDateChooser jChooserCostDate;
	private JLabel jLabel, jLabelCheck;
	JButton jButton;
	


	public JDialogAddCost( ) {
		setModal(true);
		setTitle("Informacion");
		this.setLayout(new GridLayout(12, 1));
//		setIconImage( new ImageIcon(getClass().getResource( "/img/addCost.png")).getImage());
		setSize(350, 600);
		getContentPane().setBackground(Color.WHITE);
//		setLocationRelativeTo();
		initComponents(  );
	}

	private void initComponents(  ) {
	
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
		
		jButton = new JButton("INGRESAR");
//		jButton.setActionCommand(controller.Commands.C_INGRES.name());
//		jButton.addActionListener(controllerApp);
		
		this.add(jButton);
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
	
	
//	public Auto createCost() {
//		setVisible(false);
//		return AutoManager.createAuto(Utilities.parseDateToCalendar( jChooserCostDate.getDate() ), plate.getText(), (int) model.getValue(), (BrandCategory)jCBCostsCategory.getSelectedItem(), line.getText(),(int)  displacement.getValue(), ownerName.getText(), (int) id.getValue());
//
//	}
//	public void showDialog() {
//		jTFNotes.setText("");
////		jChooserCostDate.setDate( );
//	}



}