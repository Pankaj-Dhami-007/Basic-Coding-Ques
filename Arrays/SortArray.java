/*
 * Sort an array without using in-built method
 */

public class SortArray {
    static void selectionSortDec(int []arr){
        for(int i =0; i< arr.length -1; i++){
            int maxIndex = i;
            for(int j = i+1; j< arr.length; j++){
                if(arr[j] > arr[maxIndex]){
                    maxIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[maxIndex];
            arr[maxIndex] = temp;
        }
    }
    static void selectionSortAsc(int[] num){

        for(int i =0; i< num.length-1; i++){
            int minIdx = i;
            for(int j = i+1; j< num.length; j++){
               if (num[j] < num[minIdx]) {
                   minIdx = j;
               }
            }
            int temp = num[i];
            num[i] = num[minIdx];
            num[minIdx] = temp;

        }
    }

    static void printArray(int arr[]){
        for(int i=0; i< arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int []nums = {5, 6, 7, 4, 3, 2, 1};
        selectionSortAsc(nums);
        printArray(nums);
        selectionSortDec(nums);
        printArray(nums);
    }
}
