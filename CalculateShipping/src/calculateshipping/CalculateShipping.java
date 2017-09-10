/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculateshipping;
import java.util.Scanner;
/**
 *
 * @author Mr Porcupine
 */
public class CalculateShipping {


  
    public static void main(String[] args) {
    double totalSale=0;
    Scanner in = new Scanner (System.in);
    System.out.println("Enter total for the sale: ");
    totalSale = in.nextDouble();
    if (totalSale < 25)
    {
        totalSale = totalSale + 15;
    }
    else if(totalSale < 50)
            {
                totalSale = totalSale + 10;
            }
    else if (totalSale <= 75)
    {
        totalSale = totalSale + 5;
    }
    System.out.println("The cost for your sale is " + totalSale);
    }
    
}
