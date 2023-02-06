/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phonenumberconversion;

import java.util.Scanner;

/**
 *
 * @author samlasker
 */
public class PhoneNumberConversion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a ten-digit phone number: ");
        
                
        String phoneNum = sc.nextLine();
        String threeDigit = phoneNum.substring(0, 3);
        String finDigits = phoneNum.substring(3, phoneNum.length());
        String midDigit = finDigits.substring(0, 3);
        String lastDigit = finDigits.substring(3, finDigits.length());

        System.out.println("(" + threeDigit + ")" + midDigit + "-" + lastDigit);
    }
    
}
