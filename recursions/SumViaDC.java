package recursions;

import java.util.Arrays;

public class SumViaDC {
    public static int findSum(int[] arr){
        if(arr.length==1)
            return arr[0];
        return arr[0]+findSum(Arrays.copyOfRange(arr, 1, arr.length));
    }
    public static void main(String[] args) {
        int[] arr = {900,20,450,210,60};
        System.out.println(findSum(arr));
    }
}
