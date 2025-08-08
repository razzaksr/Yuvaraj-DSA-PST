package recursions;

import java.util.Arrays;

public class DCIntro {
    public static int findMin(int[] arr){
        if(arr.length==1)
            return arr[0];
        return Math.min(arr[0], findMin(Arrays.copyOfRange(arr, 1, arr.length)));
    }
    public static void main(String[] args) {
        int[] arr = {900,20,450,210,60};
        System.out.println(findMin(arr));
    }
}
