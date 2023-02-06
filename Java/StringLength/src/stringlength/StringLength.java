package stringlength;
import java.util.Scanner;
/**
 *
 * @author samlasker
 */
public class StringLength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String string1 = sc.nextLine();
        System.out.print("Your string has a length of " + string1.length() + " characters.");
    }
}
