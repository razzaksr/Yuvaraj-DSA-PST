package arrays;

import java.util.Hashtable;

public class TwoSum {
    public static void main(String[] args) {
        Hashtable<Integer,Integer> table = new Hashtable<>();
        int[] arr = {2, 7, 11, 15}; int target = 13;
        for(int index = 0; index < arr.length; index++){
            int key = target - arr[index];
            if(table.containsKey(key)){
                System.out.println("["+key+","+arr[index]+"]");
                break;
            }
            table.put(arr[index], table.getOrDefault(arr[index], 0)+1);
        }
    }
}
