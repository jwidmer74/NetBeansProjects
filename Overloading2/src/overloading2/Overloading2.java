/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package overloading2;

/**
 *
 * @author Mr Porcupine
 */
public class Overloading2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("The average of 6,7,8 integers are " + average(6,7,8));
        System.out.println("The average of 6.3,7.5, and 8.3 integers are " + average(6.3, 7.5, 8.3));
       }
    public static double average(int x, int y, int z)
    {
       return (x + y + z)/3.0; 
    }
    public static double average(double x, double y, double z)
    {
       return (x + y + z)/3;
    }
    
}
