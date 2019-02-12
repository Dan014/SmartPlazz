
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.util.Calendar;

import javax.swing.JDialog;

import models.ManagerProducts;
import models.Sellerplazz;
import models.SoldProduct;
import models.TypeProduct;
import persitence.FileManager;
import view.JFramePrincipal;
import viewTable.JDialogAddCost;
import viewTable.JFramePrincipalDialog;

public class Control implements ActionListener {
	/**
	 * Modificar la vista y el controlador para que reciba el evento
	 */
	private ManagerProducts managerProducts;
	private JFramePrincipal mainFrame;
        private JFramePrincipalDialog trumainframe;
	private viewTable.JFramePrincipalDialog jFramePrincipalTable;
	private viewcCreatePeople.JFramePrincipal jFramePrincipalPeople;
	private JDialogAddCost jDialogAddCost;
	private FileManager filemanager;

	public Control() throws ParseException {

		jFramePrincipalTable = new viewTable.JFramePrincipalDialog(this);
		// jDialogAddCost = new JDialogAddCost(this, jFramePrincipalTable);
                filemanager = new FileManager();    
		managerProducts = new ManagerProducts();
		mainFrame = new JFramePrincipal(this);
		
                //trumainframe = new JFramePrincipalDialog(this);

                managerProducts.addSeller(managerProducts.createSeller("manuel", 1049777766));

		managerProducts.addNewProdcut(managerProducts.createProdcut(100, 1000,"mango","fruta",filemanager.createDate("06/01/2019")), 1049777766);
                fillTable();
		//filemanager.writeBinary(managerProducts.getListOfProdcuts());
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
		case C_SAVEPEOPLE:
			manageUser();
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
        
        private void fillTable(){
            jFramePrincipalTable.gettable().fillTable(managerProducts.getListOfProdcuts());
        }

	private void manageUser() {
		 Sellerplazz soldProduct = jFramePrincipalPeople.createPeople();
		 managerProducts.addSeller(soldProduct);
		 System.out.println(soldProduct);
//		 jfMainWindow.addElementToTable(soldProduct.toObjectVector());
	}

	private void createNewProd() {
            String nameProd = trumainframe.getjdialog().getNameProd();
            int priceProd = trumainframe.getjdialog().getPrice();
            int kilos = trumainframe.getjdialog().getKilos();
            Calendar date = trumainframe.getjdialog().getDateProd();
            String typeProd = trumainframe.getjdialog().getTypeProd();
            
            managerProducts.addNewProdcut(managerProducts.createProdcut(kilos, priceProd, nameProd, typeProd, date), 1049777766);		
            System.out.println("se ha creado un producto");
// Tools | Templates.
	}

}
