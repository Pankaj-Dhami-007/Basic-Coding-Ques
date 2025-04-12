
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

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

    static void firstNonRepeatingLetter(String s){
        int freq[] = new int[26];
        Queue<Character> q = new LinkedList<>();
        for(int i =0; i< s.length(); i++){
            char ch = s.charAt(i);
            q.add(ch);
            freq[ch - 'a']++;
            while (!q.isEmpty() && freq[q.peek() - 'a'] > 1) {
                q.remove();
            }
            if(q.isEmpty()){
                System.out.println("-1");
            }
            else{
                System.out.println(q.peek());
            }
        }
    }
    public static void main(String[] args) {
        String str1 = "swiss";
        String str2 = "aabccxb";
        System.out.println(findFirstNonRepeatingChar(str1));
        System.out.println(findFirstNonRepeatingChar(str2));
        firstNonRepeatingLetter(str2);
        System.out.println();
        System.out.println('a' - 'b');
    }
}
