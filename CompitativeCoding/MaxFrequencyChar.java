
import java.util.HashMap;
import java.util.Map;

public class MaxFrequencyChar {
    static char mostFreqChar(String s){
        Map<Character, Integer> charCountMap = new HashMap<>();

          // Count occurrences of each character
         // for (char c : s.toCharArray()) {
           // charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        //}
        
        for(Character ch : s.toCharArray()){
            if(charCountMap.containsKey(ch)){
                charCountMap.put(ch, charCountMap.get(ch)+1);
            }
            else{
                charCountMap.put(ch, 1);
            }
        }
        // Variables to track the most frequent character
        char mostFrequentChar = 'z'; // Initialize with the largest lexicographical character
        int maxCount = 0;
        for(char ch : charCountMap.keySet()){
            int count = charCountMap.get(ch);
            if(count > maxCount || (count == maxCount && ch < mostFrequentChar)){
                mostFrequentChar = ch;
                maxCount= count;
            }
        }
        return mostFrequentChar;
    }
    static int findMaxFreq(String s){
       int count =0;
       int max = 0;
        for(int i =0; i< s.length(); i++){
            char ch = s.charAt(i);
            for(int j = 1; j< s.length(); j++){
                if(ch == s.charAt(j)){
                   count++;
                }
                if(count > max){
                    max = count;
                }
            }
        }
        return max;
    }
    public static void main(String[] args) {
        String str = "abccbaabb";
        String s = "abbc";
        System.out.println(findMaxFreq(str));
        System.out.println(mostFreqChar(str));
        System.out.println(mostFreqChar(s));
    }
}


/*
 * char mostFrequentChar = '\0'; // Initialize with null character
 * mostFrequentChar is initialized with '\0' (null character), which is smaller than any valid lowercase alphabet.
 */
