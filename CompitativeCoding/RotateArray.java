public class RotateArray {
    static void reverse(int arr[], int start, int end){
        
       while (start < end) { 
           int temp = arr[start];
           arr[start] = arr[end];
           arr[end] = temp;
           start++;
           end--;
       }
    }
    static int[] rotate(int arr[], int k){

        reverse(arr, k, arr.length-1);
        reverse(arr, 0, k-1);
        reverse(arr, 0, arr.length-1);
        return arr;
    }
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        int[] ans = rotate(nums, k);
        for(int i : ans){
            System.out.print(i+" ");
        }
    }
}
