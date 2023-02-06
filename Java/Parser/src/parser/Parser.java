package parser;
import java.util.ArrayList;
/**
 *
 * @author samlasker
 */
public class Parser {
    public static void main(String[] args) {
        String s = input();
        ArrayList<Integer> myList = getList(s);
        printOut(myList);
    }
    
    public static String input() {
        java.util.Scanner in = new java.util.Scanner(System.in);
        System.out.println("Please enter a string with commas in between:");
        String s = in.nextLine();
        return s;
    }
    public static ArrayList<Integer> getList(String s){
        //split the string
        String values[] = s.split(",");
        ArrayList<Integer> myList = new ArrayList<Integer>();
        for(int i=0; i<values.length; i++){
            myList.add(Integer.parseInt(values[i].trim()));
        }
        return myList;
    }
    public static void printOut(ArrayList<Integer> myList){
        System.out.println("String delimiter output:");
        for(int i=0; i<myList.size(); i++)
            System.out.println(myList.get(i));
      
   }
    
}
