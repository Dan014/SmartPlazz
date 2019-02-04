
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import models.ManagerProducts;

public class Control implements ActionListener{
    
    private ManagerProducts managerProducts;
    
    public Control(){
        managerProducts = new ManagerProducts();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
