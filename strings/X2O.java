package strings;

public class X2O {
    public static void main(String[] args) {
        // String board = "XXX";
        // String board = "XXOX";
        String board = "OOOO";
        int count = 0;
        for(int index = 0; index < board.length();){
            if(board.charAt(index)=='X'){
                index+=3;
                count+=1;
            }
            else
                index++;
        }
        System.out.println(count);
    }
}
