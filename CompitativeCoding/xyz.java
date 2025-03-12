import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class xyz {
    static List<List<Integer>> uniquePairs(int arr[], int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(arr); // Ensure the array is sorted
        int left = 0;
        int right = arr.length - 1;
        
        while (left < right) {
            int sum = arr[left] + arr[right];
            if (sum == target) {
                result.add(Arrays.asList(arr[left], arr[right]));
                
                // Skip duplicate elements for left pointer
                while (left < right && arr[left] == arr[left + 1]) {
                    left++;
                }
                
                // Skip duplicate elements for right pointer
                while (left < right && arr[right] == arr[right - 1]) {
                    right--;
                }
                
                left++;
                right--;
            } else if (sum > target) {
                right--;
            } else {
                left++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int nums[] = {1, 2, 2, 3, 3, 4, 5};
        List<List<Integer>> ans = uniquePairs(nums, 5);
        for (List<Integer> pairs : ans) {
            System.out.print(pairs + " ");
        }
    }
}