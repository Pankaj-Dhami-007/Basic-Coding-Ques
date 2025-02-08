public class SmallestNumber {
    static int findSmallest(int[] arr){
        int n = arr.length;
        int min = 10000;
        int index =0;
        for(int i =0; i< n; i++){
            if(arr[i] < min){
                min = arr[i];
                index = i;
            }
        }
        return index;
    }
    public static void main(String[] args) {
        int nums[] = {12, 33, 55, 1, 0, 55};
        System.out.println(findSmallest(nums));
    }
}
