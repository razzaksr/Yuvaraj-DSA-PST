package arrays;

public class ChargesOnDebit {
    public static void main(String[] args) {
        int[] arr = {900,1200,5600,120,45,670,100,10,400,120};
        int count = 0;
        for(int index=1;index<arr.length;index++){
            if(arr[index]<arr[index-1])
                count++;
        }
        count-=3;// threshold = 3
        if(count>0){
            arr[arr.length-1] -= (count*24);
            System.out.println(arr[arr.length-1]);
        }
    }
}
