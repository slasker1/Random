package minmax;

/**
 *
 * @author samlasker
 */
public class MinMax {
    public static void main(String[] args){
        double[] inputarray = new double[5];
        getArray(args,inputarray);
        findMaxMin(inputarray);
    }
    
    private static void getArray(String[] args, double[] inputarray){
        System.out.println("The array is:");

        for(int i=0;i<args.length;i++){
            inputarray[i]=Double.parseDouble(args[i]);

            System.out.print(args[i]+" ");
        }
   }

   public static void findMaxMin(double[] arr){
        double max, min;
        max = arr[0];
        min = arr[0];

        for(int i = 1; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
            if(arr[i] < min){
                min = arr[i];
            }
        }

        System.out.println("\n\nHighest number in the array is: "+ max);
        System.out.println("Smallest number in the array is: "+ min);
    }
}
