package multitable;

/**
 *
 * @author samlasker
 */
public class MultiTable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int vert, horiz, sum;

        System.out.printf("* |%3d%3d%3d%3d%3d%3d%3d%3d%3d\n",1,2,3,4,5,6,7,8,9);

        System.out.println("--------------------------------");

        for(vert=1; vert<=9;++vert){
            System.out.print(vert+" |");
            for(horiz=1;horiz<=9;++horiz){
                sum=vert*horiz;
                System.out.printf("%3d",sum);
            }
            System.out.println();
        }
    
    
    }
    
}
