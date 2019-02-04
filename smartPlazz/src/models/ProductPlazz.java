
package models;

import java.util.Calendar;

public class ProductPlazz {
    
    private static int idsprod;
    private int idProductPlazz,kilosProd,priceProd;
    private String nameProductPlazz;
    private TypeProduct typeprod;
    private Calendar dateSell;

    public ProductPlazz( int kilosProd, int priceProd, String nameProductPlazz, TypeProduct typeprod, Calendar dateSell) {
        idsprod++;
        this.idProductPlazz = idsprod;
        this.kilosProd = kilosProd;
        this.priceProd = priceProd;
        this.nameProductPlazz = nameProductPlazz;
        this.typeprod = typeprod;
        this.dateSell = dateSell;
    }

    public int getIdProductPlazz() {
        return idProductPlazz;
    }

    public int getKilosProd() {
        return kilosProd;
    }

    public int getPriceProd() {
        return priceProd;
    }

    public String getNameProductPlazz() {
        return nameProductPlazz;
    }

    public TypeProduct getTypeprod() {
        return typeprod;
    }

    public Calendar getDateSell() {
        return dateSell;
    }
    
    
    
    
    
}
