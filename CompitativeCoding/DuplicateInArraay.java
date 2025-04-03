
import java.util.HashSet;
import java.util.Set;

public class DuplicateInArraay {
    static boolean findDuplicate(int arr[]){
        for(int i = 0; i< arr.length; i++){
            int count =0;
            for(int j=0; j< arr.length; j++){
                if(arr[i] == arr[j]){
                    count++;
                }
            }
            if(count >= 2){
                return true;
            }
        }
        return false;
    }

    static boolean  findDuplicates(int arr[]){
        Set<Integer> unique = new HashSet<>();
        for(int i : arr){
            if(unique.contains(i)){
                return true;
            }
            else{
                unique.add(i);
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        System.out.println(findDuplicate(arr));
        System.out.println(findDuplicates(arr));
    }
}
