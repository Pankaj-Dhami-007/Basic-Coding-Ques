public class PrintArray {
    static void print(int arr[], int i){
        if(i == arr.length) return;
        System.out.print(arr[i]+" ");
        print(arr, i+1);
    }
    public static void main(String[] args) {
        int arr[] = {2, 3, 7, 5};
        int i =0;
        print(arr, i);
    }
}
