
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * Question: Given an array of integers, find all unique pairs of elements that sum up to a target value. Ensure that each pair appears only once, and the order of elements in the pair doesn't matter.
 * Array: [1, 2, 3, 4, 3, 2, 4]
    Target Sum: 6

    Unique pairs that sum to the target are:
[2, 4]
[3, 3]


 */
public class TargetSumUniquePairs_2 {

    static List<List<Integer>> twoSum(int[] arr, int target) {
        List<List<Integer>> result = new ArrayList<>();
        int left = 0;
        int right = arr.length - 1;
        Arrays.sort(arr);

        while (left < right) {

            if (left != 0 && arr[left] == arr[left - 1]) {
                left++;
                continue;
            }
            
          
            int sum = arr[left] + arr[right];

            if (sum == target) {
                result.add(Arrays.asList(arr[left], arr[right]));
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
        //int[] nums = {1, 2, 3, 4, 3};
        int[] nums = {1, 2, 3, 4, 3, 2, 4};
        // Call the twoSum function
        List<List<Integer>> pairs = twoSum(nums, 6);

        // Print the result
        System.out.println("Unique pairs that sum to the target are: ");
        for (List<Integer> pair : pairs) {
            System.out.println(pair);
        }

    }
}
