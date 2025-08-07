package strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Hashtable;
import java.util.List;

public class GroupAnagrams {
    public static void main(String[] args) {
        String[] arr = {"eat","tea","tan","ate","nat","bat"};
        Hashtable<String, List<String>> table = new Hashtable<>();
        for(int index = 0; index<arr.length;index++){
            char[] temp = arr[index].toCharArray();
            Arrays.sort(temp);
            String each = new String(temp);
            if(!table.containsKey(each))
                table.put(each, new ArrayList<>());
            table.get(each).add(arr[index]);
        }
        System.out.println(table.values());
    }
}
