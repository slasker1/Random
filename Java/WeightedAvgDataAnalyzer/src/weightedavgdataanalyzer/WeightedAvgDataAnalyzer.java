package weightedavgdataanalyzer;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
/**
 *
 * @author samlasker
 */
public class WeightedAvgDataAnalyzer {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);

        boolean bool = false;

        while (!bool) {

            try {

                System.out.print("Enter the input file-name: ");

                String fileName = myScan.next();

                ArrayList<Double> arl=readFile(fileName);

                double wAvg = weightedAvgCalc(arl);

                System.out.println("Weighted Average = " + wAvg);

                System.out.println("Enter the output file-name: ");
                fileName = myScan.next();

                writeFile(fileName,arl,wAvg);

                bool = true;

            } 
            
            catch (FileNotFoundException exception) {

                System.out.println("File not found exception");

            } 
            
            catch (IOException exception) {

                exception.printStackTrace();

            }

        }

    }

    public static ArrayList<Double> readFile(String fileName) throws IOException{
        Scanner myScan = new Scanner(new File(fileName));
        return readData(myScan);
    }
    
    public static ArrayList<Double> readData(Scanner myScan) throws IOException {
        ArrayList<Double> list =new ArrayList<Double>();
        
        while(myScan.hasNextDouble()){
            double val = myScan.nextDouble();
            list.add(val);
        }
        return list;
    }
    
    public static double weightedAvgCalc(ArrayList<Double> dataList){
        ArrayList<Double> finList = new ArrayList<Double>();

        for(int i=0;i<dataList.size();i++){
            finList.add(dataList.get(i));
        }

        double weight=finList.get(0);
        int drop=finList.get(1).intValue();
        finList.remove(0);
        finList.remove(1);
        Collections.sort(finList);
        
        double weightAvg=0;
        
        for(int i=drop;i<finList.size();i++){
            weightAvg+=finList.get(i);
        }
        
        weightAvg*=weight;
        weightAvg=weightAvg/(finList.size()-drop);
        
        return weightAvg;
  
    }

    public static void writeFile(String outfile, ArrayList<Double> dataList, double weightedAvg) throws FileNotFoundException {

        try (PrintWriter outPrint = new PrintWriter(new FileOutputStream(outfile))) {

            outPrint.printf("The weighted average of the numbers is " + weightedAvg + ", when using the data ");
            
            for(int i=2;i<dataList.size();i++){
                outPrint.printf(dataList.get(i)+", ");
            }
        
            outPrint.printf("where "+dataList.get(0)+" is the weight used, and the average is computed after dropping the lowest "+dataList.get(1)+" values.");
        

        }

    }
    
}
