public class MaxValueInArray {
    static int findMax(int[] arr, int i){
        if(i == arr.length-1) return arr[i];
        int smallAns = findMax(arr, i+1);
        return Math.max(smallAns, arr[i]);
    }
    public static void main(String[] args) {
        int arr[] = {2, 5, 3, 1};
        System.out.println(findMax(arr, 0));
    }
}
