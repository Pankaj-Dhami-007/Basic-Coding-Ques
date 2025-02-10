/*
 * Sorted sub-arrays come from the recursive division of the array into smaller pieces.
Merging happens after division, where two sorted sub-arrays are combined into a single sorted array.
The merging ensures that elements from two sub-arrays are compared, and a new sorted array is created.
 */

class MergeSortExample {

    static void merge(int[] arr, int start, int mid, int end) {

        int[] temp = new int[end - start +1];
        int idx1 = start;
        int idx2 = mid+1;

        int x =0;

        while (idx1 <= mid && idx2 <= end) { 
            if(arr[idx1] < arr[idx2]){
                temp[x++] = arr[idx1++];
            }
            else{
                temp[x++] = arr[idx2++];
            }
        }

        while(idx1 <= mid){
            temp[x++] = arr[idx1++];
        }

        while(idx2 <= end){
            temp[x++] = arr[idx2++];
        }

        for(int i=0, j= start; i< temp.length; i++, j++){
            arr[j] = temp[i];
        }

    }

    static void devide(int[] arr, int start, int end) {

        if(start>= end){
            return;
        }

        int mid = start + (end - start) / 2;
        if (start < end) {
            devide(arr, start, mid);
            devide(arr, mid+1, end);

            merge(arr, start, mid, end);
        }

    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; ++i) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {38, 27, 43, 3, 9, 82, 10};

        System.out.println("Given Array:");
        printArray(arr);

        devide(arr, 0, arr.length - 1);

        System.out.println("Sorted Array:");
        printArray(arr);
    }
}
