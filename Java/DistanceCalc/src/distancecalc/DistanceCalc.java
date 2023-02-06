package distancecalc;
import java.util.Scanner;
/**
 *
 * @author samlasker
 */
public class DistanceCalc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);        
        
        double currGallonsFuel = sc.nextDouble();
        double vehicleMPG = sc.nextDouble();
        double miles;
        
        miles = currGallonsFuel * vehicleMPG;
        
        System.out.print("You are able to travel ");
        System.out.printf("%.2f", miles);
        System.out.print(" miles on remaining fuel.");
    }
    
}
