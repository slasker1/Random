package checkstring;
import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author samlasker
 */
public class CheckString {
    
    public static void checkWord(String word) throws Exception {
        if(Character.isLetter(word.charAt(0))){
            return;
        }
        else {
            throw new Exception("This is not a word");
        }
    }
    
    public static String getWord() {
        Scanner myScan = new Scanner(System.in);
        boolean str = true;
        String word = "";
        while(str){
            System.out.println("Enter a Word: ");
            word = myScan.next();
            try{
                checkWord(word);
                str = false;
            }
            catch(Exception e){
                System.out.println(e);
                str = true;
            }
        }
        myScan.close();
        return word;
    }
    
    public static void writeFile(String[] arrayToWrite, String filename) throws IOException {
        FileWriter myWriter = new FileWriter(filename);

        for(int i = 0;i<arrayToWrite.length;i++){
            myWriter.write(arrayToWrite[i]+System.lineSeparator());
        }
        myWriter.flush();
        myWriter.close();
    }
    
    public static ArrayList readFile(String filename) throws FileNotFoundException, IOException {
        ArrayList<String> words = new ArrayList<>();

        File file = new File(filename);

        if(!file.exists()){
            throw new FileNotFoundException("FileNotFoundException");
        }

        Scanner wrdScan = new Scanner(file);

        while(wrdScan.hasNextLine()){
            words.add(wrdScan.nextLine());
        }
        
        wrdScan.close();

        return words;
    }
    
    public static void main(String[] args) {
        System.out.println("Word: " + getWord());
        
        String[] testData = {"lake", "river", "pond"};


        
        try {
            writeFile(testData,"data.txt");
            
            ArrayList<String> wordArray = new ArrayList<>();

            wordArray = readFile("data.txt");
            
            for(int i = 0;i<wordArray.size();i++){
                System.out.println(wordArray.get(i));
            }
        }
        
        catch(FileNotFoundException e){
            System.out.println(e);
        }
        
        catch(IOException e){
            System.out.println("IOException");
        }
    }
    
}
