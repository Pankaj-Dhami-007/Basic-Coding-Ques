
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//rearrange an array with alternating positive and negative numbers

public class RearrangeArray {
    static void rearrange(int[] arr){
        List<Integer> pos = new ArrayList<>();
        List<Integer> neg = new ArrayList<>();

        for(int i : arr){
            if(i >= 0){
                pos.add(i);
            }
            else{
                neg.add(i);
            }
        }

        int i =0, p=0, n=0;
        while(p < pos.size() && n < neg.size()){
              arr[i++] =pos.get(p++);
              arr[i++] = neg.get(n++);
        }
        // Remaining positives
        while (p < pos.size()) {
            arr[i++] = pos.get(p++);
        }

        // Remaining negatives
        while (n < neg.size()) {
            arr[i++] = neg.get(n++);
        }
    }
    public static void main(String[] args) {
         int[] arr = {1, 2, 3, -4, -1, 4};
        rearrange(arr);

        System.out.println("Rearranged array:");
        System.out.println(Arrays.toString(arr));
    }
        public static void rearrange2(int[] arr) {
            int n = arr.length;
            int i = 0, j = 0;
    
            // Partition array: move all negatives to the end
            while (j < n) {
                if (arr[j] >= 0) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    i++;
                }
                j++;
            }
    
            // Now alternate positive and negative
            int pos = 0, neg = i;
    
            while (pos < neg && neg < n && arr[pos] >= 0) {
                int temp = arr[pos];
                arr[pos] = arr[neg];
                arr[neg] = temp;
                pos += 2;
                neg++;
            }
        }
    
}

/*
 approach -1.  
Separate into positive and negative lists, then merge them alternately.
Simple, readable.
Space: O(n)



 */
