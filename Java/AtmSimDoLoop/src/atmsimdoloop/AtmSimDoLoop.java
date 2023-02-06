/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package atmsimdoloop;
import java.util.Scanner;

/**
 *
 * @author samlasker
 */
public class AtmSimDoLoop {

    static double balance = 300.00;

    //instance method deposit
    public static void deposit(double amount){
        balance += amount;
        display();
    }

    //instance method display
    public static void display(){
        System.out.printf("Your current balance is $%2.2f\n",balance);
    }

    public static void withdraw(double amount){
        if(amount>balance){
            System.out.printf("Insufficient Funds. Your current balance is $%2.2f",balance);
        }
        else{
            balance-= amount;
            display();
        }
    }

    // main method
    public static void main(String []args){
        int choice;
        
        Scanner sc = new Scanner(System.in);

        do{

            System.out.println("Enter the number of your desired transaction type.");

            System.out.println("1) Balance");

            System.out.println("2) Deposit");

            System.out.println("3) Withdrawl");

            System.out.println("4) Exit");

            choice = sc.nextInt();

            switch(choice){
                case 1: display();

                break;

                case 2:System.out.println("Enter the amount to deposit");

                double amount = sc.nextDouble();

                deposit(amount);

                break;

                case 3:System.out.println("Enter the amount of the withdrawl");

                double amount1 = sc.nextDouble();

                withdraw(amount1);

                break;

                case 4: return;

                default: System.out.println("Invalid input, try again");
            }

        }
        while(choice!=4);

}
    
}
