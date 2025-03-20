public class FindIndicesForX {
    static void bruteForce(int arr[], int x){
        int n = arr.length;
        for(int i =0; i< n; i++){
            if(arr[i] == x){
                System.out.print(i+" ");
            }
        }

    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 2, 4, 5, 2, 3};
        bruteForce(arr, 2);

    }
}
