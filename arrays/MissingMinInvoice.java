package arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MissingMinInvoice {
    public static void main(String[] args) {
        // int[] arr = {45,91,90,92,46};
        // int[] arr = {8,10,3,1,4,2,5};
        int[] arr = {0,1,2,4,5,6,7};
        List<Integer> invoices = new ArrayList<>();
        for(int each:arr){invoices.add(each);}
        int min = Collections.min(invoices);
        Set<Integer> sets = new HashSet<>(invoices);
        while(true){
            if(!sets.contains(min)){
                System.out.println(min);
                break;
            }
            min++;
        }
    }
}
