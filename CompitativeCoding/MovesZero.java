public class MovesZero {
    static int[] moveZeros(int[] arr){
        int nonZero = 0;
        for(int i=0; i< arr.length; i++){
            if(arr[i] != 0){
                arr[nonZero] = arr[i];
                nonZero++;
            }
        }
        for(int i = nonZero; i< arr.length; i++){
            arr[i] = 0;
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {0,0,1,2,3,0,5};
        int[] ans = moveZeros(arr);
        for(int i : ans){
            System.out.print(i+" ");
        }
    }
}
