package incometax;
import java.util.Scanner;
/**
 *
 * @author samlasker
 */
public class IncomeTax {
    public static void main(String[] args) {
        final int singLower = 15;
        final int singHigher = 25;
        final int marriedLow = 12;
        final int marriedHigh = 20;
        int maritalStatus, boundary = 0;
        double income, tax;
        String maritalStatStr = "placeholder";
        
        Scanner scnr = new Scanner(System.in);

        System.out.println("Enter your marital status: (Single or Married)");
        System.out.println("1.Single\n2.Married");

        maritalStatus = scnr.nextInt();

        System.out.print("Enter your Income: ");
        income = scnr.nextDouble();
 
        if (maritalStatus == 1) {
            maritalStatStr = "single";
            // income seperation checker
            if (income <= 30000) {
                boundary = singLower;
            } else {
                boundary = singHigher;
            }
        } 
        else if (maritalStatus == 2) {
            maritalStatStr = "married";
            if (income <= 30000) {

            boundary = marriedLow;
            } 
            else {
            boundary = marriedHigh;
            }
        } 
        else {
            System.out.println("Invalid choice");
            //exit if invalid choice
            System.exit(1);
        }

        //tax calculation
        tax = income * boundary / 100;
        System.out.print("Based on a marital status of " + maritalStatStr + " and an annual income of " + "$");
        System.out.printf("%.2f", income);
        System.out.println("\nthe income tax is " + boundary + "% of $" + income + ", which equals $" + tax + ".");
        
    }
    
}
