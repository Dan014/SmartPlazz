
package models;

public class SoldProduct {
    
    private static int newids;
    private int idSell, idProduct;

    public SoldProduct( int idProduct) {
        newids++;
        this.idSell = newids;
        this.idProduct = idProduct;
    }
    
    
    
    
}
