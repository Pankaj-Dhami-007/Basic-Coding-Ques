
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.Collectors;

//It's used to convert different types of values (like int, char, boolean, object, etc.) into a string.
public class RDuplicateString {

    static String secondApproach(String str){
        return Arrays.asList(str.split("")).stream().distinct().collect(Collectors.joining());
        
    }
    static String removeDuplicates(String str){
        Set<Character> set = new LinkedHashSet<>();
        for(char ch : str.toCharArray()){
            set.add(ch);
        }

        StringBuilder sb = new StringBuilder();
        for(char ch : set){
            sb.append(ch);
        }

        return sb.toString();
    }
    public static void main(String[] args) {
        String input = "programming";
        System.out.println(removeDuplicates(input)); // Output: "progamin"

        System.out.println(secondApproach(input));

        String s = "Pankaj";
        System.out.println(s.split(""));
    }
}
