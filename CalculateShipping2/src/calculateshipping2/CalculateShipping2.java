/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculateshipping2;
import java.util.Scanner;
/**
 *
 * @author Mr Porcupine
 */
public class CalculateShipping2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double totalSale = 0;
        Scanner in = new Scanner(System.in);
        totalSale = in.nextDouble();
        if(totalSale < 25)
        {
            totalSale = totalSale + 15;
        }
        else if (totalSale < 50)
        {
            totalSale = totalSale + 10;
        }
        else if (totalSale <= 75)
        {
            totalSale = totalSale + 5;
        }
       System.out.println("The total cost for your sale is : " + totalSale);
    }
    
}
