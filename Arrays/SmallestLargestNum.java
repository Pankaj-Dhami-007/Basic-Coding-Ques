
public class SmallestLargestNum {

    static int[] findSmallestAndLargest(int arr[]) {
        // int max = Integer.MIN_VALUE;
        // int min = Integer.MAX_VALUE;
        int max = arr[0];
        int min = arr[0];
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        return new int[]{max, min};
    }

    public static void main(String[] args) {
        int[] array = {5, 2, 9, 1, 6, 3};
        int[] result = findSmallestAndLargest(array);
        System.out.println("Smallest element: " + result[1]);
        System.out.println("Largest element: " + result[0]);
    }
}
