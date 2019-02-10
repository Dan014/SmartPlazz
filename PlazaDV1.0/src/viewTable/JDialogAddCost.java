package viewTable;

import java.awt.Color;
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
import javax.swing.text.DefaultFormatter;
import com.toedter.calendar.JDateChooser;

import controller.Control;



public class JDialogAddCost extends JDialog{

	private static final long serialVersionUID = 1L;
	private JTextField plate, brand, line, ownerName;
//	private JComboBox<BrandCategory> jCBCostsCategory;
	private JDateChooser jChooserCostDate;
	private JButton jBCreate, jBCancelCreate;
	private JSpinner model, displacement, id;
	
	


	public JDialogAddCost(Control controller, JFramePrincipal jfMainWindow ) {
		setModal(true);
		setTitle("Informacion");
		this.setLayout(new GridLayout(12, 1));
//		setIconImage( new ImageIcon(getClass().getResource( "/img/addCost.png")).getImage());
		setSize(350, 600);
		getContentPane().setBackground(Color.WHITE);
		setLocationRelativeTo(jfMainWindow);
		initComponents( controller );
	}

	private void initComponents(Control controllerApp ) {
	
		jChooserCostDate = new JDateChooser();
		jChooserCostDate.setBorder(BorderFactory.createTitledBorder("INGRESO:"));
		add(jChooserCostDate);
		
		plate = new JTextField();
		plate.setBorder(BorderFactory.createTitledBorder("PLACA:"));
		add(plate);

		model = new JSpinner(new SpinnerNumberModel(0, 0, Integer.MAX_VALUE, 5));
		model.setBorder(BorderFactory.createTitledBorder("MODELO:"));
		model.setBackground(Color.WHITE);
		add(model);


//		jCBCostsCategory = new JComboBox<>(BrandCategory.values());
//		jCBCostsCategory.setBorder(BorderFactory.createTitledBorder("MARCA:"));
//		jCBCostsCategory.setBackground(Color.WHITE);
//		add(jCBCostsCategory);

		line = new JTextField();
		line.setBorder(BorderFactory.createTitledBorder("Linea:"));
		add(line);

		displacement = new JSpinner(new SpinnerNumberModel(0, 0, Integer.MAX_VALUE, 5));
		displacement.setBorder(BorderFactory.createTitledBorder("CILINDRAJE:"));
		displacement.setBackground(Color.WHITE);
		add(displacement);
		
		
		ownerName = new JTextField();
		ownerName.setBorder(BorderFactory.createTitledBorder("PROPIETARIO:"));
		add(ownerName);

		id = new JSpinner(new SpinnerNumberModel(0, 0, Integer.MAX_VALUE, 5));
		id.setBorder(BorderFactory.createTitledBorder("IDENTIFICACION:"));
		id.setBackground(Color.WHITE);
		add(id);
		
		
	

		jBCreate = new JButton("Crear");
		jBCreate.setBackground(Color.decode("#337ab7"));
		jBCreate.setForeground(Color.WHITE);
//		jBCreate.setActionCommand(Commands.C_CREATE_COST.name());
		jBCreate.addActionListener(controllerApp);
		add(jBCreate);

		jBCancelCreate = new JButton("Cancelar");
		jBCancelCreate.setBackground(Color.decode("#922B3E"));
		jBCancelCreate.setForeground(Color.WHITE);
//		jBCancelCreate.setActionCommand(Commands.C_CANCEL_CREATE_COST.name());
		jBCancelCreate.addActionListener(controllerApp);
		add( jBCancelCreate );
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