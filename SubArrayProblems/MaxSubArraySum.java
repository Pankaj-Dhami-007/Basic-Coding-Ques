class MaxSubArraySum{
    static int kadansAlgo(int arr[]){
        int currSum =0;
        int maxSum = Integer.MIN_VALUE;
          for(int i=0; i< arr.length; i++){
               currSum+=arr[i];
               if(currSum> maxSum){
                maxSum=currSum;
               }
               if(currSum <0){
                currSum=0;
               }
          }
          return maxSum;
    }
    static int usingBruteForce(int arr[]){
        int n = arr.length;
        int maxSum = Integer.MIN_VALUE;
        for(int i =0; i< n; i++){
            int currSum =0;
            for(int j =i; j<n; j++){
                currSum+=arr[j];
                if(currSum > maxSum){
                    maxSum= currSum;
                }
                if(currSum < 0){
                    currSum =0;
                }
            }
            
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int[] arr = {3, -4, 5, 4, -1, 7, -8};
        System.out.println("Maximum subarray sum is: "+usingBruteForce(arr));
        System.out.println("Maximum subarray sum is: "+kadansAlgo(arr));
    }
}