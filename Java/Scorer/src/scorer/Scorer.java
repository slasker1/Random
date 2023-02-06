package scorer;
import java.util.Scanner;
/**
 *
 * @author samlasker
 */
public class Scorer {

    public static void main(String[] args) {
        double scores[][] = new double[3][3];
        scoring(scores);
        double averages[] = new double[3];
        getAvg(averages,scores);
        printAvg(averages);
    }
    
    private static void printAvg(double[] averages) {
        for(int i=0;i<3;i++){
            System.out.println("The average of row "+(i+1)+" is "+averages[i]);

        }
    }

    private static void getAvg(double[] averages, double[][] scores) {
        double sum=0;

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                sum+=scores[i][j];
            }
            
            averages[i]=sum/3;

            sum=0;
        }
    }

    private static void scoring(double[][] scores) {

        int i=0,j=0;

        int count=1;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 9 doubles");

        while(i<3){

            j=0;

            while(j<3){

                System.out.println("Input value"+count + ": ");

                scores[i][j]=sc.nextDouble();

                j++;

                count++;

            }

            i++;

        }
    }
}
