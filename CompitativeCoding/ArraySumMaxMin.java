public class ArraySumMaxMin {
    static int findSumOfSecondLargestAndSmallest(int[] arr){

        int largest = Integer.MIN_VALUE;
        int smallest= Integer.MAX_VALUE;
        int secondLargest= Integer.MIN_VALUE;

        for(int i =0; i< arr.length; i++){
            if(arr[i] > largest){
                largest = arr[i];
            }
            if(arr[i] < smallest){
                smallest = arr[i];
            }
        }

        for(int i =0; i< arr.length; i++){
           if(arr[i] > secondLargest && arr[i] < largest){
            secondLargest = arr[i];
           }
        }
        return  secondLargest+smallest;
    }
    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 1, 9, 4};
        int sum = findSumOfSecondLargestAndSmallest(arr);
        System.out.println("Sum of the second largest and smallest element: " + sum);

    }
}
