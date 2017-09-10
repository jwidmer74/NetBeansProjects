/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package errorhandeling;

/**
 *
 * @author Mr Porcupine
 */
public class ErrorHandeling {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       try{
        int count = 0;
        int x = 5, y = 6, z = 7;
        double average = (x + y + z) / count;
        System.out.println("The average is: " + average);
       }
       catch(Exception e)
       {
         System.out.println(e.toString());
       }
    }
       
       
    
}
