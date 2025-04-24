
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesFromSortedArr {

    static int[] removeDuplicatesUnsortedArr(int arr[]){
        Set<Integer> set = new HashSet<>();
        for(int num : arr){
            set.add(num);
        }

        int[] r = new int[set.size()];

        int i =0;
        for(int n : set){
            r[i] = n;
            i++;
        }
        return r;
    }
    static int removeDuplicates(int arr[]){
        if(arr.length == 0) return 0;
        int i =0;
        for(int j =1; j< arr.length; j++){
            if(arr[j] != arr[i]){
                i++;
                arr[i] = arr[j];
            }
        }
        return i+1;
    }
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 3, 4, 4, 5};
        int length = removeDuplicates(arr);

        System.out.print("Array after removing duplicates: ");
        for (int i = 0; i < length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        int[] unique = removeDuplicatesUnsortedArr(arr);
        for (int num : unique) {
            System.out.print(num + " ");
        }

    }
}
