
package averagewithmethods;
import java.util.*;
/**
 *
 * @author samlasker
 */
public class AverageWithMethods {

    static String getNums(){
        Scanner obj = new Scanner(System.in);

        String arc = obj.nextLine();

        return arc;

     }
    
    static double avg(String str){
        String a[] = str.trim().split(" ");

        double sum = 0;

        for(int i = 0; i < a.length; i++){

            sum = sum + Double.parseDouble(a[i]);

        }

        return sum / a.length;
     }
    
    static void printFinal(String str, double avg){
        System.out.format("The average of the numbers %s" + " is %.2f\n", str, avg);
     }

    public static void main(String[] args) {
        System.out.println("Enter 5 to 10 integers:");

        String str = getNums();

        int len = str.trim().split(" ").length;

        if (len < 4 || len > 9){
            System.out.println("The integers are not between 5 to 10. Try again!");
            return;
        }

        double avg = avg(str);

        printFinal(str, avg);

    }
    
}
