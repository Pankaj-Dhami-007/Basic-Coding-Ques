/*
 * An anagram is a word or phrase formed by rearranging the letters of another word or phrase, using all the original letters exactly once. For example, the word "listen" can be rearranged to form the word "silent." Both words use the same letters but in a different order.
 * This approach compares the two strings by counting how many times each letter appears and checking if the counts match. If they do, the strings are anagrams!
 * A = 65 and a = 97
 */

public class AnagramString {
    static boolean areAnagram(String str1, String str2) {
        if(str1.length() != str2.length()){
            return false;
        }

        int[] charCount = new int[256];
        for(int i =0; i< str1.length(); i++){
            charCount[str1.charAt(i)]++;
            charCount[str2.charAt(i)]--;
        }

        for(int count : charCount){
            if(count != 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        String str1 = "listen";
        String str2 = "silent";
        System.out.println(areAnagram(str1, str2));

        
    }
}
