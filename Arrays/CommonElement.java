
import java.util.HashSet;
import java.util.Set;

class CommonElement {

    static Set<Integer> findCommonElement(int arr1[], int arr2[]) {

        Set<Integer> set1 = new HashSet<>();
        Set<Integer> commonSet = new HashSet<>();
        for(int num : arr1){
            set1.add(num);
        }

        for(int num : arr2){
            if(set1.contains(num)){
                commonSet.add(num);
            }
        }
return commonSet;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {4, 5, 6, 7, 8};
        Set<Integer> commonElements = findCommonElement(arr1, arr2);
        System.out.println("Common Elements: "+commonElements);
    }
}
