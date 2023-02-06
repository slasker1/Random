package ecommerceapp;
import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author samlasker
 */
public class ECommerceApp {
    public static String productsBuilder (){
        return "Table, Desk, Pen ";
    }

    public static boolean getOrder(String name){
        return productsBuilder().contains(name);
    }

    public static double getPrice(){
        Random rand = new Random();

        return rand.nextInt((100 - 1) + 1) + 1;
    }

    public static double getTax(double price){
        return (price*10.0)/100.0;
    }

    public static double getTotal(double price, double tax){
        return price + tax;
    }

    public static void printTotal(double total){
        System.out.println(String.format("Your sale total is: $%.2f", total));
    }
    public static void main(String[] args) {
        System.out.println("******************************************\r\n" +

        "====== Welcome to my eCommerce app! ======\r\n" +

        "******************************************\n");

        String productsCatalog = productsBuilder();

        System.out.print("Enter the product name for order : ");

        String ordername = new Scanner(System.in).next();

        if(getOrder(ordername)){

            double price = getPrice();

            double tax= getTax(price);

            double total_sale= getTotal(price, tax);

            printTotal(total_sale);

        }

        else

            System.out.println("The product was not found.");
        }
    
}
