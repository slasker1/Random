package patternmaker;
import java.util.Scanner;
/**
 *
 * @author samlasker
 */
public class PatternMaker {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int row,column;
        boolean isFirst=true;
        String first,second,separator;
        
        Scanner input=new Scanner(System.in);

        System.out.println("Enter number of rows:");
        row=input.nextInt();
        System.out.println("Enter number of columns:");
        column=input.nextInt();
        System.out.println("Enter first string:");
        first=input.next();
        System.out.println("Enter second string:");
        second=input.next();
        System.out.println("Enter separator:");
        separator=input.next();
    
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                if(isFirst){
                    System.out.print(first);
                    isFirst=false;
                }
                else{
                    System.out.print(second);
                    isFirst=true;
                }
                if(j!=column-1)
                    System.out.print(separator);
                }
            System.out.println("");
        }
        
        
    }
    
}
