
public class QuickSortExample {

    static int partition(int[] arr, int low, int high) {

        int pivot = arr[high];
        int i = low - 1;
        // Traverse through the array and rearrange elements
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++; // Increment the index of smaller element
                // Swap smaller element with current element
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        // Place the pivot in its correct position
        i++;
        int temp = arr[i];
        arr[i] = pivot;
        arr[high] = temp;

        return i;
    }

    static void quickSort(int[] arr, int low, int high) {

        if (low < high) {
            int pivotElement = partition(arr, low, high);
            quickSort(arr, low, pivotElement - 1);  // Sort left side
            quickSort(arr, pivotElement + 1, high); // Sort right side
        }

    }

    public static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] nums = {6, 3, 9, 5, 2, 8};
        quickSort(nums, 0, nums.length - 1);
        printArray(nums);
    }
}
