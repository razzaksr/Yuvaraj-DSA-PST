package arrays;

import java.util.Arrays;

public class MoveEmptyTrucks {
    public static void main(String[] args) {
        int[] trucks = {20,0,19,5,0,3,10,0,2};
        int valid = 0;
        for(int index = 0; index<trucks.length;index++){
            if(trucks[index]!=0){
                trucks[valid] = trucks[index];
                valid++;
            }
        }
        Arrays.fill(trucks, valid, trucks.length, 0);
        System.out.println(Arrays.toString(trucks));
    }
}
