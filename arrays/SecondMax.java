package arrays;

public class SecondMax {
    public static void main(String[] args) {
        // int[] arr = {1, 7, 3, 6, 5, 6};
        int[] arr = {11, 30, 9};
        int fMax = Integer.MIN_VALUE, sMax = Integer.MIN_VALUE;
        for(int each: arr){
            if(each>fMax){
                sMax = fMax;
                fMax = each;
            }
            else if(each>sMax&&each!=fMax)
                sMax = each;
        }
        System.out.println(sMax);
    }
}
