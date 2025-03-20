public class SumOfArrayElements {
    static int sum(int[] arr, int i){

        if(i == arr.length){
            return 0;
        }
        int smallSum = sum(arr, i+1);
        return smallSum + arr[i];
    }
    public static void main(String[] args) {
        int[] arr ={1, 2, 3, 4, 5};
        System.out.println(sum(arr, 0));
    }
}
