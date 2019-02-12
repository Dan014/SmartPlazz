package viewTable;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;

import controller.Control;

public class JFramePrincipalDialog extends JFrame {
	private JPanelPrincipal jPanelPrincipal;
	private JMeuBarPantallaPrincipal jMeuBarPantallaPrincipal;
	private JScrollPane jScrollPane;
	Icon icon;

	public JFramePrincipalDialog(Control controllerApp ) {
		this.jPanelPrincipal = new JPanelPrincipal(controllerApp);
		this.jScrollPane = new JScrollPane();
//		setIconImage(new ImageIcon(getClass().getResource("/images/WSO.png")).getImage());
		init();
	}

	private void init() {
		this.setResizable(true);
		this.setLayout(new BorderLayout());
		this.setSize(Toolkit.getDefaultToolkit().getScreenSize());
		this.setLocationRelativeTo(null);
		
		jMeuBarPantallaPrincipal = new JMeuBarPantallaPrincipal( );
		this.setJMenuBar( jMeuBarPantallaPrincipal );
		
		jScrollPane.setViewportView(jPanelPrincipal);
		this.add(jScrollPane, BorderLayout.CENTER);

		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
        
    public JDialogAddCost getjdialog() {
        return jPanelPrincipal.getjPanelPrincipalCentroVistaEmp().getjDialogAddCost();
    }
	
    public MyJTable gettable(){
        return jPanelPrincipal.getMyJTable();
    }
	

}
