public class SearchInArray {
    static int findIndex(int arr[], int target, int i){
        if(i >= arr.length) return  -1;
        if(arr[i] == target) return i;
        return findIndex(arr, target, i+1);
    }
    static boolean search(int arr[], int target, int i){
        if(i >= arr.length){
            return false;
        }
        if(arr[i] == target){
            return true;
        }
        boolean smallAns = search(arr, target, i+1);
        return smallAns;
    }
    public static void main(String[] args) {
        int arr[] = {2, 5, 3, 9, 7};
        System.out.println(search(arr, 73, 0));
        System.out.println(findIndex(arr, 7, 0));
    }
}
