
package persitence;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import models.ProductPlazz;

public class FileManager {
    
    public void writeBinary(ArrayList<ProductPlazz>allproducts){
        FileOutputStream fileOutputStream = null;
        DataOutputStream dataout = null;
        
        //String nombre = JOptionPane.showInputDialog("ingrese la palagra a incriptar");
        
        
        try {
            fileOutputStream = new FileOutputStream("data/objetos.bin", true);
            
            dataout = new DataOutputStream(fileOutputStream);
            
            for (ProductPlazz product : allproducts) {
                dataout.writeUTF(product.toString() + "\n");
            }
                //dataout.writeUTF(nombre);
            
            
        }catch(FileNotFoundException e){
            System.out.println(e.getMessage());
        } catch (IOException ex) {
            Logger.getLogger(FileManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
    }
    
    
    public Calendar createDate(String dateProduct) throws ParseException{
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy", Locale.ENGLISH);
        cal.setTime(sdf.parse(dateProduct));// all done
        return cal;
    }
}
