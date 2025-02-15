
import java.util.HashSet;
import java.util.Set;

public class Xyz {
    static Set<Integer> findCommonElement(int arr1[], int arr2[]){
        Set<Integer> set = new HashSet<>();
        Set<Integer> commonSet = new HashSet<>();
        for(int num : arr1){
            set.add(num);
        }

        for(int num : arr2){
            if(set.contains(num)){
                commonSet.add(num);
            }
        }
        return commonSet;
    }
    public static void main(String[] args) {
        int arr1[] = {1, 2, 3, 4, 5, 6};
        int arr2[] = {5, 6, 7, 8, 9};
        Set<Integer> commonElement = findCommonElement(arr1, arr2);
        System.out.println(commonElement);

    }
}
