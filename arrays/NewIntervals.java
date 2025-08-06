package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NewIntervals {
    public static void main(String[] args) {
        // int[][] existing = {{1,2},{3,5},{6,7},{8,10},{12,16}};
        // int[] newInter = {4,8};
        int[][] existing = {{1,3},{6,9}};
        int[] newInter = {2,5};
        int size = existing.length;
        List<int[]> updated = new ArrayList<>();
        // copy
        int index = 0;
        while(index<size&&existing[index][1]<newInter[0]){
            updated.add(existing[index]);
            index++;
        }
        // merging overlapped interval
        int tempMin=Integer.MAX_VALUE,tempMax=Integer.MIN_VALUE;
        while(index<size&&newInter[1]>=existing[index][0]){
            tempMin = Math.min(existing[index][0], Math.min(tempMin, newInter[0]));
            tempMax = Math.max(existing[index][1], newInter[1]);
            index++;
        }
        updated.add(new int[]{tempMin,tempMax});
        // copy remaining
        while(index<size){
            updated.add(existing[index]);
            index++;
        }
        updated.forEach(v->System.out.println(Arrays.toString(v)));
    }
}
