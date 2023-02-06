package recursivetriangle;
import java.util.Scanner;
/**
 *
 * @author samlasker
 */
public class RecursiveTriangle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numLines = getNumber();

        String pattern = getStr();

        printTriangle (numLines, pattern);
    }
    
    public static void printTriangle (int numLines, String pattStr) {

        if(numLines == 0) {

            return;

        } else {

            printRow(numLines, pattStr);

            System.out.println();

            printTriangle(numLines-1, pattStr);

        }

    }

    public static void printRow(int numLines, String pattStr) {

        if(numLines == 0) {

            return;

        } else {

            System.out.print(pattStr);

            printRow(numLines-1, pattStr);

        }

    }

    public static int getNumber() {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the number of lines (between 1 and 10): ");

        return scan.nextInt();

    }

    public static String getStr() {

        Scanner myScan = new Scanner(System.in);

        System.out.println("Enter the string used in the pattern: ");

        return myScan.next();

    }
    
}
