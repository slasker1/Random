package atmsimulator;
import java.util.Scanner;
/**
 *
 * @author samlasker
 */
public class AtmSimulator {

    public static void main(String[] args) {
        double start_balance = 25.00;
        
        Scanner reader = new Scanner(System.in);  // Reading from System.in
        System.out.println("Enter the number of your desired transaction type.\n" +
                            "\n" +
                            "1. Balance\n" +
                            "2. Deposit\n" +
                            "3. Withdrawal\n" +
                            "4. Quit");
        int n = reader.nextInt();
        
        if (n==1){
            System.out.print("Your current balance is $");
            System.out.printf("%.2f", start_balance);
        }
        if (n==2){
            System.out.println("Enter the amount of the deposit");
            double deposit_amt = reader.nextDouble();
            System.out.print("Your current balance is $");
            System.out.printf("%.2f", (start_balance + deposit_amt));
        }
        if (n==3){
            System.out.println("Enter the amount of the withdrawal");
            double withdraw_amt = reader.nextDouble();
            if (withdraw_amt > start_balance){
                System.out.print("Insufficient funds. Your current balance is $");
                System.out.printf("%.2f", start_balance);
            }
            else{
                System.out.print("Your current balance is $");
                System.out.printf("%.2f", (start_balance - withdraw_amt));
        
            }
        }
        if (n==4){
            System.out.print("Good-bye.");
        }
        else{
            System.out.print("Invalid menu choice.");
        }

    }
    
}
