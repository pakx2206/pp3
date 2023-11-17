public class MyArrays {
    
    public static int odd(int[] array){
        int sum = 0;
        for(int i=0;i<array.length;i++)
        {
            if(array[i]%2==1 && array[i]>0)
            {
                sum++;
            }
        }
        return sum;
    }

    public static int above(int[] array){
        
        double sum = 0;
        
        for(int i=0;i<array.length;i++){
            sum += array[i];
        }

        double x = sum / (double)array.length;

        int aboveSum = 0;
        
        for (int i=0;i<array.length;i++){
            if (array[i]>x)
            {
                aboveSum +=array[i];
            }
        }
        return aboveSum;
    }



    public static void main(String[] args) {
        int[] arr1 = {3,2,-5,4,1,-7};
        int[] arr2 = {5,2,7,4,2};
        System.out.println("Number of positive odds: "+MyArrays.odd(arr1));
        System.out.println("Sum of number that are above mean: "+MyArrays.above(arr2));
    }
}
