/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package realestatemls;
import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author Mr Porcupine
 */
public class RealEstateMLS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Property> mls = new ArrayList<Property>();
        Property p1 = new Property(10000,"Land",3.5);
        mls.add(p1);
        p1 = new Property(230000,"Estate",2.0,2,3);
        mls.add(p1);
     // System.out.println(mls.toString());
        mls.remove(1);
        System.out.println(mls.toString());
    }
    
}
