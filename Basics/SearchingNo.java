class SearchingNo{
    static int linearSearch(int[] arr, int target){
           for(int i =0; i<arr.length; i++){
            if(arr[i] == target){
                return i;
            }
           }
           return -1;
    }
    static void printArr(int[] arr){
        for(int i: arr){
            System.out.print(i+" ");
        }
    }
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 33, 22, 11};
        int index = linearSearch(nums, 22);
        if(index != -1){
            System.out.println("Search successfull "+nums[index]+" index "+index);
        }
        else{
            System.out.println("invalid input");
        }
    }
}