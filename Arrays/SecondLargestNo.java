public class SecondLargestNo {

    static int findSecondMax(int arr[]){
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for(int num : arr){
            if(num > max){
                secondMax = max;
                max = num;
            }
            else if(num > secondMax && num < max){
                secondMax= num;
            }
        }
        return secondMax;
    }
    static int findSecondLargest(int arr[]){

        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
       for(int num : arr){
        if(num > max){
            max = num;
        }
       }
       for(int num : arr){
        if(num> secondMax && num< max){
            secondMax= num;
        }
       }
       return secondMax;
    }
    
    public static void main(String[] args) {
        int num[] = {12, 33, 55, 1, 0, 55};
        System.out.println(findSecondLargest(num));
    }
}
