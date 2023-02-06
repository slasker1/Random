package weightedavgdropsmallest;
import java.util.Scanner;
import java.util.Collections;
import java.util.ArrayList;
/**
 *
 * @author samlasker
 */
public class WeightedAvgDropSmallest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Double> userNumbers = getNumbers();

        int numbersToDrop = numToDrop();

        double weight = getWeight();

        double weightedAvg = weightAvgCalc(userNumbers, numbersToDrop, weight);

        printResults(userNumbers, numbersToDrop, weight, weightedAvg);

    }

    public static int numToDrop(){

        Scanner myScan = new Scanner(System.in);

        System.out.println("Enter the number of lowest numbers to drop: ");

        return myScan.nextInt();

    }

    public static double getWeight(){

        Scanner myScan = new Scanner(System.in);

        System.out.println("Enter weight: ");

        return myScan.nextDouble();

    }

    public static void printResults(ArrayList<Double> userNumbers, int numbersToDrop, double weight, double weightedAvg){

        System.out.println("The weighted average of the numbers is "+

        weightedAvg+", when using the data "+userNumbers+" where "+weight+" is the weight used, and the average is computed after dropping the lowest "+numbersToDrop+" values. ");

    }

    public static ArrayList<Double> getNumbers() {

        Scanner myScan = new Scanner(System.in);

        System.out.print("Enter 5 to 10 numbers all on one line separated by spaces: ");

        String numberLine = myScan.nextLine();

        Scanner numbers = new Scanner(numberLine);

        ArrayList<Double> numberList = new ArrayList<>();

        while (numbers.hasNextDouble()) {

            numberList.add(numbers.nextDouble());

        }

        return numberList;

    }

    public static double weightAvgCalc(ArrayList<Double> numList, int numToDrop, double weight){

        double weightedAvg = 0.0;

        ArrayList<Double> finNumList = new ArrayList<>(numList);

        Collections.sort(finNumList);

        double sum = 0.0;

        for (int i = numToDrop; i < finNumList.size(); i++) {

            sum += finNumList.get(i);

        }

        if( (finNumList.size()-numToDrop) > 0) {

            weightedAvg = weight* (sum/ (finNumList.size()-numToDrop));

        }

        return weightedAvg;

    }    
    
}
