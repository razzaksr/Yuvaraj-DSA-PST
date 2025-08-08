package recursions;

public class LoopAlternative {
    public static void view(int[] arr){
        for(int index = 0; index<arr.length; index++){
            System.out.print(arr[index]+" ");
        }
        System.out.println();
    }
    public static void viewByRecursion(int[] arr, int index){
        if(index==arr.length||arr.length==0){
            System.out.println();
            return;
        }
        System.out.print(arr[index]+" ");
        viewByRecursion(arr, index+1);
    }
    public static void main(String[] args) {
        int[] arr = {900,20,450,210,60};
        view(arr);
        viewByRecursion(arr, 0);
    }
}
