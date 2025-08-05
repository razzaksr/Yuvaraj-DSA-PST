package arrays;

import java.util.Arrays;

public class PivotalIndex {
    public static void main(String[] args) {
        // int[] arr = {1, 7, 3, 6, 5, 6};
        // int[] arr = {-7, 1, 5, 2, -4, 3, 0};
        int[] arr = {0,-3,5,-4,-2,3,1,0};
        int total = Arrays.stream(arr).sum();
        int partSum = 0;
        for(int index = 0; index < arr.length; index++){
            int calculate = total - partSum - arr[index];
            if(partSum==calculate){
                System.out.println(index);
                break;
            }
            partSum+=arr[index];
        }
    }
}
