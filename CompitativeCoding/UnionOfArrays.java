
import java.util.HashSet;
import java.util.Set;

public class UnionOfArrays {
    static int findUnion(int arr1[], int arr2[]){

        Set<Integer> set = new HashSet<>();
        for(int num : arr1){
            set.add(num);
        }
        for(int num : arr2){
            set.add(num);
        }
        return set.size();
    }
    public static void main(String[] args) {
        
        int[] arr1 = {1, 2, 2, 1};
        int[] arr2 = {2, 3, 4};
        System.out.println("Intersection: " + findUnion(arr1, arr2));;
    }
}
