package passwordchecker;
import static java.lang.Character.isDigit;
import static java.lang.Character.isUpperCase;
import java.util.Scanner;
/**
 *
 * @author samlasker
 */
public class PasswordChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a password: ");
        String inputPassword = scanner.next();
        if(inputPassword.length()==3){
            if(isUpperCase(inputPassword.charAt(0)) ||isUpperCase(inputPassword.charAt(1))||isUpperCase(inputPassword.charAt(2))){
                if(isDigit(inputPassword.charAt(0)) ||isDigit(inputPassword.charAt(1))||isDigit(inputPassword.charAt(2))){
                    System.out.print("The provided password is valid.");
                }
                else
                    System.out.print("The provided password is invalid because it must be three characters long, include at least one digit, and at least one uppercase character.");
                }
            else
                System.out.print("The provided password is invalid because it must be three characters long, include at least one digit, and at least one uppercase character.");
            }
        else
            System.out.print("The provided password is invalid because it must be three characters long, include at least one digit, and at least one uppercase character.");
    }
    
}
