
/*
 * entrySet():
 *  This method returns a Set of all entries in the HashMap, where each entry is a Map.Entry object containing a key and its associated value.

Map.Entry<Integer, Integer> entry: 
Represents a single entry from the HashMap, where entry.getKey() returns the key (the number from the array) and entry.getValue() returns the count of that number.

entry.getKey(): 
This retrieves the key from the entry (which is the number in the array).

entry.getValue():
 This retrieves the value from the entry (which is the count of occurrences of that number).
 */
import java.util.HashMap;
import java.util.Map;

public class NonRepeatValues {

    static void findNonRepeatValues(int arr[]) {
        Map<Integer, Integer> countMap = new HashMap<>();

        for (int num : arr) {
            if (countMap.containsKey(num)) {
                countMap.put(num, countMap.get(num) + 1);
            } else {
                countMap.put(num, 1);
            }
        }

        System.out.println(countMap);

        System.out.println("Non repeating values: ");

        // for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
        //     if (entry.getValue() == 1) {
        //         System.out.print(entry.getKey() + " ");
        //     }
        // }

        for(Integer key : countMap.keySet()){
            if(countMap.get(key) == 1){
                System.out.print(key+" ");
            }
        }

    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 2, 3, 4, 5, 5, 6, 6};
        findNonRepeatValues(nums);
    }
}
