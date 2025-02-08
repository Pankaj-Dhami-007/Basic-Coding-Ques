
public class EvenOddCount {

    static int[] countEvenOdd(int arr[]) {
        int oddCount = 0;
        int evenCount = 0;
        for (int num : arr) {
            if (num % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        return new int[]{evenCount, oddCount};
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] count = countEvenOdd(array);
        System.out.println("even: "+count[0]+" odd: "+count[1]);

    }
}
