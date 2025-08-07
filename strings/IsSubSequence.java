package strings;

public class IsSubSequence {
    public static void main(String[] args) {
        // String alpha = "tcs";
        // String beta = "tata service";
        String alpha = "infy";
        String beta = "infosys";
        int index=0, compare = 0;
        int sizeAlpah = alpha.length(), sizeBeta = beta.length();
        while(index<sizeAlpah&&compare<sizeBeta){
            if(alpha.charAt(index)==beta.charAt(compare)){
                index++;
            }
            compare++;
        }
        System.out.println((index==sizeAlpah)?"1":"0");
    }
}
