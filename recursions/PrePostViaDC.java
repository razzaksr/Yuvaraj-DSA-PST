package recursions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PrePostViaDC {
    public static void preFixSum(Integer[] arr, int[] fix){
        // System.out.println(Arrays.toString(arr)+"\n"+Arrays.toString(fix));
        if(arr.length==1)
            fix[0] = arr[0];
        else{
            preFixSum(Arrays.copyOfRange(arr, 1, arr.length), fix);
            fix[arr.length-1]=arr[0]+fix[arr.length-2];
        }
    }
    public static void postFixSum(Integer[] arr, int[] fix){
        // System.out.println(Arrays.toString(arr)+"\n"+Arrays.toString(fix));
        if(arr.length==1)
            fix[fix.length-1] = arr[0];
        else{
            postFixSum(Arrays.copyOfRange(arr, 1, arr.length), fix);
            fix[fix.length - arr.length]=arr[0]+fix[fix.length-arr.length+1];
        }
    }
    public static void main(String[] args) {
        Integer[] arr = {23,12,98,45,18,45,12,98};
        int[] fix = new int[arr.length];
        // post fix
        postFixSum(arr,fix);
        System.out.println("Postfix Sum\n"+Arrays.toString(fix));
        List<Integer> collected = new ArrayList<>();
        Arrays.stream(arr).forEach(v->collected.add(v));
        Collections.reverse(collected);
        collected.toArray(arr);
        preFixSum(arr,fix);
        System.out.println("Prefix Sum\n"+Arrays.toString(fix));
    }
}
