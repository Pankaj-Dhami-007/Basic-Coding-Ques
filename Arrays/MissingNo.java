public class MissingNo {
    static int findMissingNumber(int []arr){

        int actualLength = arr.length+1;
        int totalSum = actualLength*(actualLength+1)/2;
        int arrSum = 0;
        for(int i =0; i< arr.length; i++){
            arrSum = arrSum+arr[i];
        }
        return totalSum-arrSum;

    }
    public static void main(String[] args) {
        int num[] = {1, 2, 3, 5};
       System.out.println(findMissingNumber(num)+" is a missing No");
    }
}
