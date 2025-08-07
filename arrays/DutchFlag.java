package arrays;

import java.util.Arrays;

public class DutchFlag {
    public static void main(String[] args) {
        int[] arr={2,0,0,1,0,2,0,1};
        int left = 0, index = 0, right = arr.length-1;
        while(index<=right){
            if(arr[index]==0){
                arr[index]+=arr[left];
                arr[left] = arr[index] - arr[left];
                arr[index] -= arr[left];
                index++;left++;
            }
            else if(arr[index]==1)
                index++;
            else{
                arr[right]+=arr[index];
                arr[index] = arr[right] - arr[index];
                arr[right] -= arr[index];
                right--;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
