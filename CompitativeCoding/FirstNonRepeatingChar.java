
import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatingChar {

    static char findFirstNonRepeatingChar(String str){
        Map<Character, Integer> countMap = new LinkedHashMap<>();

        for(char ch : str.toCharArray()){
            countMap.put(ch, countMap.getOrDefault(ch, 0)+1);
        }

        for(Map.Entry<Character, Integer> entry : countMap.entrySet()){

            if(entry.getValue() == 1){
                return entry.getKey();
            }
        }
        return '\0';
    }

    
    public static void main(String[] args) {
        String str = "swiss";
        System.out.println(findFirstNonRepeatingChar(str));
    }
}
