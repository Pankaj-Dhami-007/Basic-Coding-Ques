public class RemoveDuplicateSortedArr {

    static int removeDuplicate(int[] arr){
        if(arr.length == 0) return 0;
        int curr = arr[0];
        int updateIndex = 1;
        for(int i= 1; i< arr.length; i++){
            if(curr != arr[i]){
                arr[updateIndex] = arr[i];
                curr = arr[i];
                updateIndex++;
            }
        }
        return updateIndex;
    }
    public static void main(String[] args) {
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 55};
        int l =  removeDuplicate(nums);

        for(int i =0; i< nums.length; i++){
            System.out.print(nums[i]+" ");
          }
          System.out.println();
      for(int i =0; i< l; i++){
        System.out.print(nums[i]+" ");
      }
    }
}
