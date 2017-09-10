
package simplecalculation;
import java.util.Scanner;

/**
 *
 * @author Mr Porcupine
 */
public class SimpleCalculation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   double front, back, side1, side2, doors, windows, paintingarea;
   Scanner in = new Scanner(System.in);
   System.out.println("Enter the square area of the front of the house: ");
   front = in.nextDouble();
   System.out.println("Enter the square area of the back of the house: ");
   back = in.nextDouble();
   System.out.println("Enter the square area of the right side of the house: ");
   side1 = in.nextDouble();
   System.out.println("Enter the square area of the left side of the house: ");
   side2 = in.nextDouble();
   System.out.println("Enter the square area of the doors of the house: ");
   doors = in.nextDouble();
   System.out.println("Enter the square area of the windows of the house: ");
   windows = in.nextDouble();
   paintingarea = (front + back + side1 + side2) - (windows + doors);
       System.out.println("Enter the area we need to paint for the house is " + paintingarea);
     
       
    }
    
}
