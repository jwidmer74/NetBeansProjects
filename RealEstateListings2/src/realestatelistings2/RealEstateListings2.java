/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package realestatelistings2;

/**
 *
 * @author Mr Porcupine
 */
public class RealEstateListings2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Property land = new Property (10000, "Land", 2.1);
        Property estate = new Property (250000, "Estate", 1.5, 3, 5);
        System.out.println(land.toString());
        System.out.println(estate.toString());
    }
    
}
