import java.util.HashMap;
import java.util.Map;

class TwoSumProblem{
    static int[] usingBruteForce(int[] arr, int target){

        for(int i =0; i< arr.length; i++){
            for(int j = i+1; j< arr.length; j++){
                if(arr[i] + arr[j] == target){
                    return new int[]{i, j};
                }
            }
        }
        return new int[0];
    }

    //using HashMap

    static int[] twoSum(int[] arr, int target){
        Map<Integer, Integer> map = new HashMap<>();
        for(int i =0; i< arr.length; i++){
            int num = arr[i];
            int diff = target- num;
            if(map.containsKey(diff)){
                return new int[]{map.get(diff), i};
            } else{
                map.put(num, i);
            }
        }
        return new int[0];

    }
    public static void main(String[] args) {
        int[] nums = {3, 4, 5, 6};
        int[] r = usingBruteForce(nums, 11);
        for(int num : r){
            System.out.print(num+" ");
        }

        // int[] r = twoSum(nums, 11);
        // for(int num : r){
        //     System.out.print(num+" ");
        // }
    }
}