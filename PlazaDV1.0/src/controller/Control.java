
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import models.ManagerProducts;
import view.JFramePrincipal;

public class Control implements ActionListener{
    
    private ManagerProducts managerProducts;
    private JFramePrincipal mainFrame;
    
    public Control(){
        managerProducts = new ManagerProducts();
        mainFrame = new JFramePrincipal();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
