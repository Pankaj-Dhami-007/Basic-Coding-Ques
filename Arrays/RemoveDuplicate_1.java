
import java.util.HashSet;
import java.util.Set;

class RemoveDuplicate_1{
    static int[] removeDuplicate(int arr[]){
        Set<Integer> set = new HashSet<>();
        for(int num : arr){
            set.add(num);
        }

        int[] result = new int[set.size()];
        int i = 0;
        for(int num : set){
            result[i++] = num;
        }
        return  result;
    }
    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 2, 2, 3, 4, 4, 5, 5};
        int[] uniqueArray = removeDuplicate(nums);
        for(int num : uniqueArray){
            System.out.print(num+" ");
        }
    }
}