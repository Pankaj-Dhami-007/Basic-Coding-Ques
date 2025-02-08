
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicateArraylist {
    static ArrayList<Integer> removeDuplicates(List<Integer> list){

        Set<Integer> set = new HashSet<>(list);

        return new ArrayList<>(set);
    }
    public static void main(String[] args) {
        List<Integer> list = 
        Arrays.asList(1, 1, 2, 3, 3, 4, 5);
        ArrayList<Integer> uniqueList = removeDuplicates(list);
        System.out.println("ArrayList with duplicates removed:");
         for (int num : uniqueList) {
         System.out.print(num + " ");
         }
    }
}
