
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import models.ManagerProducts;
import models.TypeProduct;
import persitence.FileManager;
import view.JFramePrincipal;

public class Control implements ActionListener{
    /**
     * Modificar la vista y el controlador para que reciba el evento
     */
    private ManagerProducts managerProducts;
    private JFramePrincipal mainFrame;
    private FileManager filemanager;
    
    public Control() throws ParseException{
        managerProducts = new ManagerProducts();
        mainFrame = new JFramePrincipal();
        filemanager = new FileManager();
        
        
        managerProducts.addSeller(managerProducts.createSeller("manuel", 1049777766));
        
        managerProducts.addNewProdcut(managerProducts.createProdcut(100, 1000, "mango", TypeProduct.frutas, filemanager.createDate("06/01/2019")), 1049777766);
        
        filemanager.writeBinary(managerProducts.getListOfProdcuts());
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
	private void manageAuto() {
//		Auto auto = jDialogAddCost.createCost();
//		enterprise.addCost(auto);
//		enterprise.addtoArray(auto);
//		jfMainWindow.addElementToTable(auto.toObjectVector());
	}
	
    
    
}
