package stringslicer;
import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author samlasker
 */
public class StringSlicer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String myStr = getString();

        ArrayList<Character> charsArray = getArray(myStr);

        printChars(charsArray);
    }
    
    public static String getString() {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a string: ");

        String s = scan.nextLine();

        return s;

    }

    public static ArrayList<Character> getArray(String userStr) {

        ArrayList<Character> myList = new ArrayList<Character>();

        for(int i=0; i<userStr.length(); i++){

            myList.add(userStr.charAt(i));

        }

    return myList;

    }

    public static void printChars(ArrayList<Character> chars) {

        for(int i=0; i<chars.size(); i++){

            System.out.println(chars.get(i));

        }

    }
    
}
