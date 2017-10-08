/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prices2;
import java.util.Scanner;
/**
 *
 * @author Mr Porcupine
 */
public class Prices2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double [][] prices = new double [5][2];
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < 5; i++)
        {
            System.out.println("Enter the orginal price: ");
            prices[i][0] = in.nextDouble();
            prices[i][1] = prices[i][0] * .70;
        }
        for (int i = 0; i < 5; i++)
        {
            System.out.println("orginal price $" + prices [i][0] +
                    "\tdiscounted price $" + prices [i][1]);
        }
    }
    
} 
