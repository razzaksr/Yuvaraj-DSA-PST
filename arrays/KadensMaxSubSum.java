package arrays;

public class KadensMaxSubSum {
    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int preSum = arr[0], maxSum = arr[0];
        for(int index = 1; index < arr.length; index++){
            preSum = Math.max(arr[index], (preSum+arr[index]));
            maxSum = Math.max(maxSum, preSum);
        }
        System.out.println(maxSum);
    }
}
