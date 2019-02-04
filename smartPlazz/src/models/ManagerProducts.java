
package models;

import java.util.ArrayList;
import java.util.Calendar;


public class ManagerProducts {
    
    private ArrayList<ProductPlazz>listOfProdcuts;
    private ArrayList<Sellerplazz>listSellersPlazz;
    private ArrayList<SoldProduct>listSoldproduct;

    public ManagerProducts() {
        listOfProdcuts = new ArrayList<>();
        listSellersPlazz = new ArrayList<>();
        listSoldproduct = new ArrayList<>();
        
    }

    public ArrayList<ProductPlazz> getListOfProdcuts() {
        return listOfProdcuts;
    }

    public ArrayList<Sellerplazz> getListSellersPlazz() {
        return listSellersPlazz;
    }

    public ArrayList<SoldProduct> getListSoldproduct() {
        return listSoldproduct;
    }
    
    
    public static ProductPlazz createProdcut(int kilos,int price,String nameProductPlazz,TypeProduct typeProduct,Calendar dateSell){
        return new ProductPlazz(kilos, price, nameProductPlazz, typeProduct, dateSell);
    }
    
    public void addNewProdcut(ProductPlazz productNew,int idSeller){
        AddOwnerProd(productNew.getIdProductPlazz(), idSeller);
        listOfProdcuts.add(productNew);
    }
    
    public static Sellerplazz createSeller(String nameSeller, int idSeller){
        return new Sellerplazz(nameSeller, idSeller);
    }
    
    public void addSeller(Sellerplazz sellernew){
        listSellersPlazz.add(sellernew);
    }
    
    
    public static SoldProduct registerNewsell(int idproductSold){
        return new SoldProduct(idproductSold);
    }
    
    public void addNewSold(SoldProduct soldProd){
        listSoldproduct.add(soldProd);
    }
    
    public void AddOwnerProd(int idSeller, int idProd){
        for (Sellerplazz seller : listSellersPlazz) {
            if(seller.getIdSeller() == idSeller){
                seller.addProductInSell(idProd);
            }
        }
    }
}
