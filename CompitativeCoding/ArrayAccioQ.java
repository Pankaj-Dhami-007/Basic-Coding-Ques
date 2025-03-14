import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ArrayAccioQ {
    static int optimizedSolution(int arr[]){
        Map<Integer,Integer> map = new HashMap<>();
        for(int i : arr){
            if(map.containsKey(i)){
                map.put(i, map.get(i)+1);
            }
            else{
                map.put(i, 1);
            }
        }
        for(int i : arr){
            if(map.get(i) == 1){
                return i;
            }
        }
        return -1;
    }

    static int findOnyOneOccurence(int arr[]){
        
           for(int i =0; i< arr.length; i++){
            int count =0;
            for(int j =i; j< arr.length; j++){
                if(arr[i] == arr[j]) count++;
            }
            if(count == 1) return  arr[i];
            
           }
           return -1;
    }
    static void solution(Scanner sc){
         // code
         System.out.println("Enter any no: ");
         int n = sc.nextInt();
         int arr[] = new int[n];
         for(int i =0; i< n; i++){
            arr[i] = sc.nextInt();
         }
         System.out.println(findOnyOneOccurence(arr));
         System.out.println(optimizedSolution(arr));

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        solution(sc);
        
    }
}
