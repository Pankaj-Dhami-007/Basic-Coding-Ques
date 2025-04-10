
import java.util.HashSet;
import java.util.Set;

public class IntersectionOfArrays {
    static int findIntersection(int[] arr1, int[] arr2){
        Set<Integer> set = new HashSet<>();
        for(int num : arr1){
            set.add(num);
        }
        int count =0;
        for(int num : arr2){
            if(set.contains(num)){
                count++;
                set.remove(num); // to avoid counting duplicates in arr2
            }

        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 2, 1};
        int[] arr2 = {2, 2};
        System.out.println("Intersection: " + findIntersection(arr1, arr2));
    }
}
