/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heights2;
import java.util.Scanner;
/**
 *
 * @author Mr Porcupine
 */
public class Heights2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numStudents;
        double [] heights;
        System.out.println("How many students do you have?");
        numStudents = in.nextInt();
        heights = new double [numStudents];
        for (int i = 0; i < numStudents; i++)
        {
          System.out.println("Enter height: " );
          heights [i] = in.nextDouble();
        }
        double maxHeight = heights[0];
        for (int i = 1; i < heights.length; i++)
        {
          if (maxHeight < heights [i])
              maxHeight = heights [i];
        }
        double total = 0;
        for (int i =0; i < heights.length; i++)
        {
            total += heights[i];
        }
        System.out.println("The tallest student is: " + maxHeight + " inches");
        System.out.println("The average height for all students is : " + (total/numStudents)
        + " inches");
        
    }
    
    
}
