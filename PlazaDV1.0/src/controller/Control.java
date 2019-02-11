
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;

import javax.swing.JDialog;

import models.ManagerProducts;
import models.TypeProduct;
import persitence.FileManager;
import view.JFramePrincipal;
import viewTable.JDialogAddCost;

public class Control implements ActionListener {
	/**
	 * Modificar la vista y el controlador para que reciba el evento
	 */
	private ManagerProducts managerProducts;
	private JFramePrincipal mainFrame;
	private viewTable.JFramePrincipal jFramePrincipalTable;
	private JDialogAddCost jDialogAddCost;
	private FileManager filemanager;

	public Control() throws ParseException {

		// jFramePrincipalTable = new viewTable.JFramePrincipal(this);
		// jDialogAddCost = new JDialogAddCost(this, jFramePrincipalTable);

		managerProducts = new ManagerProducts();
		mainFrame = new JFramePrincipal(this);
		filemanager = new FileManager();

		// managerProducts.addSeller(managerProducts.createSeller("manuel",
		// 1049777766));
		//
		// managerProducts.addNewProdcut(managerProducts.createProdcut(100, 1000,
		// "mango", TypeProduct.frutas,
		// filemanager.createDate("06/01/2019")), 1049777766);

		filemanager.writeBinary(managerProducts.getListOfProdcuts());
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		switch (Commands.valueOf(e.getActionCommand())) {
		case C_LOGIN:
			showViewLogin();
			break;
		case C_AVERAGE:
			jDialogAddCost.setVisible(true);

			break;
		case C_CREATE_PEOPLE:
			showViewCreate();
			break;

		case C_NEW_PROD:
			createNewProd();
			break;

		default:
			break;

		}

	}

	private void showViewLogin() {
		viewLogin.JFramePrincipal jFramePrincipal = new viewLogin.JFramePrincipal(null);
		jFramePrincipal.setVisible(true);
	}
	
	private void showViewCreate() {
		viewcCreatePeople.JFramePrincipal jFramePrincipal = new viewcCreatePeople.JFramePrincipal();
		jFramePrincipal.setVisible(true);
	}

	private void manageAuto() {
		// Auto auto = jDialogAddCost.createCost();
		// enterprise.addCost(auto);
		// enterprise.addtoArray(auto);
		// jfMainWindow.addElementToTable(auto.toObjectVector());
	}

	private void createNewProd() {
		throw new UnsupportedOperationException("Not supported yet."); // To change body of generated methods, choose
																		// Tools | Templates.
	}

}
