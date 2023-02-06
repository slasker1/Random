/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rooter;
import java.text.DecimalFormat;
import java.util.Scanner;
/**
 *
 * @author samlasker
 */
public class Rooter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in); // Reading from System.in

        int numCheck = -1;

        do {
            System.out.print("Please enter a positive integer: ");
            if (myScanner.hasNextInt()){
                numCheck = myScanner.nextInt();
            }else {
                System.out.println("You did not enter a positive integer, please try again.");
                myScanner.nextLine();
            }
        } while (numCheck <= 0);

        myScanner.close();

        DecimalFormat df = new DecimalFormat("#.####");

        for(int i = numCheck; i>=0; i--){
            System.out.println(df.format(Math.sqrt(i)));

        }
        
    }
    
}
