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
import controller.Commands;

import controller.Control;
import java.awt.event.ActionListener;
import java.util.Calendar;



public class JDialogAddCost extends JDialog{

	private static final long serialVersionUID = 1L;
	private JTextField jTextFieldName;
	private JComboBox jComboBoxArea;
	private JDateChooser jChooserCostDate;
	private JLabel jLabel, jLabelCheck;
	private JButton jBLogin;
        
        private JTextField jtfNameProd;
        private JTextField jtPriceProd;
        private JTextField jtKilos;
        
        private JButton btnCreateProd;
	


	public JDialogAddCost(ActionListener action) {
		setModal(true);
		setTitle("Informacion");
		this.setLayout(new GridLayout(12, 1));
//		setIconImage( new ImageIcon(getClass().getResource( "/img/addCost.png")).getImage());
		setSize(350, 600);
		getContentPane().setBackground(Color.WHITE);
//		setLocationRelativeTo();
		initComponents( action );
	}

	private void initComponents(  ActionListener action) {
	
		this.setBackground(Color.WHITE);

		jComboBoxArea = new JComboBox<String>();
		jComboBoxArea.setBackground(Color.WHITE);
		jComboBoxArea.setBorder(BorderFactory.createCompoundBorder(new EmptyBorder(0, 0, 0, 0), new EtchedBorder()));
		jComboBoxArea.setPreferredSize(new Dimension(200, 60));
		jComboBoxArea.setBackground(new java.awt.Color(244, 244, 244));
		add(jComboBoxArea);

		jComboBoxArea.addItem("CARNICOS");
		jComboBoxArea.addItem("FRUTAS");
		jComboBoxArea.addItem("VEGETALES");
		jComboBoxArea.addItem("LACTEOS");
		jComboBoxArea.addItem("Otro");
		createEspacio();

		jtfNameProd = new JTextField("nombre producto");
                    jtfNameProd.setBackground(new Color(244, 244, 244));
                    jtfNameProd.setPreferredSize(new Dimension(200, 60));
                add(jtfNameProd);
                
		createEspacio();

		jtPriceProd = new JTextField("Precio");
                    jtPriceProd.setBackground(new Color(244, 244, 244));
                    jtPriceProd.setPreferredSize(new Dimension(200, 60));
                add(jtPriceProd);
		createEspacio();

                jtKilos = new JTextField("kilos");
                    jtKilos.setBackground(new Color(244, 244, 244));
                    jtKilos.setPreferredSize(new Dimension(200, 60));
                add(jtKilos);
		
		createEspacio();

		jChooserCostDate = new JDateChooser();
		add(jChooserCostDate);
		createEspacio();
		createEspacio();
                
                btnCreateProd = new JButton("crearProducto");
                    btnCreateProd.addActionListener(action);
                    btnCreateProd.setActionCommand(Commands.C_NEW_PROD.toString());
                
                add(btnCreateProd);

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
	
	
	public String getTypeProd(){
            return jComboBoxArea.getSelectedItem().toString();
        }
        
        public String getNameProd(){
            return jtfNameProd.getText();
        }
        
        public int getPrice(){
            return Integer.parseInt(jtPriceProd.getText());
        }
        
        public int getKilos(){
            return Integer.parseInt(jtKilos.getText());
        }
        
        public Calendar getDateProd(){
            return jChooserCostDate.getCalendar();
        }


}