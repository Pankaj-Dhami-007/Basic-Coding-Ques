public class LargestNumber {
    static int findLargest(int arr[]){

        int max = 0;
        for(int i =0; i< arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int nums[] = {12, 33, 55, 1, 0, 55};
        System.out.println(findLargest(nums));
    }
}
