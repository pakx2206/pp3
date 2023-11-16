import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyArray {


    static int even(int[] array){
        int sumEven=0;
        for (int i=0;i<array.length;i++){
            
            if (array[i]%2==0){
                sumEven++;
            }
        }
        return sumEven;
    }


    static int positiveOdd(int[] array){
        int sumOdd = 0;
        for (int i=0;i<array.length;i++){
            if(array[i]>0 && array[i]%2==1){
                sumOdd++;
            }
        }
        return sumOdd;
    }


    static int[] reverse(int[] array){
        int iterator = array.length-1;
        int[] arrayOut = new int[array.length];
        for(int i=0;i<array.length;i++){
            arrayOut[iterator] = array[i];
            iterator--;
        }
        return arrayOut;
    }


    static boolean compare(int[] array1,int[] array2){
        return Arrays.equals(array1, array2);
    }

    static List<Integer> different(int[] array1,int[] array2)
    {
        List<Integer> stack = new ArrayList<Integer>();
        Arrays.sort(array1);
        Arrays.sort(array2);

        for (int i=0;i<array1.length;i++)
        {
            if (array1[i]!=array2[i]){
                stack.add(array1[i]);
            };
        }
        return stack;
    }
    static boolean exist(int number, int[] array)
    {
        for (int i=0;i<array.length;i++){
            if(number==array[i])
            {
                return true;
            }
        }
        return false;
    }
    static int secondMax(int[] array)
    {
        Arrays.sort(array);
        return array[array.length-2];
    }
    static int lastColumn(int[][] array)
    {   
        int sum = 0;
        for (int i=0;i<array.length;i++)
        {
            sum += array[i][array[i].length - 1];
        }
        return sum;

    }
    static int[][] swap(int[][] array)
    {
        int[][] x= new int[array.length][array[0].length];
        for (int i=0;i<array.length;i++)
        {
            x[i][0]=array[i][array[i].length-1];
            x[i][array[i].length-1]=array[i][0];
            for (int j = 1; j < array[i].length - 1; j++) {
            x[i][j] = array[i][j];
        }
        }
        
        return x;
    }
    static int[] two2one(int[][] array)
    {

        int[] x = new int[(array.length*array[0].length)];

        int iterator = 0;

        for(int i=0;i<array.length;i++)
        {
            for (int y=0;y<array[i].length;y++)
            
            {
                
                x[iterator] = array[i][y];
                iterator++;
                
            }
        }
        return x;
    }

    
    
        
    
}
