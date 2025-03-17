
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;



public class FindContinuousSubArrSumEuqalsToK {
    static List<Integer> usingBruteForce(int arr[], int k){
        int n = arr.length;
        for(int i =0; i< n; i++){
            int currSum =0;
            for(int j=i; j< n; j++){
                currSum+= arr[j];

                if(currSum == k){
                     return Arrays.asList(i, j);
                }
            }
        }
        return null;
    }
    static List<Integer> optSolution(int arr[], int k){
        List<Integer> list = new ArrayList<>();
        list.add(-1);
        Map<Integer, Integer> map = new HashMap<>();
        int currSum =0;
        for(int i=0; i< arr.length; i++){
               currSum+= arr[i];
                // If the current sum equals the target, return from index 0 to i
            // if (currSum == k) {
            //     return Arrays.asList(0, i);
            // }
               int rem = currSum-k;
               if(map.containsKey(rem)){
                     int startingIndex = map.get(rem)+1;
                     list.set(0, startingIndex);
                     list.add(i);
                     break;
               }
               map.put(currSum, i);
        }
        return list;
    }
    public static void main(String[] args) {
        int[] arr = {3, -4, 5, 4, -1, 7, -8};
        int k = 8;
        List<Integer> result1 = usingBruteForce(arr, k);
        
        if (result1 != null) {
            System.out.println("Subarray found from index " + result1.get(0) + " to " + result1.get(1));
        } else {
            System.out.println("No subarray with sum equals to " + k);
        }
          System.out.println(result1);

        List<Integer> result2 = optSolution(arr, k);
        System.out.println(result2);
    }
}
