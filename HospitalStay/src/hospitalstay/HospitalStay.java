/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospitalstay;

import java.util.Scanner;
/**
 *
 * @author Mr Porcupine
 */
public class HospitalStay {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     int nightsInHosptial = 0;
     double labCharge=150.00;
     double medication=35.50;
     double overNightCharge=1000.20;
     double totalCost=0.00;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of nights you stayed: ");
        nightsInHosptial= in.nextInt();
        
        if(nightsInHosptial < 1)
        {
           System.out.println("You owe nothing for over night charges");
           System.out.println("For lab charges you owe $" +labCharge);
           System.out.println("For medication you owe $" +medication);
           totalCost=(labCharge+medication);
           System.out.println("Your total amount due is $" +totalCost);
        }
        else if(nightsInHosptial >= 1)
        {
           
           System.out.println("Your overnight charges you owe $" +overNightCharge + " per day");
           System.out.println("For lab charges you owe $" +labCharge + " per day");
           System.out.println("For medication you owe $" +medication + " per day");
           totalCost=nightsInHosptial*(labCharge+medication+overNightCharge);
           System.out.println("Your total amount due is " +totalCost);
            
        }
        
    }
}

