/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backwardsstrings;
import java.util.Scanner;
/**
 *
 * @author samlasker
 */
public class BackwardsStrings {
    public static void main(String[] args) {
        String firstStr;
        String secondStr;

        Scanner input = new Scanner(System.in);

        firstStr = input.next();
        secondStr = input.next();
        
        if (firstStr.length()!=3 || firstStr.length()!=3){
            System.out.println("Invalid string length for one or both inputs.");
        }
        else{
            System.out.println("The two strings you entered are:" + firstStr + " " + secondStr + ".");

            System.out.println("The two strings in reverse are: "+reverse(secondStr)+" "+reverse(firstStr)+".");
    
        }
    }
    
    public static String reverse(String str){
        String reverse = "";
        int len = str.length();

        for(int i = 0; i<len; i++){
            reverse += str.charAt(len-i-1);
        }
        return reverse;
    }
    
}
