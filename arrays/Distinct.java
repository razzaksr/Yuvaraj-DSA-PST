package arrays;

public class Distinct {
    public static void main(String[] args) {
        // int[] arr = {131, 11, 48};
        int[] arr = {111, 222, 333, 4444, 666};
        boolean[] digits = new boolean[10];
        for(int each:arr){
            while(each>0){
                int current = each%10;
                digits[current] = true;
                each/=10;
            }
        }
        for(int index = 0;index<digits.length;index++){
            if(digits[index])
                System.out.println(index);
        }
    }
}
