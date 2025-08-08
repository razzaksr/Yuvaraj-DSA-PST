package recursions;

public class ClimbingStairsViaDC {
    public static int steps(int stairCase){
        if(stairCase<=0) return 0;
        else if(stairCase==1) return 1;
        else if(stairCase==2) return 2;
        else return steps(stairCase-1)+steps(stairCase-2);
    }
    public static void main(String[] args) {
        System.out.println(steps(4));
        System.out.println(steps(5));
        System.out.println(steps(8));
        System.out.println(steps(1));
        System.out.println(steps(-4));
    }
}
