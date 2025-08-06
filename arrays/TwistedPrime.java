package arrays;

public class TwistedPrime {
    public static boolean checkPrime(int number){
        int divider = number-1;
        while(divider>2){
            if(number%divider==0)
                return false;
            divider--;
        }
        return true;
    }
    public static void main(String[] args) {
        // int number = 97;
        // int number = 43;
        int number = 123;
        int reversed = Integer.parseInt(new StringBuilder().append(number).reverse().toString());
        System.out.println(checkPrime(number)&&checkPrime(reversed));
    }
}
