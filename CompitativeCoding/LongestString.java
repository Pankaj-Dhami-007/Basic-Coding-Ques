
import java.util.HashMap;
import java.util.Map;

public class LongestString {
    static String getLongestString(String arr[]){
        Map<String, Integer> map = new HashMap<>();
        for(String s : arr){
            map.put(s, s.length());
        }

        int maxLength =0;
        String longestString = "";
        for(String s : map.keySet()){
            if(map.get(s) > maxLength){
                maxLength = map.get(s);
                longestString = s;
            }
        }
        return longestString;
    }
    public static void main(String[] args) {
        String[] arr = {"apple", "banana", "orange", "kiwi", "strawberry"};
        System.out.println(getLongestString(arr));
    }
}
