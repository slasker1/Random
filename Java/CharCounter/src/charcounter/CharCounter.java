package charcounter;
import java.util.Scanner;
/**
 *
 * @author samlasker
 */
public class CharCounter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner inScanner= new Scanner(System.in);
        String inputEntry, inputCharacter;
        int count=0;
        

        System.out.println("Enter the string:");
        inputEntry = inScanner.nextLine();
      
        System.out.println("Enter the character:");
        inputCharacter = inScanner.nextLine();
        int len = inputCharacter.length();
        
        
        if(len!=1){
            System.out.println("Sorry the length of inputCharacter is not 1");
            System.exit(0);
        }
        else{
            char ch=inputEntry.charAt(inputEntry.indexOf(inputCharacter));
            int i=0;
            while( i<inputEntry.length()){
                if( inputEntry.charAt(i) == ch ){
                    count=count+1;
                }
                i++;
            }
      
        System.out.println("There is " + count + " occurance(s) of '" + inputCharacter +"' in test.");

    }
    
    
}
