
package models;

import java.util.ArrayList;
import java.util.List;

public class Sellerplazz {
    
    private String nameSeller;
    //private static int idsSellers;
    private int idSeller;
    
    private List<Integer> productsList;

    public Sellerplazz(String nameSeller, int idSeller) {
        this.nameSeller = nameSeller;
        this.idSeller = idSeller;
        
        productsList = new ArrayList<>();
    }
    
    public void addProductInSell(int idInAdd){
        productsList.add(idInAdd);
    }

    public String getNameSeller() {
        return nameSeller;
    }

   
    public int getIdSeller() {
        return idSeller;
    }

    public List<Integer> getProductsList() {
        return productsList;
    }
    
    
}
