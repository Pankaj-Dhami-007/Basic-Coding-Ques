public class SubArray_2 {
    // kadans algo
    static int subArrayMaxSum(int arr[]){

        int currSum =0;
        int maxSum = Integer.MIN_VALUE;
        for(int i =0; i< arr.length; i++){
            currSum+=arr[i];
            if(currSum> maxSum){
                maxSum = currSum;
            }
            if(currSum < 0){
                currSum =0;
            }
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int[] arr1 ={1, 2, 3, 4, 5};
        int[] arr2 ={3, -4, 5, 4, -1, 7, -8};
        int maxSum = subArrayMaxSum(arr2);
        System.out.println(maxSum);
    }
}
