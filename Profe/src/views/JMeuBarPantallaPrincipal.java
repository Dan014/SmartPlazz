package views;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/**
 * Clase que es llamada en todos los Jframe principales
 * con el objetivo de que aparezaca la barra de herramientas superior
 * @author Daniel Felipe Garcia
 *
 */
public class JMeuBarPantallaPrincipal extends JMenuBar {

	JMenu jMenu, jMenu2, jMenu3, jMenu4;
	JMenuItem jMenuItem, jMenuItem2, jMenuItem3, jMenuItem4;
	
	public JMeuBarPantallaPrincipal() {
		super();
		init();
	}

	private void init() {
		jMenu = new JMenu("OPTION");
		this.add(jMenu);

		jMenu2 =  new JMenu("HELP");
		this.add(jMenu2);
		
		jMenu3 = new JMenu("ABOUT");
//		jMenu3.addActionListener(ProyectoListener.getInstance());
		this.add(jMenu3);		
		
		jMenu4 = new JMenu("MORE");
		this.add(jMenu4);	
		
		jMenuItem =  new JMenuItem("Color");
		jMenu.add(jMenuItem);
		
		jMenuItem2 = new JMenuItem("Tools");
		jMenu.add(jMenuItem2);
		
		jMenuItem3 = new JMenu("Ayuda");//ES JMENU POR TANTO TIENE FLECHA
		jMenu.add(jMenuItem3);
		
		
		
	
		
		
	}
}
