package arrays;

public class PrimeBoundry {
    public static void main(String[] args) {
        // int[] source = {3, 5, 7};
        // int[] dest = {10, 15, 20};
        int[] source = {4, 6, 8};
        int[] dest = {5, 10, 15};
        for(int index = 0; index<source.length;index++){
            int divider = dest[index]-source[index];
            if(divider>0&&TwistedPrime.checkPrime(divider)&&divider>source[index])
                System.out.print(divider+" ");
            else
                System.out.print("-1 ");
        }
        System.out.println();
    }
}
