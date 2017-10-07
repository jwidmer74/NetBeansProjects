/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package randomnumbers2;
import java.util.Random;
/**
 *
 * @author Mr Porcupine
 */
public class RandomNumbers2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int die1, die2, countDoubles = 0;
        Random rand = new Random();
        for (int i = 0;  i <= 100; i++)
        {
            die1 = rand.nextInt(6) + 1;
            die2 = rand.nextInt(6) + 1;
            if (die1 == die2)
            {
                countDoubles++;
            }
        }
        System.out.println("I have rolled " + countDoubles + " doubles");
    }
    
}
