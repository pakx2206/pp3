import java.util.Arrays;

public class MyArrayTest {
    public static void main(String[] args) {
        int[] array1 = {-1, 2, 3, 4, 5, 6, 7, 8, 9, -10 };
        int[] array2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        System.out.println(MyArray.even(array1));
        System.out.println(MyArray.positiveOdd(array1));
        int[] x = MyArray.reverse(array1);
        System.out.println(Arrays.toString(x));
        System.out.println(MyArray.compare(array1, array2));
        System.out.println(MyArray.different(array1,array2));
        System.out.println(MyArray.exist(-8, array2));
        System.out.println(MyArray.secondMax(array2));
        int[][] arr3 = {{1, 2, 3, 4}, {3, 4, 5, 6}, {1, 4, 2, 2}}; 
        System.out.println((int)MyArray.lastColumn(arr3));
        int[][]xd = MyArray.swap(arr3);
        System.out.println(Arrays.deepToString(xd));
        int[] t2o = MyArray.two2one(arr3);
        System.out.println(Arrays.toString(t2o));
    }
}
