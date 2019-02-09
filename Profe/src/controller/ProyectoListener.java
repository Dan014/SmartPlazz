package controller;

import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import models.dao.ManagerBussines;
import models.entities.Auto;
import views.Constant;
import views.JFramePantallaPrincipal;
import views.JPanelCenterForm;
import views.JpanelLeftPantallaPrincipal;
import views.NewFrame;

/**
 * Esta clase corresponde a los Listener del Programa aca destaco principalmente
 * los del menu
 * 
 * @author Daniel Felipe Garcia
 *
 */
public class ProyectoListener implements ActionListener {

	private static ProyectoListener proyectoListener = null;
	private JpanelLeftPantallaPrincipal jpanelStatusBar;
	private JFramePantallaPrincipal jFramePantallaPrincipal;
	private JPanelCenterForm jPanelCenterForm;
	
	private ManagerBussines economicBudgetManager;


	public ProyectoListener() {
		jPanelCenterForm = new JPanelCenterForm();
	}
	
	public static ProyectoListener getInstance() {
		
		
		if (proyectoListener == null) {
			proyectoListener = new ProyectoListener();

		}
		return proyectoListener;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		switch (e.getActionCommand().valueOf(e.getActionCommand())) {
		case "INGRESAR AUTO":
			boton2();
			break;
		case "IMPRIMIR DATOS":
			break;
		case "INFORME MENSUAL":
			break;
		case "BUSQUEDA MODELO":
			break;
		case "SALIR":
			break;
		case "Boton1":
			System.out.println("dsada");
			manageAddCost();
			break;
		default:
			break;
		}
	}
	
	
	private void boton2() {
		System.out.println("Usted ha presionado el Boton 2");
		NewFrame jFrameArticulosPrincipal = new NewFrame();
		jFrameArticulosPrincipal.setResizable(false);
		jFrameArticulosPrincipal.setLocationRelativeTo(null);
		jFrameArticulosPrincipal.setVisible(true);

	}
	

	private void manageAddCost() {
		Auto costAux = jPanelCenterForm.createCost();
		economicBudgetManager = new ManagerBussines();
		economicBudgetManager.addCost(costAux);
//		JOptionPane.showMessageDialog(jfMainWindow,  economicBudget.getIncomesList() );;
		jFramePantallaPrincipal.addElementToTable(costAux.toObjectVector());	
	}



}
