package arrays;

import java.util.Arrays;

public class ThreeSum {
    public static void main(String[] args) {
        int[] arr={-1, 0, 1, 2, -1, -4};
        int size = arr.length;
        if(size<3){
            System.out.println(Arrays.toString(arr));
            return;
        }
        Arrays.sort(arr);
        // System.out.println(Arrays.toString(arr));
        for(int index = 0;index < size-2; index++){
            // if(arr[index]==arr[index+1])continue;
            if(arr[index]>0)break;
            if(index>0&&arr[index]==arr[index-1]) continue;
            int left = index+1, right = size-1;
            while(left<right){
                int sum = arr[index]+arr[left]+arr[right];
                if(sum==0){
                    System.out.print(Arrays.asList(arr[index],arr[left],arr[right])+" ");
                    while(left<right&&arr[left]==arr[left+1]){left++;}
                    while(left<right&&arr[right]==arr[right-1]){right--;}
                    left++;right--;
                }
                else if(sum<0) left++;
                else right--;
            }
        }
        System.out.println();
    }
}
