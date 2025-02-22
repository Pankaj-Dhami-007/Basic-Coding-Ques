import java.util.HashSet;

class ContainsDuplicate{
    static boolean containDuplicate(int arr[]){
        HashSet<Integer> set = new HashSet<>();
        for(int i : arr){
               if(set.contains(i)){
                   return true;
               }
               else{
                set.add(i);
               }
               
        }
        return false;
    }
    public static void main(String[] args) {
        int[] nums = {11, 12, 13, 11, 22, 33};
        int[] x = {1, 2, 3, 4, 5, 6 ,7};

        System.out.println(containDuplicate(x));
        System.out.println(containDuplicate(nums));
    }
}