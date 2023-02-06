package averagecalculator;
import java.util.Scanner;
/**
 *
 * @author samlasker
 */
public class AverageCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();
        double num3 = sc.nextDouble();
        
        double avg = (num1 + num2 + num3)/3;
        
        System.out.print("The average of the numbers ");
        System.out.printf("%.2f", num1);
        System.out.print(", ");
        System.out.printf("%.2f", num2);
        System.out.print(", and ");
        System.out.printf("%.2f", num3);
        System.out.print(" is: ");
        System.out.printf("%.2f", avg);

    }
    
}
