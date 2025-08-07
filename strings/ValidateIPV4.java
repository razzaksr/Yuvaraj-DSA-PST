package strings;

import java.util.StringTokenizer;

public class ValidateIPV4 {
    public static boolean isValidIp(String ip){
        StringTokenizer tokenizer = new StringTokenizer(ip,".");
        int size = tokenizer.countTokens();
        if(size!=4)
            return false;
        while(tokenizer.hasMoreTokens()){
            String portion = tokenizer.nextToken();
            int current = Integer.parseInt(portion);
            if(current<0||current>255||!(String.valueOf(current).equals(portion)))
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(isValidIp("222.111.111.111"));
        System.out.println(isValidIp("5555..555"));
        System.out.println(isValidIp("0.0.0.0255"));
        System.out.println(isValidIp("111..111.111"));
    }
}
