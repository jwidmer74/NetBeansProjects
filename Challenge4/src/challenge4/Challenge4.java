/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package challenge4;
import java.text.*;
import java.util.Date;
import java.util.Locale;
/**
 *
 * @author Mr Porcupine
 */
public class Challenge4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          DateFormat df = new SimpleDateFormat("MM/dd/yyyy");
    Date dt = new Date();
 
    /**
    * format method is used to convert the date in MM/dd/yyyy format
    */
    System.out.println("Date in MM/dd/yyyy format: "+df.format(dt));
    
    DateFormat df2 = DateFormat.getDateInstance(DateFormat.LONG, Locale.FRANCE);
    System.out.println("France time: "+df2.format(dt));
       
       
    
    }
}
