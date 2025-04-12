
import java.util.HashMap;
import java.util.Map;

class DucatComQ{

    static void printPattern(int n){

        for(int i =n; i>=1; i--){
            for(int j = 1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int j = 1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static int find(int arr[]){

        int n = arr.length;
        Map<Integer, Integer> map = new HashMap<>();
        for(int num : arr){
            map.put(num, map.getOrDefault(num, 0)+1);
        }

        for(int key : map.keySet()){
            if(map.get(key) > n/2){
                return key;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
         int arr[] = {7, 7, 2, 2, 7, 3, 4, 5, 7, 7, 7};
         System.out.println(find(arr));
         int n =5;
         printPattern(n);
    }
}