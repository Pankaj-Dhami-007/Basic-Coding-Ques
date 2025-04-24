
public class xyz {
    static int removeDuplicates(int arr[]) {
        
        int currIndex =0;
        for(int j =1; j< arr.length; j++){
            if(arr[j] != arr[currIndex]){
                currIndex++;
                arr[currIndex] = arr[j];       
            }
        }
        return currIndex+1;
    }

    public static void main(String[] args) {
        int nums[] = {1, 2, 2, 3, 3, 4, 5};
        int[] arr = {1, 1, 2, 2, 2, 3, 4, 4, 5};
        int length = removeDuplicates(arr);

        System.out.print("Array after removing duplicates: ");
        for (int i = 0; i < length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}