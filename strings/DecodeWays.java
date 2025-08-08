package strings;

public class DecodeWays {
    public static int ways(String source){
        if(source==null||source.length()==0||source.charAt(0)=='0')
            return 0;
        int alpha = 1, beta = 1;
        for(int index = 1;index < source.length(); index++){
            int current = 0;
            // single char poss
            if(source.charAt(index)!='0')
                current+=beta;
            // two char poss
            String subString = source.substring(index-1, index+1);
            int converted = Integer.parseInt(subString);
            if(converted>=10&&converted<=26){
                current+=alpha;
            }
            alpha = beta;
            beta = current;
        }
        return beta;
    }
    public static void main(String[] args) {
        String nums = "226";
        System.out.println(ways(nums));
    }
}
